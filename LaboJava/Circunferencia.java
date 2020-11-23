import java.util.Scanner;

public class Circunferencia{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        double a, p, r;

        System.out.println("Ingrese el valor del radio");
        r = entrada.nextInt();

        a = 3.1415*(r*r);
        p = 2*3.1415*r;

        System.out.println("El area y perimetro de tu circulo son:");
        System.out.println("Area: "+a);
        System.out.println("Longitud de la cincunferencia (perimetro): "+p);
    }

}