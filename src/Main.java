public class Main {
    public static void main(String[] args) {

        /*empilhavel p = new pilhaEstaticaInvertida(7);
        p.empilhar("intituto");
        p.empilhar("federal");
        System.out.println("Espiar:" + p.espiar());
        p.empilhar("de");
        p.empilhar("educação");
        p.empilhar("ciencia");
        p.empilhar("e");
        System.out.println("Espiar:" + p.espiar());
        Object conteudo = p.desempilhar();
        p.desempilhar();
        p.empilhar("tecnologia");
        p.empilhar("da");
        p.empilhar("Bahia");
        p.empilhar(p.desempilhar());
        p.empilhar(conteudo);
        System.out.println("Pilha: " + p.imprimir());*/
        //Aula 2

        enfileiravel f = new filaEstaticaCircular();
        f.enfileirar(1);
        f.enfileirar(2);
        f.enfileirar(3);
        f.enfileirar(4);
        f.enfileirar(5);
        f.enfileirar(6);
        f.enfileirar(7);
        f.enfileirar(8);
        f.enfileirar(9);
        f.enfileirar(10);
        System.out.println(f.imprimir());
        //Colocar teste do git

    }
}