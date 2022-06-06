package sofka.exercise3;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {

        Logger logger = Logger.getLogger("log");

        Scanner leer = new Scanner(System.in);
        double radio;

        logger.info("Introduce un Radio");
        radio= Double.parseDouble(leer.nextLine());

        double Area = Math.PI * Math.pow(radio, 2);
        String resultado = "El área del círculo es " + Area;
        logger.info(resultado);

    }
}
