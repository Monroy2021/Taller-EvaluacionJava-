package sofka.exercise7;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger("log");
        int codigo;
        Scanner sc = new Scanner(System.in);
        do {
            logger.info(() -> "Ingrese un numero mayor que 0");
            codigo = sc.nextInt();
        } while (codigo <= 0);
        logger.info( " " + codigo);

    }
}

