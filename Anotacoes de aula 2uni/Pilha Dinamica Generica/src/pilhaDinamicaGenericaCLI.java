/**
 * CLI para a utilização e demonstração da aplicabilidade da ED (estrutura de dados)
 * pilha dinamica generica
 *
 * @author Chiaccchio H, R, B
 * @version 1.0
 * @since 2025 05 06
 */


import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class pilhaDinamicaGenericaCLI {
    public static int MAX;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int controle = 0;
        String auxr;

        System.out.println("Defina o tamanho maximo da pilha: ");
        empilhavelGenerica<String> p1 = new pilhaDinamicaGenerica<String>(MAX = sc.nextInt());

        do {
            exibirMenu();
            try {
                controle = sc.nextInt();
                sc.nextLine(); //retira o newspace


                switch (controle) {
                    case 0:
                        System.out.println("Encerrando Main");
                        break;

                    case 1:
                        System.out.print("Digite o dado: ");
                        auxr = sc.nextLine();

                        try {
                            p1.empilhar(auxr);
                        } catch (NoSuchElementException e) {
                            System.err.println("Pilha cheia! tente novamente");
                        }
                        break;

                    case 2:
                        try {
                            auxr = p1.desempilhar();
                            System.out.println("Dado desempilhado: " + auxr);
                        } catch (NoSuchElementException e) {
                            System.err.println("Pilha vazia! tente novamente");
                        }
                        break;

                    case 3:
                        try {
                            auxr = p1.espiar();
                            System.out.println("Dado espiado: " + auxr);
                        } catch (NoSuchElementException e) {
                            System.err.println("pilha vazia! tente novamente");
                        }
                        break;

                    case 4:
                        System.out.print("Novo dado: ");
                        auxr = sc.nextLine();
                        try {
                            p1.atualizar(auxr);
                        } catch (NoSuchElementException e) {
                            System.err.println("Pilha vazia, tente novamente");
                        }
                        break;

                    case 5:
                        System.out.println(p1.imprimir());
                        break;

                    default:
                        System.out.println("Indice invalido, tente novamente");
                }
            } catch (InputMismatchException e) {
                System.err.println("Entrada invalida! tente invalido");
                sc.nextLine();
                controle = -1;
            }

        } while ((controle != 0));

    }

    public static void exibirMenu() {
        System.out.println("--------------PILHA DINAMICA----------");
        System.out.println("-------------(String MAX: " + MAX + ")-------------");
        System.out.println(" ");
        System.out.println("0 - Encerrar programa");
        System.out.println("1 - Empilhar");
        System.out.println("2 - Desempilhar");
        System.out.println("3 - Espiar");
        System.out.println("4 - Atualizar");
        System.out.println("5 - Imprimir");
        System.out.print("Executar: ");
    }

}
