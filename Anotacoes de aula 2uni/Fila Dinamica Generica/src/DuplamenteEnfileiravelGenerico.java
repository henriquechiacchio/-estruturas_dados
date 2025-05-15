/**
 * Interface que delimitas todos os metodos necessarios para uma classe
 * que pode se enfileirar
 *
 * @param <T> tipo generico que sera enfileirado
 * @author Chiacchio H, R, B
 * @version 1.0
 * @since 2025 05 12
 */

public interface DuplamenteEnfileiravelGenerico<T> {

    /**
     * Metodo que enfileira um dado no inicio da fila
     *
     * @param dado, dado que será enfileirado
     */
    void enfileirarInicio(T dado);

    /**
     * Metodo que enfileira um dado ao fim da fila
     *
     * @param dado, dado que será enfileirado
     */
    void enfileirarFim(T dado);

    /**
     * Metodo que desinfileira um dado no inicio da fila
     *
     * @return T, tipo do dado que será retornado
     */
    T desinfileirarinicio();

    /**
     * Metodo que desinfileira um dado no fim da fila
     *
     * @return T, tipo do dado que será retornado
     */
    T desinfileirarFim();

    /**
     * Metodo que retorna o dado no inicio da fila
     *
     * @return T, dado no inico da fila
     */
    T espiarinicio();

    /**
     * Metodo que retorna o dado no fim da fila
     *
     * @return T, dado no fim da fila
     */
    T espiarFim();

    /**
     * Metodo que verfica se a fila está lotada
     *
     * @return true, quando cheia, false do contrario
     */
    boolean estaCheio();

    /**
     * Metodo que verifica se a fila está vazia
     *
     * @return true, quando vazia, false do contrario
     */
    boolean estaVazia();

    /**
     * Metodo que atualiza o inicio da fila
     *
     * @param dado, novo dado que será inserido
     */
    void atualizarInicio(T dado);

    /**
     * Metodo que atualiza o fim da fila
     *
     * @param dado, novo dado que será inserido
     */
    void atualizarFim(T dado);

    /**
     * Metodo que retorna um texto com todos os dados da fila do Inicio ao fim
     *
     * @return String, String que contem o texto
     */

    String imprimirInicioFim();

    /**
     * Metodo que retorna um texto com todos os dados da fila do fim ao inicio
     *
     * @return String, String que contem o texto
     */
    String imprimirFimInicio();

    /**
     * Getter do tamanho maximo da fila
     *
     * @return int, tamanho maximo
     */
    int getTamanho();

    /**
     * Getter da quantidade atual da fila
     *
     * @return int, quantidade atual
     */
    int getQuantidade();


}
