package br.inatel.c214.countwords;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class WordCountObserverTest {

    private WordCountObserver wordCountObserver;

    @Before
    public void setup() throws Exception {
        wordCountObserver = new WordCountObserver();
    }

    @Test
    public void testUpdateShouldReturnTotalOfEventLengthWords() {
        List<String> words = Arrays.asList("Hello", "world", "JAVA", "test", "c214");

        wordCountObserver.update(words);

        assertEquals(5, wordCountObserver.getTotal());
    }
}
