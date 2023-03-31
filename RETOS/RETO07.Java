import java.util.Random;
import java.util.Scanner;

public class RETO07 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int apuesta = 0;
        int saldo = 0;
        int juego = 1;
        int maximoJuegos = 3;

        System.out.println("Bienvenido al juego Piedra, Papel o Tijera!");

        do {
            System.out.println("Juego " + juego);
            System.out.println("Ingrese su apuesta: ");
            apuesta = scanner.nextInt();

            if (apuesta <= 0 || apuesta > saldo + 100) {
                System.out.println("Apuesta no válida. Debe ser mayor a 0 y menor o igual a su saldo + 100.");
                continue;
            }

            System.out.println("Ingrese su jugada (1 = Piedra, 2 = Papel, 3 = Tijera): ");
            int jugadaUsuario = scanner.nextInt();

            if (jugadaUsuario < 1 || jugadaUsuario > 3) {
                System.out.println("Jugada no válida. Debe ser 1, 2 o 3.");
                continue;
            }

            int jugadaComputadora = random.nextInt(3) + 1;

            System.out.println("La computadora jugó " + jugadaToString(jugadaComputadora) + ".");

            int resultado = determinarGanador(jugadaUsuario, jugadaComputadora);

            if (resultado == 0) {
                System.out.println("Empate!");
            } else if (resultado == 1) {
                System.out.println("Ganaste!");
                saldo += apuesta;
            } else {
                System.out.println("Perdiste!");
                saldo -= apuesta;
            }

            juego++;

        } while (juego <= maximoJuegos && saldo > 0);

        System.out.println("Juegos jugados: " + (juego - 1));
        System.out.println("Saldo final: " + saldo);

    }

    public static int determinarGanador(int jugadaUsuario, int jugadaComputadora) {
        if (jugadaUsuario == jugadaComputadora) {
            return 0; // empate
        } else if (jugadaUsuario == 1 && jugadaComputadora == 3 || jugadaUsuario == 2 && jugadaComputadora == 1
                || jugadaUsuario == 3 && jugadaComputadora == 2) {
            return 1; // gana el usuario
        } else {
            return -1; // gana la computadora
        }
    }

    public static String jugadaToString(int jugada) {
        switch (jugada) {
        case 1:
            return "Piedra";
        case 2:
            return "Papel";
        case 3:
            return "Tijera";
        default:
            return "";
        }
    }

}
