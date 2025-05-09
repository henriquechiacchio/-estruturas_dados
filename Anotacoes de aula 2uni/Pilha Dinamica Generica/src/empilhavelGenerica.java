/**
 * Esta interface indica as operações que uma classe que deseja ter o comportameto de ser
 * Empilhavel deve ter
 *
 * @author Chiacchio, H, R, B,
 * @version 1.1
 * @since 2025-05-05
 */


public interface empilhavelGenerica<T> {

    /**
     * Metodo que inseri um dado na pilha
     *
     * @param dado, Dado a ser inserido
     */
    void empilhar(T dado);

    /**
     * Metodo que retorna o topo da pilha
     *
     * @return T, Dado de de retorno generico
     */
    T espiar();

    /**
     * Metodo que retira um dado da pilha e o retorna
     *
     * @return T, Dado retirado da pilha
     */
    T desempilhar();

    /**
     * Metodo que verifica se a pilha está cheia
     *
     * @return true, caso esteja cheia, false do contrario
     */
    boolean estaCheia();

    /**
     * Metodo que verifica se a pilha esta vaiza
     *
     * @return true, caso esteja cheia, false do contrario
     */
    boolean estaVazia();

    /**
     * Metodo que retorna um texto contendo todos os dados da pilha,
     * do ultimo ao primeiro
     *
     * @return String, texto contendo todos os dados
     */
    String imprimir();

    /**
     * Metodo que atualza o dado do topo da pilha
     *
     * @param dado, dado que substituira o anterior
     */

    void atualizar(T dado);


}
