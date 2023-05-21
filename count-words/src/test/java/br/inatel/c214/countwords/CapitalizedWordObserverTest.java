package br.inatel.c214.countwords;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class CapitalizedWordObserverTest {

    private CapitalizedWordObserver capitalizedWordObserver;

    @Before
    public void setup() throws Exception {
        capitalizedWordObserver = new CapitalizedWordObserver();
    }

    @Test
    public void testUpdateShouldReturnTotalOfCapitalizedWords() {
        List<String> words = Arrays.asList("Hello", "world", "JAVA", "test", "c214");

        capitalizedWordObserver.update(words);

        assertEquals(2, capitalizedWordObserver.getTotal());
    }
}
