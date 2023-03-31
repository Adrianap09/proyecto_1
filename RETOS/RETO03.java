import java.util.Scanner;

public class RETO03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double apuesta;
        String eleccion, resultado;
        
        System.out.print("Ingrese el valor de su apuesta: ");
        apuesta = scanner.nextDouble();
        
        scanner.nextLine(); // Consumir el salto de línea
        
        System.out.print("Elija cara o sello: ");
        eleccion = scanner.nextLine();
        
        if (eleccion.equalsIgnoreCase("cara") || eleccion.equalsIgnoreCase("sello")) {
            
            // Generar un número aleatorio (0 = cara, 1 = sello)
            int valorAleatorio = (int) (Math.random() * 2);
            if (valorAleatorio == 0) {
                resultado = "cara";
            } else {
                resultado = "sello";
            }
            
            if (eleccion.equalsIgnoreCase(resultado)) {
                System.out.println("¡Ganaste! El resultado fue " + resultado + ".");
                System.out.println("Has ganado $" + apuesta + ".");
            } else {
                System.out.println("Perdiste. El resultado fue " + resultado + ".");
                System.out.println("Has perdido $" + apuesta + ".");
            }
            
        } else {
            System.out.println("La elección debe ser 'cara' o 'sello'.");
        }
        
        scanner.close();
    }

}
