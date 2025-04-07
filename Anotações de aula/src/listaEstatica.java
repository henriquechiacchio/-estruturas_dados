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
    public void inserir(Object dado, int indice) {

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
        return null;
    }

    @Override
    public Object[] selecionarTodos() {
        Object[] aux = new Object[dados.length];
        for (int i = 0; i < dados.length; i ++){
            aux[i] = dados[i];
        } return aux;
    }

    int mapeamento (int logico){
        return (logico+ponteiroinicio)%dados.length;
    }

    @Override
    public void atualizar(Object dado, int indice) {
    if (!estaVazia()){
        if (0 <= indice && indice < quantidade){
            int ponteiroFisico=mapeamento(indice);
            dados[ponteiroFisico]=dados;
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
        if (!(quantidade==0)){
            int ponteiroFisico = mapeamento(indice);
            auxr = dados[ponteiroFisico];
            quantidade--;

        } else {
            System.err.println("A lista está vazia");
        }
        return null;

    }

    @Override
    public Object[] limpar() {
        Object[] auxr = new Object[dados.length];
        if (!(quantidade==0)){
            for (int i = 0; i <= quantidade; i++){
                auxr[i] = dados[i];
            }
            quantidade = 0;
        } else {
            System.err.println("A lista está vazia");
        }
        return auxr;
    }

    @Override
    public boolean contem(Object dado) {
        return false;
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
}
