package sofka.exercise10;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger("log");
        Scanner leer = new Scanner(System.in);
        logger.info(" ingresa una frase");
        String frase = leer.nextLine();
        String sinEspacios = espacios(frase);
        logger.info(sinEspacios);
    }

    public static String espacios(String frase) {
        return frase.replace(" ", "");
    }
}

