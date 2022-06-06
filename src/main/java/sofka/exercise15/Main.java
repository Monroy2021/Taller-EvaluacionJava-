package sofka.exercise15;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {
    public static final Logger logger = Logger.getLogger("logger");

    public static void main(String[] args) {
        Scanner OP = new Scanner(System.in);

        int opcion;

        do {
            logger.info("****** GESTIÓN CINEMATOGRÁFICA********");
            logger.info("1-NUEVO ACTOR");
            logger.info("2-BUSCAR ACTOR");
            logger.info("3-ELIMINAR ACTOR");
            logger.info("4-MODIFICAR ACTOR");
            logger.info("5-VER TODOS LOS ACTORES");
            logger.info("6-VER PELICULAS DE LOS ACTORES");
            logger.info("7-VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES");
            logger.info("SALIR");
            opcion = OP.nextInt();

            if (opcion < 8) {
                logger.info("****** OPCION INCORRECT ********");
            }

        } while (opcion < 8);
    }
}












