package sofka.exercise12;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Logger logger = Logger.getLogger("logger");

        logger.info("Escribe la primera palabra");
        String primeraCadena = leer.next();

        logger.info("Escribe la segunda palabra");
        String segundaCadena = leer.next();

        logger.info("Son iguales: " + isEqualCadena(primeraCadena, segundaCadena));

    }

    public static boolean isEqualCadena(String primeraCadena, String segundaCadena){
        if (primeraCadena.equals(primeraCadena)){
            return true;
        }
        return false;
    }
}
