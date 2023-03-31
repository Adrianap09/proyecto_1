
import java.util.Scanner;

public class RETO02 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      // solicitar los datos del bebé
      System.out.print("Ingrese el nombre de la mamá: ");
      String nombreMama = input.nextLine();

      System.out.print("Ingrese el peso del bebé en kg: ");
      double pesoBebé = input.nextDouble();

      System.out.print("Ingrese la edad del bebé en meses: ");
      int mesesBebé = input.nextInt();

      // operacion para calcular la dosis de la vacuna
      double dosisVacuna = (pesoBebé + 10) / (mesesBebé * 10.0) * 8;

      // mostrar los resultados de la vacuna, el nombre de la mama y el peso del bebe 
      System.out.println("La vacuna aplicada al bebé de " + mesesBebé + " meses y " + pesoBebé + " kg es de " + dosisVacuna + " ml.");
      System.out.println("Nombre de la mamá: " + nombreMama);
      System.out.println("Peso del bebé: " + pesoBebé + " kg");

      input.close();
   }
}
