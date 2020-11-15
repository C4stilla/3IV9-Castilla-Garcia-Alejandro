import java.util.Scanner;

public class Edad{
    
    public void Edad(){
        
        Scanner entrada = new Scanner(System.in);

        int epoca, total;

        System.out.println("Te dire tu edad, solo dame un dato uwu/");
        System.out.println("Dime tu a\u00f1o de nacimiento nun");
        
        /*
        Ojo que tuve que buscar en internet como gacer que apareciera la eñe xd
        */

        epoca = entrada.nextInt();
        
        if(epoca > 2020){
            System.out.println("Ojo a la comedia");
            epoca = entrada.nextInt();   
        }
        else{
            total = (2020)-(epoca);
            System.out.println("Tu edad es de " + total);
        }
    }
}