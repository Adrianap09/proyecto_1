import java.util.Scanner;

public class RETO06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese su nombre
        System.out.print("Ingresa tu nombre: ");
        String nombre = scanner.nextLine();
        
        double saldo = 0.0;
        int contadorJuegos = 0;
        
        System.out.println("Bienvenido a Cara o Sello, " + nombre + ".");
        System.out.println("Tu saldo actual es de $" + saldo + ".");
        
        while (true) {
            
            // Pedir al usuario que ingrese una apuesta
            System.out.print("Ingresa tu apuesta (debe ser mayor a $0): ");
            double apuesta = scanner.nextDouble();
            
            if (apuesta <= 0.0) {
                System.out.println("Lo siento, la apuesta debe ser mayor a $0.");
                break;
            }
            
            // Pedir al usuario que elija cara o sello
            System.out.print("Elige cara (c) o sello (s): ");
            String eleccion = scanner.next();
            
            if (eleccion.equalsIgnoreCase("c") || eleccion.equalsIgnoreCase("s")) {
                
                // Generar un número aleatorio (0 = cara, 1 = sello)
                int valorAleatorio = (int) (Math.random() * 2);
                String resultado = (valorAleatorio == 0) ? "cara" : "sello";
                
                System.out.println("La moneda cayó en " + resultado + ".");
                
                if (eleccion.equalsIgnoreCase(resultado)) {
                    System.out.println("¡Ganaste!");
                    saldo += apuesta;
                } else {
                    System.out.println("Lo siento, perdiste.");
                    saldo -= apuesta;
                }
                
                System.out.println("Tu saldo actual es de $" + saldo + ".");
                
            } else {
                System.out.println("La elección debe ser 'c' o 's'.");
            }
            
            contadorJuegos++;
        }
        
        // Mostrar los resultados finales
        System.out.println("Gracias por jugar, " + nombre + ".");
        System.out.println("Jugaste " + contadorJuegos + " veces y acomulaste $" + saldo + ".");
        
        if (saldo > 0.0) {
            System.out.println("¡Felicidades, ganaste!");
        } else if (saldo < 0.0) {
            System.out.println("Lo siento, la máquina ganó.");
        } else {
            System.out.println("Empate.");
        }
        
        scanner.close();
    }

}
