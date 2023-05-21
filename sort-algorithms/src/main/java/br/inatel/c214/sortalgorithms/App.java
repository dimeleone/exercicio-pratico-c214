package br.inatel.c214.sortalgorithms;

import java.util.Scanner;

public class App {

	public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

		while(true) {
            System.out.println("Escolha o algoritmo de ordenação: ");
            System.out.println("1 - Selection Sort");
            System.out.println("2 - Bubble Sort");
            System.out.println("3 - Insertion Sort");
            System.out.println("4 - Sair");

            int opcao = 0;

            try {
                opcao = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Opção inválida!");
                continue;
            }

            if (opcao == 4) {
                break;
            }

            System.out.println("Digite o tamanho do vetor: ");

            int tamanho = 0;

            try {
                tamanho = Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Tamanho inválido!");
                continue;
            }

            int[] vetor = new int[tamanho];

            for (int i = 0; i < tamanho; i++) {
                vetor[i] = (int) (Math.random() * 100);
            }

            System.out.println("Vetor gerado: ");

            for (int i = 0; i < tamanho; i++) {
                System.out.print(vetor[i] + " ");
            }

            SortStrategy sort = null;

            switch (opcao) {
                case 1:
                    sort = new SelectionSort();
                    break;
                case 2:
                    sort = new BubbleSort();
                    break;
                case 3:
                    sort = new InsertionSort();
                    break;
                default:
                    System.out.println("Opção inválida!");
                    continue;
            }

            System.out.println();

            sort.sort(vetor);

            System.out.println();

            System.out.println("Deseja ordenar outro vetor? (S/N)");

            String resposta = scanner.nextLine();

            if (resposta.equalsIgnoreCase("N")) {
                break;
            }

            System.out.println();
        }

        scanner.close();
	}
}
