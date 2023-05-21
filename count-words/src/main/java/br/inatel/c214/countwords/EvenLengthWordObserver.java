package br.inatel.c214.countwords;

import java.util.List;

public class EvenLengthWordObserver implements Observer {
    private int total = 0;

    public void update(List<String> words) {
        int evenCount = 0;
        for (String word : words) {
            if (word.length() % 2 == 0) {
                evenCount++;
            }
        }
        System.out.println("Total de palavras com quantidades pares de caracteres: " + evenCount);
        total = evenCount;
    }

    public int getTotal() {
        return total;
    }
}

