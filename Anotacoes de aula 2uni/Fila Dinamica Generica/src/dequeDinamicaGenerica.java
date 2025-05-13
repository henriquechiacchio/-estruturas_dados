import java.util.NoSuchElementException;

/**
 * Classe de uma fila dinamica de tipo generico
 *
 * @param <T>, tipo generico da fila
 * @author Chiacchio H R B
 * @version 1.0
 * @since 2025 05 12
 */

public class dequeDinamicaGenerica<T>
        implements DuplamenteEnfileiravelGenerico<T> {
    private nodoDuplo<T> ponteiroInicio;
    private nodoDuplo<T> ponteiroFim;
    private int quantidade;
    private int tamanho;

    /**
     * Construtor vazio
     */

    public dequeDinamicaGenerica() {
        this(10);
    }

    /**
     * Construtor da fila
     *
     * @param MAX, tamanho maximo da fila
     */

    public dequeDinamicaGenerica(int MAX) {
        this.quantidade = 0;
        this.tamanho = MAX;
        this.ponteiroFim = null;
        this.ponteiroInicio = null;
    }

    @Override
    public void enfileirarInicio(T dado) {
        if (estaCheio()) {
            throw new NoSuchElementException("FILA CHEIA");
        }
        nodoDuplo<T> novoNodo = new nodoDuplo<>(dado);
        novoNodo.setProximo(ponteiroInicio);
        if (!(estaVazia())) {
            ponteiroInicio.setAnterior(novoNodo);
        } else {
            ponteiroFim = novoNodo;
        }
        ponteiroInicio = novoNodo;
        quantidade++;
    }

    @Override
    public void enfileirarFim(T dado) {
        if (estaCheio()) {
            throw new NoSuchElementException("FILA CHEIA");
        }

        nodoDuplo<T> novoNodo = new nodoDuplo<>(dado);
        novoNodo.setAnterior(ponteiroFim);
        if (!(estaVazia())) {
            ponteiroFim.setProximo(novoNodo);
        } else {
            ponteiroInicio = novoNodo;
        }
        ponteiroFim = novoNodo;
        quantidade++;

    }

    @Override
    public T desinfileirarinicio() {
        if (estaVazia()) {
            throw new NoSuchElementException("FILA VAZIA");
        }
        T aux;
        aux = ponteiroInicio.getDado();
        ponteiroInicio = ponteiroInicio.getProximo();
        ponteiroInicio.setAnterior(null);
        quantidade--;

        return aux;
    }

    @Override
    public T desinfileirarFim() {
        if (estaVazia()) {
            throw new NoSuchElementException("FILA VAZIA");
        }
        T aux;
        aux = ponteiroFim.getDado();
        ponteiroFim = ponteiroFim.getAnterior();
        ponteiroFim.setProximo(null);
        quantidade--;

        return aux;
    }

    @Override
    public T espiarinicio() {
        if (!(estaVazia())) {
            return ponteiroInicio.getDado();
        }
        throw new NoSuchElementException("FILA VAZIA");
    }

    @Override
    public T espiarFim() {
        if (!(estaVazia())) {
            return ponteiroFim.getDado();
        }
        throw new NoSuchElementException("FILA VAZIA");
    }

    @Override
    public boolean estaCheio() {
        return quantidade == tamanho;
    }

    @Override
    public boolean estaVazia() {
        return quantidade == 0;
    }

    @Override
    public void atualizarInicio(T dado) {
        if (estaVazia()) {
            throw new NoSuchElementException("FILA VAZIA");
        }
        ponteiroInicio.setDado(dado);

    }

    @Override
    public void atualizarFim(T dado) {
        if (estaVazia()) {
            throw new NoSuchElementException("FILA VAZIA");
        }
        ponteiroInicio.setDado(dado);
    }

    @Override
    public String imprimirInicioFim() {
        String auxr = "[ ";
        nodoDuplo<T> aux = ponteiroInicio;
        for (int i = 0; i < quantidade; i++) {
            auxr += aux.getDado();
            if ((i != quantidade - 1)) {
                auxr += ", ";
            }

            aux = aux.getProximo();
        }
        return auxr += "] ";
    }

    @Override
    public String imprimirFimInicio() {
        String auxr = "[ ";
        nodoDuplo<T> aux = ponteiroFim;
        for (int i = 0; i < quantidade; i++) {
            auxr += aux.getDado();
            if ((i != quantidade - 1)) {
                auxr += ", ";
            }

            aux = aux.getAnterior();
        }
        return auxr += "] ";
    }

}
