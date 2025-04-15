package Pilha;

public interface empilhavel {
    Object espiar();
    Object desempilhar();
    boolean estaCheia();
    boolean estaVazia();
    String imprimir();
    void atualizar (Object dado);
    void empilhar (Object dado);
}
