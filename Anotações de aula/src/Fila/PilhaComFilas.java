package Fila;

import Pilha.empilhavel;

public class PilhaComFilas implements empilhavel {
    private enfileiravel p1;
    private enfileiravel aux;

    public PilhaComFilas() {
        this(10);
    }

    public PilhaComFilas(int tamanho) {
        p1 = new filaEstaticaCircular(tamanho);
        aux = new filaEstaticaCircular(tamanho);
    }

    @Override
    public Object espiar() {

        Object auxr = null;
        if (!p1.estaVazia()) {
            auxr = p1.frente();
        } else {
            System.err.println("A pila está vazia");
        }
        return auxr;

    }

    @Override
    public void empilhar(Object dado) {
        if (!p1.estaCheia()) {
            while (!p1.estaVazia()) {
                aux.enfileirar(p1.desenfileirar());
            }
            p1.enfileirar(dado);
            while (!aux.estaVazia()) {
                p1.enfileirar(aux.desenfileirar());
            }
        } else {
            System.err.println("A pilha está cheia");
        }
    }

    @Override
    public Object desempilhar() {
        Object auxr = null;
        if (!p1.estaVazia()) {
            auxr = p1.desenfileirar();
        } else {
            System.err.println("A pilah está vazia");
        }
        return auxr;
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
    public void atualizar(Object dado) {
        p1.atualizarInicio(dado);
    }

    @Override
    public String imprimir() {
        return p1.imprimir();
    }

}
