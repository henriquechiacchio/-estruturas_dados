package Lista;

//Toda fila e pilha são listas
public interface listavel {

    void inserir(Object dado, int indice); //C insert

    void anexar(Object dado); //C Append (Coloca ao final)

    Object selecionar(int indice); //R selection

    Object[] selecionarTodos(); //R selectionAll

    void atualizar(Object dado, int indice); //U update

    Object apagar(int indice); //D delete

    Object[] limpar(); //D

    boolean contem(Object dado); //S

    //Extras
    int primeiraOcorrencia(Object Dado); //S

    //int ultimaOcorrencia(Object Dado); //S

    //metodos auxiliares
    boolean estaVazia();

    boolean estaCheia();

    String imprimir();

    //Listas são contiguas, não tem buraco



}