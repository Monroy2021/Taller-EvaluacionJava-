package sofka.exercise14;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("logger");
        Scanner leer = new Scanner(System.in);

        String num1, cadenaNum="";

        do {
            logger.info("ingrese un número");
            Scanner imprimirNumero = new Scanner(System.in);
            num1 = imprimirNumero.next();
        } while (!isNumeric(num1));

        int n1 = Integer.parseInt(num1);

        for (int i=n1; i<=1000;i+=2 ){
            cadenaNum= cadenaNum + String.valueOf(i) + "-";
        }
        logger.info(cadenaNum);
    }
    //Método  valida si la cadena es numerica
    public static boolean isNumeric(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException nfe) {
            return false;
        }
    }
}

