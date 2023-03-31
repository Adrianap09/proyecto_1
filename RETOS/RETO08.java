import java.util.Random;
import java.util.Scanner;

public class RETO08 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numero = random.nextInt(100) + 1;
        int intentos = 10;
        int intento = 0;
        boolean adivinado = false;

        System.out.println("Bienvenido al juego Adivina el número!");
        System.out.println("Se ha generado un número entre 1 y 100.");
        System.out.println("Tienes " + intentos + " intentos para adivinarlo.");

        do {
            System.out.println("Intento " + (intento + 1));
            System.out.println("Ingrese un número entre 1 y 100: ");
            int numeroUsuario = scanner.nextInt();

            if (numeroUsuario < 1 || numeroUsuario > 100) {
                System.out.println("Número no válido. Debe estar entre 1 y 100.");
                continue;
            }

            intento++;

            if (numeroUsuario == numero) {
                adivinado = true;
                break;
            } else if (numeroUsuario < numero) {
                System.out.println("El número a adivinar es mayor.");
            } else {
                System.out.println("El número a adivinar es menor.");
            }

        } while (intento < intentos);

        if (adivinado) {
            System.out.println("Felicidades, adivinaste el número en " + intento + " intentos!");
        } else {
            System.out.println("Lo siento, no adivinaste el número. Era " + numero + ".");
            scanner.close();
        }

    }

}

