import java.util.*;
//Desperdiciar RAM es mi pasion *Carita con lentes de sol cool*
class MenuUwU{
    
    Scanner entrada = new Scanner(System.in);

    int opcion;

    public void Programas() {
    
       do{
            Sueldos obj = new Sueldos();
            Proovedores ob = new Proovedores();
            Biblioteca obje = new Biblioteca();

            System.out.println("Bienvenido bb 7u7r");
            System.out.println("Elije una de las siguientes opciones:");
            System.out.println("1. Sueldos");
            System.out.println("2. Proovedores");
            System.out.println("3. Biblioteca");
            System.out.println("4. No hay nada aqui realmente solo te saldras  del programa ;-;");
            opcion = entrada.nextInt();

            switch (opcion) {
                case 1:
                    obj.Sueldos();
                break;
                case 2:
                    ob.Proovedores();
                break;
                case 3:
                    obje.Biblioteca();
                break;
                case 4:
                    System.out.println("Gracias por venir a usarme *w*");
                break;
            }
        }while (opcion != 4);
    }
}