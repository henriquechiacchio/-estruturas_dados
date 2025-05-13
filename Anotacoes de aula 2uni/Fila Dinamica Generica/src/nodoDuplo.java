/**
 * Classe base para estrutura de dados para classe dinamicas
 *
 * @author Chiacchio, H, R, B
 * @version 1.0
 * @since 2025 05 05
 */

public class nodoDuplo<T> {

    private nodoDuplo<T> anterior;
    private T dado;
    private nodoDuplo<T> proximo;

    public nodoDuplo(T dado){
        this.dado = dado;
        anterior = null;
        proximo = null;
    }

    /**
     * Getter dado
     *
     * @return T, Retorno generico do dado
     */

    public T getDado() {
        return dado;
    }


    /**
     * Getter do ponteiro do do dado anterior
     *
     * @return nodoDuplo<T>, retorno do ponteiro dado anterior
     */

    public nodoDuplo<T> getAnterior() {
        return anterior;
    }

    /**
     * Getter do proximo ponteiro dos dados
     *
     * @return nodoDuplo<T>, retorno do ponteiro do proximo dado
     */

    public nodoDuplo<T> getProximo() {
        return proximo;
    }

    /**
     * Setter do ponterio do dado anterior
     *
     * @param anterior, ponteiro do dado que será alocado
     */

    public void setAnterior(nodoDuplo<T> anterior) {
        this.anterior = anterior;
    }

    /**
     * Setter do ponteiro do proximo dado
     *
     * @param proximo, ponteiro do dado que será alocado
     */
    public void setProximo(nodoDuplo<T> proximo) {
        this.proximo = proximo;
    }

    /**
     * Setter do dado
     *
     * @param dado, Dado que será alocado
     */

    public void setDado(T dado) {
        this.dado = dado;
    }
}
