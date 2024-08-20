package mediaOfTwoSortedArrays;

import junit.framework.TestCase;

public class TestMedian extends TestCase {
    Median median = new Median();

    //    Caso 1: Orden inverso
    public void testReverseOrderedArrays() {
        int[] x = {7, 6, 5};
        int[] y = {3, 2, 1};

        double result = median.findMedianSortedArrays(x, y);
        assertTrue(result == 4.0);
    }

    //    Caso 2: Arrays vacios
    public void testEmptyArrays() {
        int[] x = {};
        int[] y = {};

        double result = median.findMedianSortedArrays(x, y);
        assertTrue(result == 0);
    }

    //    Caso 3: Validación 1
    public void testValidationOne() {
        int[] x = {1, 2, 3, 4, 5, 6};
        int[] y = {1, 2, 3, 4, 5, 6, 7, 8};

        double result = median.findMedianSortedArrays(x, y);
        assertTrue(result == 4.0);
    }

    //    Caso 4: Array con un solo elemento
    public void testSingleElementArrays() {
        int[] x = {1};
        int[] y = {2};

        double result = median.findMedianSortedArrays(x, y);
        assertTrue(result == 1.5);
    }

    //    Caso 5: Un array vacio y otro con elementos
    public void testOneEmptyArray() {
        int[] x = {};
        int[] y = {1, 3, 5, 7, 9};

        double result = median.findMedianSortedArrays(x, y);
        assertTrue(result == 5.0);
    }
}
