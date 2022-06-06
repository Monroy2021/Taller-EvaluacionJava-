package sofka.exercise9;

import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {

        Logger logger = Logger.getLogger("log");

        String antiguoString = "La sonrisa sera la mejor arma contra la tristeza";

        String nuevoString1 = antiguoString.replace("a", "e");
        logger.info(nuevoString1);


    }

}

