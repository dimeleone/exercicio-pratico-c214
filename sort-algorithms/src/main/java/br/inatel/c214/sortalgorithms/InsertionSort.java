package br.inatel.c214.sortalgorithms;

public class InsertionSort implements SortStrategy  {

    public void sort(int[] data) {
        int n = data.length;

        for (int i = 1; i < n; i++) {
            int aux = data[i];
            int j = i - 1;

            while (j >= 0 && data[j] > aux) {
                data[j+1] = data[j];
                j--;
            }

            data[j+1] = aux;
        }

        System.out.println("Vetor ordenado (Insertion Sort): ");

        for (int i = 0; i < n; i++) {
            System.out.print(data[i] + " ");
        }

        System.out.println();
    }
}
