/**
 * Classe main para exibiçãod o menu em CLi da Deque Dinamica Generica
 *
 * @author Chiacchio H, R, B
 * @version 1.0
 * @since 2025 05 12
 */

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class dequeDinamicaGenericaMainCLI {


    public static void main(String[] args) {
        int controle = 0;
        String auxr = "";
        Scanner sc = new Scanner(System.in);

        System.out.print("INSIRA O TAMANHO MAXIMO DA FILA:  ");
        controle = sc.nextInt();
        DuplamenteEnfileiravelGenerico<String> f1 = new dequeDinamicaGenerica<>(controle);
        controle = -1;

        do {
            try {
                exibirMenu(f1);
                controle = sc.nextInt();
                sc.nextLine();

                switch (controle) {
                    case 0:
                        System.out.println("ENCERRANDO PROGRAMA, ATÉ MAIS!");
                        break;

                    case 1:
                        System.out.println("ENFILEIRAR INICIO(1) OU FIM(2) ?");
                        System.out.print("DIGITE: ");
                        controle = sc.nextInt();
                        sc.nextLine();
                        System.out.print("DADO: ");
                        auxr = sc.nextLine();
                        if (controle == 1) {
                            try {
                                f1.enfileirarInicio(auxr);
                            } catch (NoSuchElementException e) {
                                System.out.println(e.getMessage());
                            }

                        } else if (controle == 2) {
                            try {
                                f1.enfileirarFim(auxr);
                            } catch (NoSuchElementException e) {
                                System.out.println(e.getMessage());
                            }

                        } else {
                            System.out.println("INDICE INVALIDO, TENTE NOVAMENTE");
                        }
                        controle = -1;
                        break;


                    case 2:
                        System.out.println("DESINFILEIRAR INICIO(1) OU FIM(2) ?");
                        System.out.print("DIGITE: ");
                        controle = sc.nextInt();
                        sc.nextLine();
                        if (controle == 1) {
                            try {
                                auxr = f1.desinfileirarinicio();
                                System.out.println("DADO RETIRADO: " + auxr);
                            } catch (NoSuchElementException e) {
                                System.out.println(e.getMessage());
                            }

                        } else if (controle == 2) {
                            try {
                                auxr = f1.desinfileirarFim();
                                System.out.println("DADO RETIRADO: " + auxr);
                            } catch (NoSuchElementException e) {
                                System.out.println(e.getMessage());
                            }

                        } else {
                            System.out.println("INDICE INVALIDO, TENTE NOVAMENTE");
                        }
                        controle = -1;
                        break;


                    case 3:
                        System.out.println("ESPIAR INICIO(1) OU FIM(2) ?");
                        System.out.print("DIGITE: ");
                        controle = sc.nextInt();
                        sc.nextLine();
                        if (controle == 1) {
                            try {
                                auxr = f1.espiarinicio();
                            } catch (NoSuchElementException e) {
                                System.out.println(e.getMessage());
                            }
                            System.out.println("DADO NO INICIO: " + auxr);
                        } else if (controle == 2) {
                            try {
                                auxr = f1.espiarFim();
                            } catch (NoSuchElementException e) {
                                System.out.println(e.getMessage());
                            }
                            System.out.println("DADO NO FIM: " + auxr);
                        } else {
                            System.out.println("INDICE INVALIDO, TENTE NOVAMENTE");
                        }
                        controle = -1;
                        break;

                    case 4:
                        System.out.println("ATUALIZAR INICIO(1) OU FIM(2) ?");
                        System.out.print("DIGITE: ");
                        controle = sc.nextInt();
                        sc.nextLine();
                        System.out.print("NOVO DADO: ");
                        auxr = sc.nextLine();

                        if (controle == 1) {
                            try {
                                f1.atualizarInicio(auxr);
                            } catch (NoSuchElementException e) {
                                System.out.println(e.getMessage());

                            }
                        } else if (controle == 2) {
                            try {
                                f1.atualizarFim(auxr);
                            } catch (NoSuchElementException e) {
                                System.out.println(e.getMessage());
                            }
                        } else {
                            System.out.println("INDICE INVALIDO, TENTE NOVAMENTE");
                        }
                        controle = -1;
                        break;

                    case 5:
                        System.out.println("IMPRIMIR DO INICIO(1) OU DO FIM(2) ?");
                        System.out.print("DIGITE: ");
                        controle = sc.nextInt();
                        sc.nextLine();
                        if (controle == 1) {
                            System.out.println("FILA INICIO -> FIM: " + f1.imprimirInicioFim());
                        } else if (controle == 2) {
                            System.out.println("FILA FIM -> INICIO: " + f1.imprimirFimInicio());
                        } else {
                            System.err.println("INDICE INVALIDO, TENTE NOVAMENTE");
                        }
                        controle = -1;
                        break;


                    default:
                        System.err.println("INDICE INVALIDO, TENTE NOVAMENTE");
                        break;
                }

            } catch (InputMismatchException e) {
                System.err.println("INDICE INVALIDO, TENTE NOVAMENTE");
                sc.nextLine();
            }
        } while ((controle != 0));

        sc.close();
    }

    private static void exibirMenu(DuplamenteEnfileiravelGenerico f) {

        System.out.println("                      ");
        System.out.println("                      ");
        System.out.println("Deque Dinamica Generica");
        System.out.println("MAX : " + f.getTamanho() + "/ Atual: " + f.getQuantidade());
        System.out.println("----------------------");
        System.out.println("                      ");
        System.out.println("0 - ENCERRRAR");
        System.out.println("1 - ENFILEIRAR");
        System.out.println("2 - DESINFILEIRAR");
        System.out.println("3 - ESPIAR");
        System.out.println("4 - ATUALIZAR");
        System.out.println("5 - IMPRIMIR");
        System.out.print("OPÇÃO: ");

    }

}
