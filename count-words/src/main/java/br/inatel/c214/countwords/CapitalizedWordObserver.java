package br.inatel.c214.countwords;

import java.util.List;

public class CapitalizedWordObserver implements Observer {
    private int total = 0;

    public void update(List<String> words) {
        int capitalizedCount = 0;
        for (String word : words) {
            if (Character.isUpperCase(word.charAt(0))) {
                capitalizedCount++;
            }
        }
        System.out.println("Total de palavras comecadas com maiusculas: " + capitalizedCount);
        total = capitalizedCount;
    }

    public int getTotal() {
        return total;
    }
}
