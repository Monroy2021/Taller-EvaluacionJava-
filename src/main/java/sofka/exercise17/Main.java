package sofka.exercise17;

import java.util.logging.Logger;

public class Main {
    public static final Logger logger = Logger.getLogger("logger");

    public static void main(String[] args) {


        Electrodomestico[] electrodomesticos = CargarDatos.crearArrayElectrodomesticos();

        double[] precios;
        precios = CargarDatos.calcularPrecios(electrodomesticos);

        logger.info("El precio total es --> " + (precios[0] + precios[1] + precios[2]));
        logger.info("Donde el precio de los Electrodomesticos es de: " + precios[0]);
        logger.info("Donde el precio de las Lavadoras es de: " + precios[2]);
        logger.info("Donde el precio de los Televisores es de: " + precios[1]);


    }
}
