package Pilha;

public class pilhaUtil {
    public static void main(String[] args) {
        empilhavel p = new pilhaEstaticaInvertida(7);

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

        System.out.println("Pilha: " + p.imprimir());

        empilhavel p1 = new pilhaEstatica(7);

        p1.empilhar("intituto");
        p1.empilhar("federal");
        System.out.println("Espiar:" + p1.espiar());
        p1.empilhar("de");
        p1.empilhar("educação");
        p1.empilhar("ciencia");
        p1.empilhar("e");

        System.out.println("Espiar:" + p1.espiar());

        Object conteudo2 = p1.desempilhar();
        p1.desempilhar();
        p1.empilhar("tecnologia");
        p1.empilhar("da");
        p1.empilhar("Bahia");
        p1.empilhar(p.desempilhar());
        p1.empilhar(conteudo);

        System.out.println("Pilha: " + p1.imprimir());
    }
}
