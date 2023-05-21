package br.inatel.c214.sortalgorithms;

public class SortContext {
	private SortStrategy strategy;

    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void sortData(int[] data) {
        strategy.sort(data);
    }
}
