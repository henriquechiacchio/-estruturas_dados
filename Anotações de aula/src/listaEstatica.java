public class listaEstatica implements listavel {

    private Object[] dados;
    private int ponteiroinicio, ponteiroFinal, quantidade;

    public listaEstatica() {
        this(10);
    }

    public listaEstatica(int tamanho) {
        dados = new Object[tamanho];
        ponteiroinicio = 0;
        ponteiroFinal = -1;
        quantidade = 0;
    }

    @Override
    public void inserir(Object dado, int indice) {
        if (!estaCheia()) {
            if (indice > 0 && indice <= quantidade + 1) {
                int x, y;
                if ((quantidade != 0)) {
                    if (!(mapeamento(indice) > ponteiroFinal)) {
                        if (mapeamento(indice) < (quantidade / 2)) {
                            x = ponteiroinicio;
                            y = retroceder(x);
                            for (int i = 0; i < indice; i++) {
                                dados[y] = dados[x];
                                x = avancar(x);
                                y = avancar(y);

                            }
                            dados[mapeamento(indice)] = dado;
                            retroceder(ponteiroinicio);
                        } else {
                            x = ponteiroFinal;
                            y = avancar(x);
                            for (int i = 0; i < indice; i++) {
                                dados[y] = dados[x];
                                x = retroceder(x);
                                y = retroceder(y);
                            }
                            dados[mapeamento(indice)] = dado;
                            avancar(ponteiroFinal);
                        }
                    } else {
                        dados[ponteiroFinal + 1] = dado;
                    }
                } else {
                    dados[ponteiroinicio] = dado;
                }
            } else {
                System.err.println("Indice invslido");
            }
            quantidade++;
            ponteiroFinal++;
        } else {
            System.err.println("A lista esta vazia");
        }

    }

    @Override
    public void anexar(Object dado) {
        if (!estaCheia()) {
            avancar(ponteiroFinal);
            quantidade++;
            dados[ponteiroFinal] = dado;
        } else {
            System.err.println("A lista esta cheia");
        }

    }

    @Override
    public Object selecionar(int indice) {
        Object auxr = null;
        if (!estaVazia()) {
            if (indice > 0 && indice <= quantidade + 1) {
                int ponteiroFisico = mapeamento(indice);
                auxr = dados[ponteiroFisico];
            } else {
                System.err.println("Indice invalido!");
            }
        } else {
            System.err.println("A lista está vazia");
        }
        return auxr;
    }

    @Override
    public Object[] selecionarTodos() {
        Object[] auxr = null;
        if (!estaVazia()) {
            auxr = new Object[quantidade];
            int p1, p2;
            for (int indice = ponteiroinicio; indice < ponteiroinicio + quantidade; indice++) {
                p1 = indice % dados.length;
                p2 = indice - ponteiroinicio;
                auxr[p2] = dados[p1];
            }
        }
        return auxr;
    }


    @Override
    public void atualizar(Object dado, int indice) {
        if (!estaVazia()) {
            if (0 < indice && indice <= quantidade) {
                dados[mapeamento(indice)] = dado;
            } else {
                System.err.println("indice invalido");
            }
        } else {
            System.err.println("A lista esta vazia");
        }
    }

    @Override
    public Object apagar(int indice) {
        Object auxr = null;
        int x, y;
        if (!estaVazia()) {
            if (indice > 0 && indice <= quantidade) {
                auxr = dados[mapeamento(indice)];
                x = mapeamento(indice);
                if (mapeamento(indice) < (quantidade / 2)) {
                    y = retroceder(x);
                    for (int i = 0; i < indice; i++) {
                        dados[x] = dados[y];
                        x = retroceder(x);
                        y = retroceder(y);
                        ponteiroinicio++;
                    }
                } else {
                    y = avancar(x);
                    for (int i = 0; i < quantidade - indice; i++) {
                        dados[y] = dados[x];
                        x = avancar(x);
                        y = avancar(y);
                        ponteiroFinal--;
                    }
                }
                quantidade--;
            } else {
                System.err.println("Indice invalido");
            }
        } else {
            System.err.println("Lista vazia");
        }
        return auxr;
    }

        /*if (!estaVazia()){
            if (indice > 0 && indice <= quantidade) {
                auxr = dados[mapeamento(indice)];
                int x = mapeamento(indice);
                int y = avancar(x);
                for (int i = 0; i < quantidade-indice ; i++){
                    dados[x] = dados[y];
                    x = avancar(x);
                    y = avancar(y);

                }
                quantidade--;
                ponteiroFinal = retroceder(ponteiroFinal);
            }
        }
        return auxr;*/
    // opção simples do apagar

    @Override
    public Object[] limpar() {
        Object[] auxr = null;
        if (!(quantidade == 0)) {
            auxr = new Object[quantidade];
            int posicaoLista, posicaoNova;
            for (int indice = ponteiroinicio; indice < ponteiroinicio + quantidade; indice++) {
                posicaoLista = indice % dados.length;
                posicaoNova = indice - ponteiroinicio;
                auxr[posicaoNova] = dados[posicaoLista];
            }
            quantidade = 0;
            ponteiroinicio = 0;
            ponteiroFinal = -1;
        } else {
            System.err.println("Lista vazia");
        }
        return auxr;
    }

    @Override
    public boolean contem(Object dado) {
        boolean auxr = false;
        if (!estaVazia()) {
            for (int i = ponteiroinicio; i < quantidade + ponteiroinicio; i++) {
                if (dados[i] == dado) {
                    auxr = true;
                    break;
                }
            }
        } else {
            System.err.println("Lista vazia");
        }
        return auxr;
    }

    public int primeiraOcorrencia(Object dado) {
        int ponteiroLocal = -1;
        if (!estaVazia()) {
            for (int i = ponteiroinicio; i < quantidade + ponteiroinicio; i++) {
                if (dados[i] == dado) {
                    ponteiroLocal = i - ponteiroinicio;
                    break;
                }
            }
            if (ponteiroLocal == -1) {
                System.out.println("Este dado não está contido na lista");
            }
        } else {
            System.err.println("Lista vazia");
        }
        return ponteiroLocal;

    }

    @Override
    public boolean estaVazia() {
        return (quantidade == 0);
    }

    @Override
    public boolean estaCheia() {
        return (quantidade == dados.length);
    }

    @Override
    public String imprimir() {
        String aux = "[";
        for (int i = ponteiroinicio; i < quantidade + ponteiroinicio; i++) {

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

            if (i == quantidade + ponteiroinicio - 1) {
                aux += dados[i % dados.length];
            } else {
                aux += dados[i % dados.length] + ", ";
            }
        }
        return aux + "]";
    }

    int mapeamento(int logico) {
        return (logico + ponteiroinicio - 1) % dados.length;
    }

    int avancar(int indice) {
        return (indice + 1) % dados.length;
    }

    boolean comparador(Object dado) {
        return false;
    }

    int retroceder(int indice) {
        return ((indice - 1) + dados.length) % dados.length;
    }
}
