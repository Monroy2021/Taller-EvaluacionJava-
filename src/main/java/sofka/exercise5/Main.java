package sofka.exercise5;

import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger("log");
        int num=1;
        //Definimos el bucle, incluye el 100
        while (num<=100){
            if (num%2==0 || num%3==0){
                logger.info(""+num);
            }
            num++;
        }
    }

}




