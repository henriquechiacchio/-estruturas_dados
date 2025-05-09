package Fila;

public class filaUtil {
    public static void main(String[] args) {

        enfileiravel f = new filaEstaticaCircular();
        f.enfileirar(1);
        System.out.println(f.imprimir());

        f.enfileirar(2);
        System.out.println(f.imprimir());

        f.enfileirar(3);
        System.out.println(f.imprimir());

        f.enfileirar(4);
        System.out.println(f.imprimir());

        f.enfileirar(5);
        System.out.println(f.imprimir());

        f.enfileirar(6);
        System.out.println(f.imprimir());

        f.enfileirar(7);
        System.out.println(f.imprimir());

        f.desenfileirar();
        f.atualizarFim(1);
        System.out.println(f.imprimir());

        f.enfileirar(8);
        System.out.println(f.imprimir());

        f.enfileirar(9);
        System.out.println(f.imprimir());

        f.enfileirar(10);
        System.out.println(f.imprimir());

        duplameneteEnfileravel f1 = new filaEstaticaDuplaTerminacao();

        f1.enfileirarInicio(1);
        System.out.println(f1.imprimirDeFrentePraTras());

        f1.enfileirarInicio(2);
        System.out.println(f1.imprimirDeFrentePraTras());

        f1.enfileirarInicio(3);
        System.out.println(f1.imprimirDeFrentePraTras());

        f1.enfileirarInicio(4);
        System.out.println(f1.imprimirDeFrentePraTras());

        f1.enfileirarInicio(5);
        System.out.println(f1.imprimirDeFrentePraTras());

        f1.enfileirarFim(6);
        System.out.println(f1.imprimirDeFrentePraTras());

        f1.enfileirarFim(7);
        System.out.println(f1.imprimirDeFrentePraTras());

        f1.enfileirarFim(8);
        System.out.println(f1.imprimirDeFrentePraTras());

        f1.enfileirarFim(9);
        System.out.println(f1.imprimirDeFrentePraTras());

        f1.enfileirarFim(10);
        System.out.println(f1.imprimirDeFrentePraTras());

        System.out.println(f1.imprimirDeTrasPraFrente());

        f1.desenfileirarFim();

        f1.desenfileirarInicio();

        System.out.println(f1.imprimirDeTrasPraFrente());
        System.out.println(f1.imprimirDeFrentePraTras());

    }
}
