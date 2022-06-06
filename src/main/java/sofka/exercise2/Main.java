package sofka.exercise2;

import java.util.Scanner;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {

        Logger logger = Logger.getLogger("log");
        Scanner leer = new Scanner(System.in);
        int num1;
        int num2;
        logger.info("Ingresa el primer numero");
        num1 = Integer.parseInt(leer.nextLine());
        logger.info("Ingresa el segundo numero");
        num2 = Integer.parseInt(leer.nextLine());

        calcular(num1, num2);
    }

    public static void calcular(int num1, int num2) {
        Logger logger = Logger.getLogger("log");
        String resultado = "";

        if (num1 >= num2) {

            if (num1 == num2) {
                resultado = "Los numeros " + num1 + " y " + num2 + " son iguales";
                logger.info(resultado);

            } else {

                resultado = "El número " + num1 + "es mayor que el número " + num2 + "";
                logger.info(resultado);

            }
        } else {
            resultado = "El número " + num2 + " es mayor que el número " + num1 + " ";
            logger.info(resultado);

        }
    }
}
