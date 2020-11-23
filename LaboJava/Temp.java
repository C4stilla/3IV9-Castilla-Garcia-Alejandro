import java.util.Scanner;

public class Temp{

    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);

        double centigrados, r;

        System.out.println("Ingrese el valor en grados centigrados :3");
        centigrados = entrada.nextInt();

        r = 32 + (9*centigrados/5);

        System.out.println("El resultado es: " + r);
    }

}