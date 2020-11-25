import java.util.*;
public class Sueldos{

    int id, puesto, SueldoExD, SueldoExN;

    double gasto, sueldo;
    double SueldoE = 5000;
    double SueldoS = 8000;
    double infonavit = 8;
    double ISR = 16; 
    double SGM = 12.8;
    String NombreC;

    /*
    Joder aquí toco pre-calcular porque me ahorra unas cuantas lineas de código xd
    */

    Scanner entrada = new Scanner(System.in);

    public void Sueldos(){

        Sueldos obj = new Sueldos();

        obj.Dinero();
    }
    public void Dinero(){

        System.out.println("Dime tu ID :3");
        id = entrada.nextInt();
        System.out.println("Ahora tu Nombre");
        NombreC = entrada.next();
        
        do{
            System.out.println("Ingresa tu puesto de trabajo unu");
            System.out.println("1. Proletariado basico UnU (Empleado)");
            System.out.println("2. Proletariado VIP (Supervisor)");
            puesto = entrada.nextInt();
        }while (puesto > 2 ||  puesto < 1);
        if(puesto == 1){
            Empleado();
        }
        else{
            Supervisor();
        }
    }
    public void Empleado(){
        System.out.println("Dime la cantidad de horas extra trabajadas en horario de dia ;-;");
        int SueldoExD = entrada.nextInt();
        System.out.println("Dime la cantidad de horas extra trabajadas en horario de noche nwn");
        int SueldoExN = entrada.nextInt();

        SueldoExD = SueldoExD*50;
        SueldoExN = SueldoExN*60;
        sueldo = SueldoE + SueldoExD + SueldoExN;
        Total();
    }
    public void Supervisor(){
        gasto = infonavit + ISR + SGM;
        sueldo = SueldoS - gasto;
        Total();
    }
    public void Total(){
        System.out.println("El sueldo de: "+id+" "+NombreC+" es de: $" +sueldo+" *w*");
    }
}