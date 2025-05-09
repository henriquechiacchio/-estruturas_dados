import java.util.NoSuchElementException;

/**
 * Classe implementa uma pilha de dados genericos, do estilo FIFO
 *
 * @author Chiacchio H, R, B
 * @version 1.0
 * @since 2025 05 05
 */


public class pilhaDinamicaGenerica<T> implements empilhavelGenerica<T> {


    private nodoDuplo<T> ponteiroTopo;
    private Integer quantidade;
    private Integer tamanhoMax;

    /**
     * Construtor vazio
     */
    public pilhaDinamicaGenerica() {
        this(10);
    }

    /**
     * Construtor base
     *
     * @param tamanho, indica o tamanho maximo que a pilha pode ter
     */

    public pilhaDinamicaGenerica(int tamanho) {
        this.tamanhoMax = tamanho;
        this.quantidade = 0;
        this.ponteiroTopo = null;
    }

    /**
     * Empilha um dado na pilha
     *
     * @param dado, dado que sera empilhado
     * @throws NoSuchElementException, Exceção lançada quando a pilha está cheia
     */

    @Override
    public void empilhar(T dado) {
        if (estaCheia()) {
            throw new NoSuchElementException("Pilha cheia");
        }
        nodoDuplo<T> aux = new nodoDuplo<>();
        aux.setDado(dado);
        aux.setAnterior(ponteiroTopo);
        if ((!estaVazia())) {
            ponteiroTopo.setProximo(aux);
        }
        ponteiroTopo = aux;
        quantidade++;

    }

    /**
     * Retira o ultimo elemtno inserido na pilha e o retorna
     *
     * @return T, Dado retirado da pilha
     * @throws NoSuchElementException, Exceção lançada caso pilha esteja vazia
     */

    @Override
    public T desempilhar() {
        if (estaVazia()) {
            throw new NoSuchElementException("Pilha vazia!");
        }
        T aux = ponteiroTopo.getDado();
        ponteiroTopo = ponteiroTopo.getAnterior();
        quantidade--;
        if (quantidade == 0) {
            return aux;
        }
        ponteiroTopo.setProximo(null);
        return aux;
    }

    /**
     * Retorna um retorno generico que está no topo da pilha
     *
     * @return T, retorno generico
     * @throws NoSuchElementException, Exceção lançada casoa  pilha esteja vazia
     */

    @Override
    public T espiar() {
        if (estaVazia()) {
            throw new NoSuchElementException("Pilha vazia!");
        }
        return ponteiroTopo.getDado();
    }

    /**
     * Verifica se esta cheia
     *
     * @return true, caso cheia, false do contrario
     */

    @Override
    public boolean estaCheia() {
        return (quantidade == tamanhoMax);
    }

    /**
     * Verifica se a pilha esta vazia
     *
     * @return true, se estiver, false, do contrario
     */

    @Override
    public boolean estaVazia() {
        return (quantidade == 0);
    }


    /**
     * Forma uma String com todos os dados empilhados
     *
     * @return String, retorna uma String concatenada de todos os dados
     * empilhados, do ultimo ao primerio
     */

    @Override
    public String imprimir() {
        String auxr = "[";
        nodoDuplo<T> aux = ponteiroTopo;

        for (int i = quantidade; i > 0; i--) {
            auxr += "" + aux.getDado();
            if (i != 1) {
                auxr += ",";
            }
            aux = aux.getAnterior();
        }
        return auxr + "]";
    }

    /**
     * Sobrescreve o ultimo elem,ento inserido da pilha
     *
     * @param dado, dado que sobscrevera o topo anteriro
     * @throws NoSuchElementException, Exceção lançada quando a pilha está vazia
     */


    @Override
    public void atualizar(T dado) {
        if (estaVazia()) {
            throw new NoSuchElementException("Pilha Vazia!");
        }
        ponteiroTopo.setDado(dado);

    }

}
