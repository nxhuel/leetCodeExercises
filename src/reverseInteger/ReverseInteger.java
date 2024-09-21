package reverseInteger;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ReverseInteger {
    public static int reverse(int x) {
//        Manejo de error: no tiene que salir del rango de 32 bits
        String bits = String.valueOf(x);
        System.out.println(bits.length());
        if (bits.length() >= 10) {
            return 0;
        }

//        Cumple con requisitos
        ArrayList<Character> numDividos = new ArrayList<>();
        String conversion = String.valueOf(x);

        if (x < 0) {
//            Omitimos el signo -
            for (int i = 1; i < conversion.length(); i++) {
                char letra = conversion.charAt(i);
                numDividos.add(letra);
            }
//            System.out.println(numDividos);

            ArrayList<Integer> numInvertido = new ArrayList<>();

            for (int i = numDividos.size() - 1; i >= 0; i--) {
                numInvertido.add(Character.getNumericValue(numDividos.get(i)));
            }

            String resultado = "-" + numInvertido.stream()
                    .map(String::valueOf).collect(Collectors.joining());

            return Integer.parseInt(resultado);
        }

        for (int i = 0; i < conversion.length(); i++) {
            char letra = conversion.charAt(i);
            numDividos.add(letra);
        }

        ArrayList<Integer> numInvertido = new ArrayList<>();
        for (int i = numDividos.size() - 1; i >= 0; i--) {
            numInvertido.add(Character.getNumericValue(numDividos.get(i)));
        }
        String resultado = numInvertido.stream()
                .map(String::valueOf).collect(Collectors.joining());

        return Integer.parseInt(resultado);
    }

    public static void main(String[] args) {
        System.out.println(reverse((int) (Math.pow(2, 63) - 1)));
    }
}
