package Pilha;

public class pilhaEstaticaInvertida implements empilhavel {
    //variaveis de instacia
    private Object[] dados;
    private int ponteiroTopo;

    //metodos
    //construtores
    public pilhaEstaticaInvertida() {
        dados = new Object[10];
        ponteiroTopo = 10; //ponteirotopo aponta para o ultimo dado registrado na pilha
        //this(10) é uma forma melhor de contruir o codigo
    }

    public pilhaEstaticaInvertida(int tamIni) {
        dados = new Object[tamIni];
        ponteiroTopo = tamIni;
    }

    //metodos principals

    @Override
    public Object espiar() {
        Object aux = null;
        if (!estaVazia()) {
            aux = dados[ponteiroTopo];
        } else {
            System.err.println("Stack is empty");
        }
        return aux;
    }


    @Override
    public void atualizar(Object dado) {
        if (!estaVazia()) {
            dados[ponteiroTopo] = dado;
        } else {
            System.err.println("Stack is empty");
        }

    }

    @Override
    public Object desempilhar() {
        Object aux = null;
        if (!estaVazia()) {
            aux = dados[ponteiroTopo];
            ponteiroTopo++;
        } else {
            System.err.println("Stack is empty");
        }
        return aux;
        //Desnecessario apagar o dado, pois quando atribuir ele sera descatardo
    }


    @Override
    public void empilhar(Object dado) {
        if (!estaCheia()) {
            ponteiroTopo--;
            dados[ponteiroTopo] = dado;
        } else {
            System.err.println("Stack is full");
        }
        ;
    }

    //metodos auxiliares

    @Override
    public boolean estaCheia() {
        return (ponteiroTopo == 0);
    }

    @Override
    public boolean estaVazia() {
        return (ponteiroTopo == dados.length);
    }

    @Override
    public String imprimir() {
        String aux = "[";
        for (int i=ponteiroTopo; i <= 0; i++){
            if (i == ponteiroTopo){
                aux += dados[i];
            } else {
                aux +=dados[i] + ",";
            }
        }
        return aux + "]";
    }
}
