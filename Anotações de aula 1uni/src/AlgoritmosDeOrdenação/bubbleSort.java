package AlgoritmosDeOrdenação;

public class bubbleSort {
    int[] dados = {6, 8, 3, 1, 9, 0, 2, 5};

    public void imprimiTela() {
        for (int dado : dados) {
            System.out.println(dado + " ");
        }
        System.out.println(" ");
    }

    public void BubbleSort() {
        for (int j = 0; j < (dados.length - 1); j++) {
            for (int i = 0; i < ((dados.length - 1) - j); i++) {
                if (dados[i] > dados[i + 1]) {
                    troca(i, (i + 1));
                }
            }
        }
    }

    private void troca(int indice1, int indice2) {
        int temp = dados[indice1];
        dados[indice1] = dados[indice2];
        dados[indice2] = temp;

    }

    public static void main(String[] args) {
        bubbleSort sort = new bubbleSort();
        System.out.println("Antes: ");
        sort.imprimiTela();
        sort.BubbleSort();
        System.out.println("Depois: ");
        sort.imprimiTela();

    }
}


