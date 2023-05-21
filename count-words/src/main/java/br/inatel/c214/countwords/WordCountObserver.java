package br.inatel.c214.countwords;

import java.util.List;

public class WordCountObserver implements Observer {
    private int total = 0;

    public void update(List<String> words) {
        int count = words.size();
        System.out.println("Total de palavras: " + count);
        total = count;
    }

    public int getTotal() {
        return total;
    }
}
