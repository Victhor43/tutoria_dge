package otro;

public class hola {

    public static void main(String[] args) {
        System.out.println("XXXXX");
    }
}

package SEGUNDA_PARTE.Java1;import java.util.Scanner;public class Calculadora {    public static void main(String[] args) {        Scanner num = new Scanner(System.in);        System.out.println ("1- Sumar");        System.out.println ("2- Restar");        System.out.println ("3- Multiplicar");        System.out.println ("4- Dividir");        System.out.println ("5- Salir");        System.out.print ("Por favor ingrese una opción:");        int opcion = num.nextInt();                if (opcion >= 5) {System.out.println("Error");        num.close();        }