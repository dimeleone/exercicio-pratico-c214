package br.inatel.c214.countwords;

public interface Subject {
	void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObservers();
}
