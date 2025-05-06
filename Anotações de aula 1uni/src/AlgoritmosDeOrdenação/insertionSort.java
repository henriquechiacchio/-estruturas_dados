package AlgoritmosDeOrdenação;

public class insertionSort {
    int[] dados = {6, 8, 3, 1, 9, 0, 2, 5};

    public void insertionSortMetodo() {
        for (int pivot = 1; pivot < dados.length; pivot++) {
            for (int i = pivot - 1; 0 <= i; i--) {
                if (dados[i + 1] < dados[i]) {
                    troca(i, i + 1);
                } else {
                    break;
                }
            }
        }
    }

    private void troca(int indice1, int indice2) {
        int temp = dados[indice1];
        dados[indice1] = dados[indice2];
        dados[indice2] = temp;

    }

    public void imprimiTela() {
        for (int dado : dados) {
            System.out.println(dado + " ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        insertionSort sort = new insertionSort();
        System.out.println("Antes: ");
        sort.imprimiTela();
        sort.insertionSortMetodo();
        System.out.println("Depois: ");
        sort.imprimiTela();

    }
}
