package AlgoritmosDeOrdenação;

public class selectionSort {
    int[] dados = {6, 8, 3, 1, 9, 0, 2, 5};

    public void selectionSortMetodo() {
        for (int j = 0; j < dados.length; j++) {
            int menor = j;
            for (int i = 1 + j; i < dados.length; i++) {
                if (dados[menor] > dados[i]) {
                    menor = i;
                }
            }
            troca(j, menor);
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
        selectionSort sort = new selectionSort();
        System.out.println("Antes: ");
        sort.imprimiTela();
        sort.selectionSortMetodo();
        System.out.println("Depois: ");
        sort.imprimiTela();

    }

}
