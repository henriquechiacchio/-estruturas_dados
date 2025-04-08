public class listaEstatica implements listavel{

    private Object[] dados;
    private int ponteiroinicio, ponteiroFinal, quantidade;

    public listaEstatica() {this(10);}
    public listaEstatica(int tamanho){
        dados = new Object[tamanho];
        ponteiroinicio=0;
        ponteiroFinal=-1;
        quantidade=0;
    }
    @Override
    public void inserir(Object dado, int indice){
        if (!estaCheia()) {
            if (indice >= 0 && indice <= quantidade) {

            }
        }

    }

    @Override
    public void anexar(Object dado) {
        if (!estaCheia()){
            ponteiroFinal = (ponteiroFinal + 1)%dados.length;
            quantidade++;
            dados[ponteiroFinal]=dado;
        } else {
            System.err.println("A lista esta cheia");
        }

    }

    @Override
    public Object selecionar(int indice) {
        Object auxr = null;
        if (!estaVazia()) {
            if (indice > 0 && indice <= quantidade) {
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
        if (!estaVazia()){
        auxr = new Object[quantidade];
        int p1, p2;
            for (int indice = ponteiroinicio; indice < ponteiroinicio+quantidade; indice++){
               p1=indice%dados.length;
               p2=indice-ponteiroinicio;
               auxr[p2] = dados[p1];
            }
        }
        return auxr;
    }


    @Override
    public void atualizar(Object dado, int indice) {
        if (!estaVazia()) {
            if (0 < indice && indice <= quantidade) {
                int ponteiroFisico = mapeamento(indice);
                dados[ponteiroFisico] = dados;
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
        if (!estaVazia()){
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
        return auxr;
    }

    @Override
    public Object[] limpar() {
        Object[] auxr = null;
        if (!(quantidade==0)){
            auxr = new Object[quantidade];
            int p1, p2;
            for (int indice = ponteiroinicio; indice < ponteiroinicio+quantidade; indice++){
                p1=indice%dados.length;
                p2=indice-ponteiroinicio;
                auxr[p2] = dados[p1];
            }
            quantidade=0;
            ponteiroinicio=0;
            ponteiroFinal=-1;
        } else {
            System.err.println("Lista vazia");
        }
        return auxr;
    }

    @Override
    public boolean contem(Object dado) {
        return false;
    }

    public int primeiraOcorrencia (Object dado){
        if (!estaVazia()){
            for (int i = ponteiroinicio; i < quantidade + ponteiroinicio; i++){


            }
        }

    }

    @Override
    public boolean estaVazia() {
        return (quantidade==0);
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
                aux += dados[i%dados.length];
            } else {
                aux += dados[i% dados.length] + ", ";

            }

        }
        return aux + "]";
}

    int mapeamento (int logico){
        return (logico+ponteiroinicio-1)%dados.length;
    }

    int avancar (int indice){
        return (indice+1) % dados.length;
    }

    boolean comparador (Object dado){

    }

    int retroceder(int indice){
        return ((indice-1) + dados.length) % dados.length;
    }
}
