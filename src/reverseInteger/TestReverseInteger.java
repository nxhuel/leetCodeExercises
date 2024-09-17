package reverseInteger;

import junit.framework.TestCase;

public class TestReverseInteger extends TestCase {
    ReverseInteger reverseInteger = new ReverseInteger();

    //    Caso 1: x se sale del rango 32 bits en negativo
    public void testFueraDeRangoNegativo() {
        int resultado = reverseInteger.reverse(-2 ^ 31);
        assertTrue(resultado == 0);
    }

    //    Caso 2: x se sale del rango 32 bits en positivo
    public void testFueraDeRangoPositivo() {
        int resultado = reverseInteger.reverse(2 ^ 31 - 1);
        assertTrue(resultado == 0);
    }

    //    Caso 3: x no permite int 64 bits en negativo
    public void testBitsNoPermitidoNegativo() {
        int resultado = reverseInteger.reverse(-2 ^ 63);
        assertTrue(resultado == 0);
    }

    //    Caso 4: x no permite int 64 bits en positivo
    public void testBitsNoPermitidosPositivo() {
        int resultado = reverseInteger.reverse(2 ^ 63 - 1);
        assertTrue(resultado == 0);
    }

    // Caso 5: x invertido positivo
    public void testNumeroInvertidoPositivo() {
        int resultado = reverseInteger.reverse(123);
        assertEquals(321, resultado);
    }

//    Caso 6: x invertido  negativo
    public void testNumreoInvertidoNegativo() {
        int resultado = reverseInteger.reverse(-123);
        assertEquals(-321, resultado);
    }
}
