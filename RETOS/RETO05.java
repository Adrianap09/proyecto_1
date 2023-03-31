import java.util.Scanner;

public class RETO05 {
    public static double calcularTotal(int cantidad, double precio) {
        return cantidad * precio;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitamos los nombres del empleado y del cliente
        System.out.print("Nombre del empleado: ");
        String empleado = scanner.nextLine();
        System.out.print("Nombre del cliente: ");
        String cliente = scanner.nextLine();

        // Solicitamos al usuario que ingrese el precio de cada producto y la cantidad que desea comprar
        double total = 0;
        boolean terminar = false;

        while (!terminar) {
            System.out.print("Nombre del producto (o presione enter para terminar): ");
            String nombreProducto = scanner.nextLine();
            if (nombreProducto.isEmpty()) {
                terminar = true;
            } else {
                System.out.print("Precio del producto: ");
                double precioProducto = scanner.nextDouble();
                System.out.print("Cantidad del producto: ");
                int cantidadProducto = scanner.nextInt();
                scanner.nextLine(); // Consumimos el salto de línea
                double totalProducto = calcularTotal(cantidadProducto, precioProducto);
                System.out.printf("Total de %s: %.2f%n", nombreProducto, totalProducto);
                total += totalProducto;
            }
        }

        // Verificamos si el cliente está registrado
        boolean clienteRegistrado = false;
        while (!clienteRegistrado) {
            System.out.print("¿El cliente está registrado? (S/N): ");
            String respuesta = scanner.nextLine();
            if (respuesta.equalsIgnoreCase("S")) {
                clienteRegistrado = true;
            } else if (respuesta.equalsIgnoreCase("N")) {
                System.out.println("El cliente debe estar registrado para hacer la compra.");
            } else {
                System.out.println("Por favor ingrese una respuesta válida.");
            }
        }

        if (clienteRegistrado) {
           
            System.out.printf("Total a pagar: %.2f%n", total);

            
            System.out.print("Cantidad con la que va a pagar: ");
            double pago = scanner.nextDouble();

           
            if (pago < total) {
                System.out.println("El pago no es suficiente.");
            } else {
                double vueltas = pago - total;
                System.out.printf("Vueltas: %.2f%n", vueltas);
            }
        }

        scanner.close();
    }
}
