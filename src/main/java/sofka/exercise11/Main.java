package sofka.exercise11;

import java.util.HashMap;
import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("logg");
        Scanner leer = new Scanner(System.in);
        logger.info("Por favor ingresa una frase");
        String frase = leer.nextLine();
        String longFrase = "La longitud de la frase es: " + Longitud(frase);

        String cantidadV = "Cantidad de vocales A: " + calcular_A(frase) + "Cantidad de vocales E:" + calcular_E(frase)
                + "Cantidad de vocales I:" + calcular_I(frase) + "Cantidad de vocales O:" + calcular_O(frase)
                + "Cantidad de vocales U:" + calcular_U(frase);


        logger.info(longFrase);
        logger.info(cantidadV);
    }


    public static int Longitud(String frase) {
        return frase.length();
    }

    public static int calcular_A(String frase) {
        int cont_A = 0;
        for (int x = 0; x < frase.length(); x++) {
            if (frase.toLowerCase().charAt(x) == 'a') {
                cont_A++;
            }
        }
        return cont_A;
    }

    public static int calcular_E(String frase) {
        int cont_E = 0;
        for (int x = 0; x < frase.length(); x++) {
            if (frase.toLowerCase().charAt(x) == 'e') {
                cont_E++;
            }
        }
        return cont_E;
    }

    public static int calcular_I(String frase) {
        int cont_I = 0;
        for (int x = 0; x < frase.length(); x++) {
            if (frase.toLowerCase().charAt(x) == 'i') {
                cont_I++;
            }
        }
        return cont_I;
    }

    public static int calcular_O(String frase) {
        int cont_O = 0;
        for (int x = 0; x < frase.length(); x++) {
            if (frase.toLowerCase().charAt(x) == 'o') {
                cont_O++;
            }
        }
        return cont_O;
    }

    public static int calcular_U(String frase) {
        int cont_U = 0;
        for (int x = 0; x < frase.length(); x++) {
            if (frase.toLowerCase().charAt(x) == 'u') {
                cont_U++;
            }
        }
        return cont_U;
    }

}





