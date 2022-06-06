package sofka.exercise6;

import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger("log");
        for (int num = 1; num <= 100; num++) {

            if (num % 2 == 0 || num % 3 == 0) {
                logger.info("Los resultados fueron:"+num);


            }
        }
    }

}

