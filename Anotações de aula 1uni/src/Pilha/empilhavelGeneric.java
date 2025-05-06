package Pilha;

/*
 * Esta interface indica as operações que uma classe que deseja ter o comportameto de ser
 * Empilhavel
 *
 * @author Chiacchio, H, R, B,
 * @version 1.1
 * @since 2025-05-05
 *
 */


public interface empilhavelGeneric<T> {
    T espiar();

    T desempilhar();

    boolean estaCheia();

    boolean estaVazia();

    String imprimir();

    void atualizar(T dado);

    void empilhar(T dado);
}
