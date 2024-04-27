

// Empezamos importando  el es canner//

import java.util.Scanner;

public class JuegoAleatorio {

    public static void main(String[] args) {

        System.out.println("Adivina  un numero del 1 al 100 ");
        int numero = 0;
        numero = (int) (Math.random() * 100);
        int input = 0;

        //  System.out.println(numero);

        Scanner sc = new Scanner(System.in);
        int juego = sc.nextInt();
        //System.out.println("Has acertado el numero es:" +numero);

        if (numero == juego){

            System.out.printf("Acertate el numero es;" + numero );


        }else {
            System.out.printf("Lo siento no pudiste hacertar el numero " + numero);
        }



    }
}









