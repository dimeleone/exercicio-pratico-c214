package br.inatel.c214.sortalgorithms;

public class BubbleSort implements SortStrategy  {

    public void sort(int[] data) {
        int n = data.length;

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-1-i; j++) {
                if (data[j] > data[j+1]) {
                    int aux = data[j];
                    data[j] = data[j+1];
                    data[j+1] = aux;
                }
            }
        }

        System.out.println("Vetor ordenado (Bubble Sort): ");

        for (int i = 0; i < n; i++) {
            System.out.print(data[i] + " ");
        }

        System.out.println();
    }
}
