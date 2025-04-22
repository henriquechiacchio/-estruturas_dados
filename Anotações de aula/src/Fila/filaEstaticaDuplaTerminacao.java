package Fila;

public class filaEstaticaDuplaTerminacao implements duplameneteEnfileravel {
    private int ponteiroInicio;
    private int ponteiroFim;
    private Object[] dados;
    private int quantidade;

    public filaEstaticaDuplaTerminacao(int tamanho) {
        ponteiroInicio = 0;
        ponteiroFim = -1;
        quantidade = 0;
        dados = new Object[tamanho];
    }

    public filaEstaticaDuplaTerminacao() {
        this(10);
    }

    @Override
    public void enfileirarFim(Object dado) {
        if (!estaCheia()) {
            ponteiroFim = avancar(ponteiroFim);
            dados[ponteiroFim] = dado;
            quantidade++;
        } else {
            System.err.println("Queue is full!");
        }
    }

    @Override
    public Object desenfileirarInicio() {
        Object dadoInicio = null;
        if (!estaVazia()) {
            dadoInicio = dados[ponteiroInicio];
            ponteiroInicio = avancar(ponteiroInicio);
            quantidade--;
        } else {
            System.err.println("Queue is empty!");
        }
        return dadoInicio;
    }

    @Override
    public Object frente() {
        Object dadoInicio = null;
        if (!estaVazia())
            dadoInicio = dados[ponteiroInicio];
        else
            System.err.println("Fila Vazia!");

        return dadoInicio;
    }

    @Override
    public void enfileirarInicio(Object dado) {
        if (!estaCheia()) {
            ponteiroInicio = retroceder(ponteiroInicio);
            dados[ponteiroInicio] = dado;
            quantidade++;
        } else {
            System.err.println("Queue is full!");
        }
    }

    @Override
    public Object desenfileirarFim() {
        Object dadoFim = null;
        if (!estaVazia()) {
            dadoFim = dados[ponteiroFim];
            ponteiroFim = retroceder(ponteiroFim);
            quantidade--;
        } else {
            System.err.println("Queue is empty!");
        }
        return dadoFim;
    }

    @Override
    public Object tras() {
        Object dadoFim = null;
        if (!estaVazia()) {
            dadoFim = dados[ponteiroFim];
        } else {
            System.err.println("Fila Vazia!");
        }
        return dadoFim;
    }

    @Override
    public void atualizarInicio(Object dado) {
        if (!estaVazia()) {
            dados[ponteiroInicio] = dado;
        } else {
            System.err.println("Queue is empty!");
        }
    }

    @Override
    public void atualizarFim(Object dado) {
        if (!estaVazia()) {
            dados[ponteiroFim] = dado;
        } else {
            System.err.println("Queue is empty!");
        }
    }

    @Override
    public boolean estaCheia() {
        return (quantidade == dados.length);
    }

    @Override
    public boolean estaVazia() {
        return (quantidade == 0);
    }

    @Override
    public String imprimirDeFrentePraTras() {
        String retorno = "[";
        int ponteiroAux = ponteiroInicio;
        for (int i = 0; i < quantidade; i++) {
            retorno += dados[ponteiroAux];
            if (i != quantidade - 1)
                retorno += ",";

            ponteiroAux = avancar(ponteiroAux);
        }
        return retorno + "]";
    }

    @Override
    public String imprimirDeTrasPraFrente() {
        String retorno = "[";
        int ponteiroAux = ponteiroFim;
        for (int i = 0; i < quantidade; i++) {
            retorno += dados[ponteiroAux];
            if (i != quantidade - 1)
                retorno += ",";

            ponteiroAux = retroceder(ponteiroAux);
        }
        return retorno + "]";
    }

    private int avancar(int ponteiro) {
        return (ponteiro + 1) % dados.length;
    }

    private int retroceder(int ponteiro) {
        return ((ponteiro - 1) + dados.length) % dados.length;
    }
}
