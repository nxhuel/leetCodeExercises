package zigzagConversion;

import junit.framework.TestCase;

public class TestZigzag extends TestCase {
    Zigzag zigzag = new Zigzag();

    //    Caso 1: Se envia una sola fila
    public void testAvoidARow() {
        String result = zigzag.convert("ABCDEFGHI", 1);
        assertTrue(result == "ABCDEFGHI");
    }

    //    Caso 2: Se envia numero de longitud de cadena menor o igual al numero de filas
    public void testStringLessThanRows() {
        String result = zigzag.convert("ABCDEFGHI", 50);
        assertTrue(result == "ABCDEFGHI");
    }

//    Caso 3: Valor correcto
    public void testCorrectValue() {
        String result = zigzag.convert("ABCDEFGHI", 4);
        assertEquals("AGBFHCEID", result);
    }
}
