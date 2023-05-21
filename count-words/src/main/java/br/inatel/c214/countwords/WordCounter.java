package br.inatel.c214.countwords;

import java.util.ArrayList;
import java.util.List;

public class WordCounter implements Subject {
    private List<Observer> observers;
    private List<String> words;

    public WordCounter() {
        observers = new ArrayList<Observer>();
        words = new ArrayList<String>();
    }

    public void addWord(String word) {
        words.add(word);
    }

    public List<String> getWords() {
        return words;
    }

    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public List<Observer> getObservers() {
        return observers;
    }

    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(words);
        }
    }
}
