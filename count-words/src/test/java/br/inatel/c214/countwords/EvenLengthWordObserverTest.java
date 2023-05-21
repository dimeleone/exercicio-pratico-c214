package br.inatel.c214.countwords;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class EvenLengthWordObserverTest {

    private EvenLengthWordObserver evenLengthWordObserver;

    @Before
    public void setup() throws Exception {
        evenLengthWordObserver = new EvenLengthWordObserver();
    }

    @Test
    public void testUpdateShouldReturnTotalOfEventLengthWords() {
        List<String> words = Arrays.asList("Hello", "world", "JAVA", "test", "c214");

        evenLengthWordObserver.update(words);

        assertEquals(3, evenLengthWordObserver.getTotal());
    }
}
