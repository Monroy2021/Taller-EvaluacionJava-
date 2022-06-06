package sofka.exercise13;


import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.function.Supplier;
import java.util.logging.Logger;


public class Main {
    public static void main(String[] args) {

        Logger logger = Logger.getLogger("logger");

        logger.info(String.valueOf(ZonedDateTime.now()));

        logger.info("Obtener la zona horaria actual");
        logger.info((Supplier<String>) ZonedDateTime.now().getZone());
        logger.info("Obtener la hora de una zona horaria diferente:" + ZonedDateTime.now(ZoneId.of("America/New_York")));


    }
}

