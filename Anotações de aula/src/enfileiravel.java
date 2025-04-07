
//Aula 03 24/03/25

//Fila (Queue)
//Fila circular (Cycle Queue)
//Fila com dupla terminação (DeQue)

public interface enfileiravel {

    void enfileirar (Object Dado);
    Object frente();
    void atualizarInicio(Object dado);
    void atualizarFim(Object Dado);
    Object desenfileirar();

    boolean estaCheia();
    boolean estaVazia();
    String imprimir();



}
