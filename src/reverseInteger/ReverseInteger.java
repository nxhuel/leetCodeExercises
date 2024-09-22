package reverseInteger;

public class ReverseInteger {
    public static int reverse(int x) {
//        Cumple con requisitos
        int num = Math.abs(x);
        int reverso = 0;

        while (num != 0) {
            int digito = num % 10;
//          Manejo de error: no tiene que salir del rango de 32 bits
            if (reverso > (Integer.MAX_VALUE - digito) / 10) {
                return 0;
            }

            reverso = reverso * 10 + digito;
            num = num / 10;
        }

        return (x < 0) ? (-reverso) : reverso;
    }
}
