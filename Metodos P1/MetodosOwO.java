import java.util.Scanner;
import java.util.*;

public class MetodosOwO{

    public void menu(){

        Scanner entrada = new Scanner(System.in);
        int  opcion;
        char letra;
        
        do{
            System.out.println("Seleccione el programa que desea ejecutar");
            System.out.println("1.- Calculadora de edad");
            System.out.println("2.- Area y perimetro");
            System.out.println("3.- Llamadas");
            
            opcion = entrada.nextInt();

            switch(opcion){
                case 1:
                    do{
                    Edad obj = new Edad();
                    obj.Edad();
                    System.out.println("Para reptir el programa presiona'r' y para salir 's'");
                    letra = entrada.next().charAt(0);
                    }while(letra == 'r');
                break;
                case 2:
                    do{
                    AyP obj = new AyP();
                    obj.Figuras();
                    System.out.println("Para reptir el programa presiona 'r' y para salir 's'");
                    letra = entrada.next().charAt(0);
                    }while(letra == 'r');
                break;
                case 3:
                    do{
                    Llamadas obj = new Llamadas();
                    obj.Cel();
                    System.out.println("Para reptir el programa presiona 'r' y para salir 's'");
                    letra = entrada.next().charAt(0);
                    }while(letra == 'r');
                break;
            }
            System.out.println("Si desea regresar al menu presione 'm' para cerrar el programa presiona 's'");
            letra = entrada.next().charAt(0);
        }while(letra == 'm');
    }
}