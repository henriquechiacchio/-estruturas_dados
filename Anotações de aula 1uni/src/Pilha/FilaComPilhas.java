package Pilha;

import Fila.enfileiravel;

public class FilaComPilhas implements enfileiravel {

    private empilhavel p1;
    private empilhavel p2;

    public FilaComPilhas() {
        this(10);
    }

    public FilaComPilhas(int tamanho) {
        p1 = new pilhaEstatica(tamanho);
        p2 = new pilhaEstatica(tamanho);
    }

    @Override
    public void enfileirar(Object Dado) {
        p1.empilhar(Dado);
    }

    @Override
    public Object desenfileirar() {
        Object aux;
        if (!p1.estaVazia()) {
            while (!p1.estaVazia()) {
                p2.empilhar(p1.desempilhar());
            }
            aux = p2.desempilhar();
            while (!p2.estaVazia()) {
                p1.empilhar(p2.desempilhar());
            }
        } else {
            aux = null;
            System.err.println("A fila esta vazia");
        }
        return aux;
    }

    @Override
    public Object frente() {
        Object aux;
        if (!p1.estaVazia()) {
            while (!p1.estaVazia()) {
                p2.empilhar(p1.desempilhar());
            }
            aux = p2.espiar();
            while (!p2.estaVazia()) {
                p1.empilhar(p2.desempilhar());
            }
        } else {
            aux = null;
            System.err.println("A fila esta vazia");
        }

        return aux;
    }

    @Override
    public void atualizarInicio(Object dado) {
        if (!p1.estaVazia()) {
            while (!p1.estaVazia()) {
                p2.empilhar(p1.desempilhar());
            }
            p2.atualizar(dado);
            while (!p2.estaVazia()) {
                p1.empilhar(p2.desempilhar());
            }
        } else {
            System.err.println("A fila esta vazia");
        }

    }

    @Override
    public void atualizarFim(Object Dado) {
        p1.atualizar(Dado);
    }

    @Override
    public boolean estaCheia() {
        return p1.estaCheia();
    }

    @Override
    public boolean estaVazia() {
        return p1.estaVazia();
    }

    @Override
    public String imprimir() {
        String aux;
        while (!p1.estaVazia()) {
            p2.empilhar(p1.desempilhar());
        }
        aux = p2.imprimir();
        while (!p2.estaVazia()) {
            p1.empilhar(p2.desempilhar());
        }

        return aux;
    }
}
