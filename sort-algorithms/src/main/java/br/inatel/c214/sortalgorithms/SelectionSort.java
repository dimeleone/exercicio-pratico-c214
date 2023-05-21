package br.inatel.c214.sortalgorithms;

public class SelectionSort implements SortStrategy {

    public void sort(int[] data) {
        int n = data.length;

        for (int i = 0; i < n-1; i++) {
            int min = i;

            for (int j = i+1; j < n; j++) {
                if (data[j] < data[min]) {
                    min = j;
                }
            }

            int aux = data[min];
            data[min] = data[i];
            data[i] = aux;
        }

        System.out.println("Vetor ordenado (Selection Sort): ");

        for (int i = 0; i < n; i++) {
            System.out.print(data[i] + " ");
        }

        System.out.println();
    }
}
