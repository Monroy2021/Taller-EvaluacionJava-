package sofka.exercise1;

import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        int num1 = 10;
        float num2 = 20;
        String resultado = "";

        Logger logger = Logger.getLogger("log");

        if (num1>=num2){

            if(num1==num2){
                resultado= "Los numeros "+num1+" y "+num2+" son iguales";
                logger.info(resultado);

            }else{

                resultado="El número "+num1+ "es mayor que el número "+num2+"";
                logger.info(resultado);

            }
        }else{
            resultado="El número "+num2+" es mayor que el número "+num1+" ";
            logger.info(resultado);

        }
    }
}
