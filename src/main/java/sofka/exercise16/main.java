package sofka.exercise16;

import java.util.Locale;
import java.util.Scanner;
import java.util.logging.Logger;

public class main {


    public static void main(String[] args) {
        Logger logger = Logger.getLogger("logger");
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        sc.useLocale(Locale.US);

        //Introducimos los datos
        logger.info("Introduce el nombre");
        String nombre = sc.next();

        logger.info("Introduce la edad");
        int edad = sc.nextInt();

        logger.info("Introduce el sexo");
        char sexo = sc.next().charAt(0);

        logger.info("Introduce el peso");
        double peso = sc.nextDouble();

        logger.info("Introduce la altura");
        double altura = sc.nextDouble();

        //Creamos objetos con cada constructor
        persona persona1 = new persona();
        persona persona2 = new persona(nombre, edad, sexo);
        persona persona3 = new persona(nombre, edad, sexo, peso, altura);

        //Los datos que no esten completos los insertamos con los metodos set
        persona1.setNombre("Laura");
        persona1.setEdad(30);
        persona1.setSexo('M');
        persona1.setPeso(60);
        persona1.setAltura(1.60);

        persona2.setPeso(90.5);
        persona2.setAltura(1.80);

        //Usamos metodos para realizar la misma accion para cada objeto
        logger.info("Persona1");
        MuestraMensajePeso(persona1);
        MuestraMayorDeEdad(persona1);
        logger.info(persona1.toString());

        logger.info("Persona2");
        MuestraMensajePeso(persona2);
        MuestraMayorDeEdad(persona2);
        logger.info(persona2.toString());

        logger.info("Persona3");
        MuestraMensajePeso(persona3);
        MuestraMayorDeEdad(persona3);
        logger.info(persona3.toString());
    }

    public static void MuestraMensajePeso(persona p) {
        Logger logger = Logger.getLogger("logger");
        int IMC = p.calcularIMC();
        switch (IMC) {
            case persona.PESO_IDEAL -> logger.info("La persona esta en su peso ideal");
            case persona.INFRAPESO -> logger.info("La persona esta por debajo de su peso ideal");
            case persona.SOBREPESO -> logger.info("La persona esta por encima de su peso ideal");
        }
    }

    public static void MuestraMayorDeEdad(persona p) {
        Logger logger = Logger.getLogger("logger");
        if (p.esMayorDeEdad()) {
            logger.info("La persona es mayor de edad");
        } else {
            logger.info("La persona no es mayor de edad");
        }
    }

}
