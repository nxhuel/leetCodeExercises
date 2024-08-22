package longestPalindromicSubstring;

import junit.framework.TestCase;

public class TestPalindromic extends TestCase {
    Palindromic palindromic = new Palindromic();

    //    Caso 1:  valor vacio
    public void testEmptyString() {
        String result = palindromic.longestPalindrome("");
        assertTrue(result == "Error. La cadena esta vacia o es nula");
    }

    //    Caso 2: valores numericos en String
    public void testErrorNumbers() {
        String result = palindromic.longestPalindrome("1234565");
        assertTrue(result == "Error. La cadena debe contener solo letras");
    }

    //    Caso 3: String correcto
    public void testExpectedResponse() {
        String result = palindromic.longestPalindrome("babhannah");
        assertEquals("hannah", result);
    }

    //    Caso 4: Un solo caracter
    public void testSingleCharacter() {
        String result = palindromic.longestPalindrome("a");
        assertEquals("a", result);
    }

    //    Caso 5: String con espacios en blanco, caracteres especiales y mayusculas
    public void testBlankSpaces() {
        String result = palindromic.longestPalindrome("baBha: nna h");
        assertEquals("hannah", result);
    }
}