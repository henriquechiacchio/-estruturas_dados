package Fila;

public class filaEstaticaCircular implements enfileiravel {

    private Object dados[];
    private int ponteiroInicio, ponteiroFim, quant;

    public filaEstaticaCircular() {
        this(10);
    }

    public filaEstaticaCircular(int tamanho) {
        dados = new Object[tamanho];
        ponteiroInicio = 0;
        ponteiroFim = -1;
        quant = 0;
    }

    @Override
    public void enfileirar(Object Dado) {
        if (!estaCheia()) {
            ponteiroFim = (ponteiroFim + 1) % dados.length;
            quant++;
            dados[ponteiroFim] = Dado;
        } else {
            System.err.println("A fila esta cheia");
        }

    }

    @Override
    public Object desenfileirar() {
        Object aux = null;
        if (!estaVazia()) {
            aux = dados[ponteiroInicio];
            ponteiroInicio = (ponteiroInicio + 1) % dados.length;
            quant--;
        } else {
            System.err.println("A fila esta vazia");
        }
        return aux;
    }

    @Override
    public Object frente() {
        Object aux = null;
        if (!estaVazia()) {
            aux = dados[ponteiroInicio];
        } else {
            System.err.println("A fila esta vazia");
        }
        return aux;
    }

    @Override
    public void atualizarInicio(Object dado) {
        if (!estaVazia()) {
            dados[ponteiroInicio] = dado;
        } else {
            System.err.println("A fila esta vazia");
        }

    }

    @Override
    public void atualizarFim(Object Dado) {
        if (!estaVazia()) {
            dados[ponteiroFim] = Dado;
        } else {
            System.err.println("A fila esta vazia");
        }

    }

    @Override
    public boolean estaCheia() {
        return (quant == dados.length);
    }

    @Override
    public boolean estaVazia() {
        return (quant == 0);
    }

    @Override
    public String imprimir() {
        String aux = "[";
        for (int i = ponteiroInicio; i < quant + ponteiroInicio; i++) {
            /*if (i == dados.length) {
                i = 0;
            }
            if (i == ponteiroFim) {
                aux += dados[ponteiroInicio];
            }
            else {
                aux += dados[ponteiroInicio] + ", ";
            }
            return aux + "]";*/
            //Opção 1

            if (i == quant + ponteiroInicio - 1) {
                aux += dados[i % dados.length];
            } else {
                aux += dados[i % dados.length] + ", ";

            }

        }
        return aux + "]";
    }
}
