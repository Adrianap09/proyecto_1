import java.util.Scanner;

public class RETO04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double saldo = 10000.0;
        String eleccion, resultado;
        double apuesta;
        
        System.out.println("Bienvenido a Piedra, Papel o Tijera.");
        System.out.println("Tu saldo actual es de $" + saldo + ".");
        
        // Pedir al usuario que ingrese una apuesta
        System.out.print("Ingresa tu apuesta (debe ser mayor a $10,000): ");
        apuesta = scanner.nextDouble();
        
        if (apuesta < 10000.0) {
            System.out.println("Lo siento, no puedes apostar menos de $10,000.");
            scanner.close();
            return;
        }
        
        // Pedir al usuario que elija una opción
        System.out.print("Elige tu jugada (p para piedra, pa para papel, t para tijera): ");
        eleccion = scanner.next();
        
        if (eleccion.equalsIgnoreCase("p") || eleccion.equalsIgnoreCase("t") || eleccion.equalsIgnoreCase("pa")) {
            
            // Generar un número aleatorio (0 = piedra, 1 = papel, 2 = tijera)
            int valorAleatorio = (int) (Math.random() * 3);
            if (valorAleatorio == 0) {
                resultado = "piedra";
            } else if (valorAleatorio == 1) {
                resultado = "papel";
            } else {
                resultado = "tijera";
            }
            
            System.out.println("La computadora eligió " + resultado + ".");
            
            if (eleccion.equalsIgnoreCase(resultado)) {
                System.out.println("Empate.");
            } else if ((eleccion.equalsIgnoreCase("p") && resultado.equalsIgnoreCase("t")) ||
                       (eleccion.equalsIgnoreCase("pa") && resultado.equalsIgnoreCase("p")) ||
                       (eleccion.equalsIgnoreCase("t") && resultado.equalsIgnoreCase("pa"))) {
                System.out.println("¡Ganaste!");
                saldo += apuesta;
            } else {
                System.out.println("Lo siento, perdiste.");
                saldo -= apuesta;
            }
            
            System.out.println("Tu saldo actual es de $" + saldo + ".");
            
        } else {
            System.out.println("La elección debe ser 'p', 'pa' o 't'.");
        }
        
        scanner.close();
    }

}
