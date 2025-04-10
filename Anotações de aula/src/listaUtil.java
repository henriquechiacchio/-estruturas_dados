import java.util.Arrays;

public class listaUtil {
    public static void main (String[] args){
        listavel l1 = new listaEstatica();
        l1.inserir(0, 1);
        System.out.println(l1.imprimir());
        l1.inserir(1, 2);
        System.out.println(l1.imprimir());
        l1.inserir(2, 3);
        System.out.println(l1.imprimir());
        l1.inserir(3, 4);
        System.out.println(l1.imprimir());
        l1.inserir(4, 5);
        System.out.println(l1.imprimir());
        l1.inserir(5, 3);
        System.out.println(l1.imprimir());
        l1.atualizar(6, 1);
        System.out.println("Atualizar: " + l1.imprimir());
        l1.apagar(1);
        System.out.println(l1.imprimir());
        l1.apagar(5);
        System.out.println(l1.imprimir());
        l1.primeiraOcorrencia(2);
        l1.anexar(10);
        System.out.println("Anexar: " + l1.imprimir());
        System.out.println("Selecionar: " + l1.selecionar(3));
        Object[] l2;
        l2 = l1.selecionarTodos();
        listavel l3 = new listaEstatica();
        System.out.println("Selecionar Todos: " + Arrays.toString(l2));

        l1.limpar();
        System.out.println("Limpar" + l1.imprimir());
    }
}
