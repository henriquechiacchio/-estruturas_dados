package Pilha;

public class pilhaEstatica implements empilhavel {
    //variaveis de instacia
    private Object[] dados;
    private int ponteiroTopo;

    //metodos
    //construtores
    public pilhaEstatica() {
        dados = new Object[10];
        ponteiroTopo = -1; //ponteirotopo aponta para o ultimo dado registrado na pilha
        //this(10) é uma forma melhor de contruir o codigo
    }

    public pilhaEstatica(int tamIni) {
        dados = new Object[tamIni];
        ponteiroTopo = -1;
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
            ponteiroTopo--;
        } else {
            System.err.println("Stack is empty");
        }
        return aux;
        //Desnecessario apagar o dado, pois quando atribuir ele sera descatardo
    }


    @Override
    public void empilhar(Object dado) {
        if (!estaCheia()) {
            ponteiroTopo++;
            dados[ponteiroTopo] = dado;
        } else {
            System.err.println("Stack is full");
        }
        ;
    }

    //metodos auxiliares

    @Override
    public boolean estaCheia() {
        return (ponteiroTopo == dados.length - 1);
    }

    @Override
    public boolean estaVazia() {
        return (ponteiroTopo == -1);
    }

    @Override
    public String imprimir() {
        String aux = "[";
        for (int i = ponteiroTopo; i >= 0; i--) {
            aux += dados[i];
        }
        return aux + "]";
    }
}
