package reverseInteger;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.stream.Collectors;

public class ReverseInteger {
    public static int reverse(int x) {
//        Manejo de error: no tiene que salir del rango de 32 bits
//        if ((Math.pow(-2, 31)) <= x || x <= ((Math.pow(2, 31) -1))) {
//            return 0;
//        }
//        Manejo de error: no tiene que permitir int 64 bits
//        if ((Math.pow(-2, 63)) <= x || x <= ((Math.pow(2, 63) -1))) {
//            return 0;
//        }

        ArrayList<Character> numDividos = new ArrayList<>();
        String conversion = String.valueOf(x);

        for (int i = 0; i < conversion.length(); i++) {
            char letra = conversion.charAt(i);
            numDividos.add(letra);
        }

        ArrayList<Integer> numInvertido = new ArrayList<>();
        for (int i = numDividos.size()-1; i >= 0; i--) {
            numInvertido.add(Character.getNumericValue(numDividos.get(i)));
        }
        String resultado = numInvertido.stream()
                        .map(String::valueOf).collect(Collectors.joining());

        return Integer.parseInt(resultado);
    }

    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }
}
