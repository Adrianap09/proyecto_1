import java.util.Scanner;

public class RETO01 {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      System.out.print("Ingrese la temperatura en grados Kelvin: ");
      double kelvin = input.nextDouble();

      double celsius = kelvin - 273.15;

      System.out.println(kelvin + " grados Kelvin son equivalentes a " + celsius + " grados Celsius.");
      input.close();
   }
}