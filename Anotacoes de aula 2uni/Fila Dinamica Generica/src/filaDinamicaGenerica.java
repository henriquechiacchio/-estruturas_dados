import java.util.NoSuchElementException;

/**
 * Classe de uma fila dinamica de tipo generico
 *
 * @param <T>, tipo generico da fila
 * @author Chiacchio H, R, B
 * @version 1.0
 * @since 2025 05 12
 */

public class filaDinamicaGenerica<T>
        implements DuplamenteEnfileiravelGenerico<T> {
    private nodoDuplo<T> ponteiroInicio;
    private nodoDuplo<T> ponteiroFim;
    private int quantidade;
    private int tamanho;

    /**
     * Construtor vazio
     */

    public filaDinamicaGenerica() {
        this(10);
    }

    /**
     * Construtor da fila
     *
     * @param MAX, tamanho maximo da fila
     */

    public filaDinamicaGenerica(int MAX) {
        this.quantidade = 0;
        this.tamanho = MAX;
        this.ponteiroFim = null;
        this.ponteiroInicio = null;
    }

    /**
     * NÃO IMPLEMENTADO
     */

    @Override
    public void enfileirarInicio(T dado) throws UnsupportedOperationException {
        throw new UnsupportedOperationException("OPERAÇÂO NÃO SUPORTADA");

    }

    /**
     * Metodo que enfileira um dado ao fim da fila
     *
     * @param dado, dado que será enfileirado
     */

    @Override
    public void enfileirarFim(T dado) {
        if (estaCheio()) {
            throw new NoSuchElementException("FILA CHEIA");
        }

        nodoDuplo<T> novoNodo = new nodoDuplo<>();
        novoNodo.setDado(dado);
        if (!(estaVazia())) {
            ponteiroFim.setProximo(novoNodo);
        } else {
            ponteiroInicio = novoNodo;
        }
        novoNodo.setAnterior(ponteiroFim);
        ponteiroFim = novoNodo;
        quantidade++;

    }

    /**
     * Metodo que desinfileira um dado no inicio da fila
     *
     * @return T, tipo do dado que será retornado
     */

    @Override
    public T desinfileirarinicio() {
        if (estaVazia()) {
            throw new NoSuchElementException("FILA VAZIA");
        }
        T aux = ponteiroInicio.getDado();
        ponteiroInicio = ponteiroInicio.getProximo();
        quantidade--;
        if (!estaVazia()) {
            ponteiroInicio.setAnterior(null);
        } else {
            ponteiroFim = null;
        }

        return aux;
    }

    /**
     * NÃO IMPLEMENTADO
     */

    @Override
    public T desinfileirarFim() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("OPERAÇÃO NÃO SUPORTADA");
    }

    /**
     * Metodo que retorna o dado no inicio da fila
     *
     * @return T, dado no inico da fila
     */

    @Override
    public T espiarinicio() {
        if (!(estaVazia())) {
            return ponteiroInicio.getDado();
        }
        throw new NoSuchElementException("FILA VAZIA");
    }

    /**
     * Metodo que retorna o dado no fim da fila
     *
     * @return T, dado no fim da fila
     */

    @Override
    public T espiarFim() {
        if (!(estaVazia())) {
            return ponteiroFim.getDado();
        }
        throw new NoSuchElementException("FILA VAZIA");
    }

    /**
     * Metodo que verfica se a fila está lotada
     *
     * @return true, quando cheia, false do contrario
     */

    @Override
    public boolean estaCheio() {
        return quantidade == tamanho;
    }

    /**
     * Metodo que verifica se a fila está vazia
     *
     * @return true, quando vazia, false do contrario
     */

    @Override
    public boolean estaVazia() {
        return quantidade == 0;
    }

    /**
     * Metodo que atualiza o inicio da fila
     *
     * @param dado, novo dado que será inserido
     */

    @Override
    public void atualizarInicio(T dado) {
        if (estaVazia()) {
            throw new NoSuchElementException("FILA VAZIA");
        }
        ponteiroInicio.setDado(dado);

    }

    /**
     * Metodo que atualiza o fim da fila
     *
     * @param dado, novo dado que será inserido
     */

    @Override
    public void atualizarFim(T dado) {
        if (estaVazia()) {
            throw new NoSuchElementException("FILA VAZIA");
        }
        ponteiroFim.setDado(dado);
    }

    /**
     * Metodo que retorna um texto com todos os dados da fila do Inicio ao fim
     *
     * @return String, String que contem o texto
     */


    @Override
    public String imprimirInicioFim() {
        String auxr = "[";
        nodoDuplo<T> aux = ponteiroInicio;
        for (int i = 0; i < quantidade; i++) {
            auxr += aux.getDado();
            if ((i != quantidade - 1)) {
                auxr += ", ";
            }

            aux = aux.getProximo();
        }
        return auxr += "]";
    }

    /**
     * NÃO IMPLEMENTADO
     */

    @Override
    public String imprimirFimInicio() throws UnsupportedOperationException {
        throw new UnsupportedOperationException("OPERAÇÃO NÂO SUPORTADA");
    }

    /**
     * Getter do tamanho maximo da fila
     *
     * @return int, tamanho maximo
     */

    @Override
    public int getQuantidade() {
        return this.quantidade;
    }

    /**
     * Getter da quantidade atual da fila
     *
     * @return int, quantidade atual
     */

    @Override
    public int getTamanho() {
        return this.tamanho;
    }

}
