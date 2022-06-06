package sofka.exercise4;


import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger("log");
        final double IVA = 0.21;

        String mensaje = "Ingrese el precio de un producto";
        logger.info(mensaje);
        double precio = Double.parseDouble("");

        double precioFinal = precio + (precio * IVA);
        logger.info(""+ precioFinal);

    }
}

