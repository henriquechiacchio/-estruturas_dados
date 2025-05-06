package Fila;//Fila não utilizavel, acaba ao percorrer o array todo

public class filaEstatica implements enfileiravel {

    private Object dados[];
    private int ponteiroInicio, ponteiroFim;

    public filaEstatica() {
        this(10);
    }

    public filaEstatica(int tamanho) {
        dados = new Object[tamanho];
        ponteiroInicio = 0;
        ponteiroFim = -1;
    }

    @Override
    public void enfileirar(Object Dado) {
        if (!estaCheia()) {
            ponteiroFim++;
            dados[ponteiroFim] = Dado;
        } else {
            System.err.println("A fila esta cheia");
        }

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
    public void atualizarInicio(Object Dado) {
        if (!estaVazia()) {
            dados[ponteiroInicio] = Dado;
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
    public Object desenfileirar() {
        Object aux = null;
        if (!estaVazia()) {
            aux = dados[ponteiroInicio];
            ponteiroInicio++;
        } else {
            System.err.println("A fila esta vazia");
        }
        return aux;
    }

    @Override
    public boolean estaCheia() {
        return (ponteiroFim == dados.length - 1);

    }

    @Override
    public boolean estaVazia() {
        return (ponteiroFim == ponteiroInicio - 1);
    }

    @Override
    public String imprimir() {
        String aux = "[";
        for (int i = ponteiroInicio; i <= ponteiroFim; i++) {
            if (i == ponteiroFim) {
                aux += dados[i];
            } else {
                aux += dados[i] + ", ";
            }
        }
        return aux;
    }
}
