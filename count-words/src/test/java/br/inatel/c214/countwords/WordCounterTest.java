package br.inatel.c214.countwords;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class WordCounterTest {

    private WordCounter wordCounter;

    @Before
    public void setup() throws Exception {
        wordCounter = new WordCounter();
    }

    @Test
    public void testAddWord() {
        wordCounter.addWord("Hello");
        wordCounter.addWord("world");
        wordCounter.addWord("JAVA");
        wordCounter.addWord("test");
        wordCounter.addWord("c214");

        assertEquals(5, wordCounter.getWords().size());
    }

    @Test
    public void testRegisterObserver() {
        wordCounter.registerObserver(new CapitalizedWordObserver());
        wordCounter.registerObserver(new EvenLengthWordObserver());
        wordCounter.registerObserver(new WordCountObserver());

        assertEquals(3, wordCounter.getObservers().size());
    }

    @Test
    public void testRemoveObserver() {
        CapitalizedWordObserver capitalizedWordObserver = new CapitalizedWordObserver();
        EvenLengthWordObserver evenLengthWordObserver = new EvenLengthWordObserver();
        WordCountObserver wordCountObserver = new WordCountObserver();

        wordCounter.registerObserver(capitalizedWordObserver);
        wordCounter.registerObserver(evenLengthWordObserver);
        wordCounter.registerObserver(wordCountObserver);

        wordCounter.removeObserver(capitalizedWordObserver);
        wordCounter.removeObserver(evenLengthWordObserver);
        wordCounter.removeObserver(wordCountObserver);

        assertEquals(0, wordCounter.getObservers().size());
    }

    @Test
    public void testNotifyObservers() {
        CapitalizedWordObserver capitalizedWordObserver = new CapitalizedWordObserver();
        EvenLengthWordObserver evenLengthWordObserver = new EvenLengthWordObserver();
        WordCountObserver wordCountObserver = new WordCountObserver();

        wordCounter.registerObserver(capitalizedWordObserver);
        wordCounter.registerObserver(evenLengthWordObserver);
        wordCounter.registerObserver(wordCountObserver);

        wordCounter.addWord("Hello");
        wordCounter.addWord("world");
        wordCounter.addWord("JAVA");
        wordCounter.addWord("test");
        wordCounter.addWord("c214");

        wordCounter.notifyObservers();

        assertEquals(2, capitalizedWordObserver.getTotal());
        assertEquals(3, evenLengthWordObserver.getTotal());
        assertEquals(5, wordCountObserver.getTotal());
    }
}
