package br.inatel.c214.countwords;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        WordCounter wordCounter = new WordCounter();
        wordCounter.registerObserver(new WordCountObserver());
        wordCounter.registerObserver(new EvenLengthWordObserver());
        wordCounter.registerObserver(new CapitalizedWordObserver());

        System.out.print("Escreva uma frase: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");
        
        for (String word : words) {
            wordCounter.addWord(word);
        }
        
        wordCounter.notifyObservers();

        scanner.close();
    }
}
