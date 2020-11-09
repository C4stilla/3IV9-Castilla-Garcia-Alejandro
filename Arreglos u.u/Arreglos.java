import java.util.*;
public class Arreglos{
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        int opcion;
        char letra;

        Arreglos mePyN = new Arreglos();
        Arreglos meCasillasP = new Arreglos();
        Arreglos meCalificaciones = new Arreglos();
        Arreglos meSM = new Arreglos();

        do{
            System.out.println("Escoge el programa que quieres utilizar nwn/");
            System.out.println("1.- Numeros positivos y negativos");
            System.out.println("2.- Numeros en casillas pares");
            System.out.println("3.- Calificaciones");
            System.out.println("4.- Suma de matrices");

            opcion = entrada.nextInt();

            switch(opcion){
                case 1:
                    do{
                        mePyN.PyN();
                        System.out.println("Para salir del programa presiona 's' si deseas repetirlo presiona 'r'");
                        letra = entrada.next().charAt(0);
                    }while(letra == 'r');
                break;
                case 2:
                    do{
                        meCasillasP.CasillasP();
                        System.out.println("Para salir del programa presiona 's' si deseas repetirlo presiona 'r'");
                        letra = entrada.next().charAt(0);
                    }while(letra == 'r');
                break;
                case 3:
                    do{
                        meCalificaciones.Calificaciones();
                        System.out.println("Para salir del programa presiona 's' si deseas repetirlo presiona 'r'");
                        letra = entrada.next().charAt(0);
                    }while(letra == 'r');
                break;
                case 4:
                    do{
                        meSM.SM();
                        System.out.println("Para salir del programa presiona 's' si deseas repetirlo presiona 'r'");
                        letra = entrada.next().charAt(0);
                    }while(letra == 'r');
                break;
            }
        System.out.println("Para sair del menu presiona 's' en caso contrario presiona 'c'");
        letra = entrada.next().charAt(0);
        }while(letra == 'c');
    }
    public void PyN(){
        
        Scanner entrada = new Scanner(System.in);
        
        int numeros[] = new int [10];
        int p = 0;
        int n = 0;
        int cero = 0;
        int i;
        double proP = 0;
        double proN = 0;
        double sumaP = 0;
        double sumaN = 0;
        
        System.out.println("Ingresa diez numeros enteros nwu");
        for (i = 0; i < numeros.length; i++){
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }
        for (i = 0; i < numeros.length; i++){
            if (numeros[i] > 0){
                p++;
                sumaP = sumaP + numeros[i];
            }
            else if (numeros[i] < 0){
                n++;
                sumaN = sumaN + numeros[i];
            }
            else {
                cero++;
            }
        }
        proP = sumaP/p;
        proN = sumaN/n;
        if(proP <= 0){
            System.out.println("No hay numeros positivos unu");
        }
        else{
            System.out.println("El promedio de positivos es de: " + proP);
        }

        if(proN >= 0){
            System.out.println("No hay numeros negativos unu");
        }
        else{
            System.out.println("El promedio de negativos es de: " + proN);
        }
    }
    public void CasillasP(){

        Scanner entrada = new Scanner(System.in);

        int numeros[] = new int [10];
        int i;
        double proP = 0;

        System.out.println("Ingrese diez numeros enteros uwu");
        for (i = 0; i < 10; i++) {
            System.out.print("Numero " + i + ": ");
            numeros[i] = entrada.nextInt();
        }
        for (i = 0; i < 10; i++) {
            if (i % 2 == 0){
                proP = proP + numeros[i];
            }
        }

        System.out.println("El promedio de los valores ubicados en posiciones pares es: " + proP/5);              
    }
    public void Calificaciones(){
 
        Scanner entrada = new Scanner(System.in);
        
        int numeros[] = new int[10];
        int resultados[] = new int [10];
        int rep = 0;
        int ap = 0;
        int i, pro, min, max, suma = 0;

        min=max=numeros[0];

        System.out.println("Ingrese diez calificaciones ;-;");
        for (i = 0; i < numeros.length; i++) {
            System.out.print("Calificacion num " + (i + 1) + ": ");
            numeros[i] = entrada.nextInt();
        }
        for (i = 0; i < numeros.length; i++) {
            suma = suma + numeros[i];
            if (numeros[i] <= 5) {
                rep++;
            }
            else if (numeros[i] >= 6){
                ap++;
            }
            if(min>numeros[i])
			{
				min=numeros[i];
			}
			if(max<numeros[i])
			{
				max=numeros[i];
            }
        }
        for (i = 0; i < numeros.length; i++){
            resultados [i] = numeros[i] * 1;
        }
        System.out.println("Calificaciones:");
        for (i = 0; i < numeros.length; i++){
            System.out.println(resultados[i]);
        }
        pro = suma/numeros.length;
        System.out.println("Promedio del grupo: " + pro);
        System.out.println("Calificacion mas alta: " + max);
        System.out.println("Calificacion mas baja: " + min);
        System.out.println("Listado de calificaciones superiores al promedio: ");
        for (i = 0; i < numeros.length; i++) {
            if (numeros[i] > pro) {
                System.out.println("Calificacion en la posicion: " + (i + 1));
            }
        }
        System.out.println("Total de aprobados: " + ap);
        System.out.println("Total de reprobados: " + rep);
    }
    public void SM(){

        Scanner entrada = new Scanner (System.in);
        
        int matrizA[][] = new int [3][3];
        int matrizB[][] = new int [3][3];
        int matrizS[][] = new int [3][3];
        int i, j;

        System.out.println("Datos de la matriz A nwn");
        for (i = 0; i <= 2; i++){
            for (j = 0; j <= 2; j++){
                System.out.print("Escribe el valor de [" + i + "] [" + j + "]: ");
                matrizA[i][j] = entrada.nextInt();
            }
        }
        System.out.println("Datos de la matriz B nwn");
        for (i = 0; i <= 2; i++){
            for (j = 0; j <= 2; j++){
                System.out.print("Escribe el valor de [" + i + "] [" + j + "]: ");
                matrizB[i][j] = entrada.nextInt();
            }
        }
        for (i = 0; i <= 2; i++){
            for (j = 0; j <= 2; j++){
                 matrizS[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        System.out.println("Matriz resultante de la suma:");
        for (i = 0; i <= 2; i++){
            for (j = 0; j <= 2; j++) {
                System.out.println(matrizS[i][j]);
            }           
        }
    }
}