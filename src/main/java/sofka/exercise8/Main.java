package sofka.exercise8;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Logger logger = Logger.getLogger("log");

        logger.info("Introduce un dia de la semana");
        String dia = sc.next();

        switch (dia) {
            case "LUNES":
            case "MARTES":
            case "MIERCOLES":
            case "JUEVES":
            case "VIERNES":
                logger.info("Hoy es un dia laboral");
                break;
            case "SABADO":
            case "DOMINGO":
                logger.info("Hoy es un dia  NO laboral");
            default:

                logger.info("Ingrese un dia de la semana");

        }
    }
}


