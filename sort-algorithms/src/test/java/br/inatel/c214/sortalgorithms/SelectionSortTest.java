package br.inatel.c214.sortalgorithms;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SelectionSortTest {

    private SelectionSort sortAlgorithm;

    @Before
    public void setup() throws Exception {
        sortAlgorithm = new SelectionSort();
    }

    @Test
    public void testSortAlgorithm() {
        int[] array = { 5, 4, 3, 2, 1 };

        sortAlgorithm.sort(array);

        Assert.assertArrayEquals(new int[] { 1, 2, 3, 4, 5 }, array);
    }

    @Test
    public void testSortAlgorithmWithRepeatedValues() {
        int[] array = { 5, 4, 3, 2, 1, 5, 4, 3, 2, 1 };

        sortAlgorithm.sort(array);

        Assert.assertArrayEquals(new int[] { 1, 1, 2, 2, 3, 3, 4, 4, 5, 5 }, array);
    }

    @Test
    public void testSortAlgorithmWithNegativeValues() {
        int[] array = { 5, 4, 3, 2, 1, -5, -4, -3, -2, -1 };

        sortAlgorithm.sort(array);

        Assert.assertArrayEquals(new int[] { -5, -4, -3, -2, -1, 1, 2, 3, 4, 5 }, array);
    }

    @Test
    public void testSortAlgorithmWithEmptyArray() {
        int[] array = {};

        sortAlgorithm.sort(array);

        Assert.assertArrayEquals(new int[] {}, array);
    }
}
