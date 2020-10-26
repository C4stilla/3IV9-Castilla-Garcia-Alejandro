import java.util.Scanner;
import java.util.*;
import java.io.*;
class EstructuraDatos{
    public static void main(String[] args) throws IOException{
        Scanner entrada = new Scanner(System.in);
        int opcion, edad, temp, numero, base, altura, ladoa, ladob, radio, condon, chocolate, cerveza, paleta;
        char letra, temperatura, convertir;
        double primero, segundo, area, perimetro, volumen, resultado, monto, uno, dos, tres; 
        
        do{        
            System.out.println("Este programa fue elaborado por:");
            System.out.println("3IV9 Castilla Garcia Alejandro");
            System.out.println("Elija la opcion que desea:");
            System.out.println("1.o Aplicar descuento.");
            System.out.println("2.o Conversion de decimales a binarios.");
            System.out.println("3.o Conversin de temperaturas.");
            System.out.println("4.o Identificador de positivos y negativos.");
            System.out.println("5.o Precio.");
            System.out.println("6.o Area, perimetro o volumen.");
            System.out.println("7.o Tabla de valores.");
            System.out.println("8.o Calcular factorial.");
            System.out.println("9.o Cuadrado de asteriscos.");
            System.out.println("10.o Cuadrado de asteriscos hueco.");
            System.out.println("11.o Patron de asteriscos.");
            System.out.println("12.o Diamante de asteriscos.");
            System.out.println("13.o Calculadora.");
            System.out.println("14.o Salir.");
            
            opcion = entrada.nextInt();
            
            switch(opcion) {
                case 1:
                    do{
                    System.out.println("Por favor, digite su edad.");
                    edad = entrada.nextInt();
                    if(edad > 65){
                    System.out.println("Su descuento es del 40 %. Gracias por su visita.");
                    }
                    if(edad < 21){
                    System.out.println("¿Tus padres son socios de este establecimiento? Escriba s o n.");
                    letra = entrada.next().charAt(0);
                    }
                    letra = entrada.next().charAt(0);
                    if(letra == 's'){
                    System.out.println("Su descuento es de 45 %. Gracias por su visita.");
                    }
                    else if(letra == 'n'){
                    System.out.println("Su descuento es de 25 %. Gracias por su visita.");
                    }
                    if(edad >= 21 & edad <= 65){
                    System.out.println("Gracias por su visita.");
                    }
                    System.out.println("Digite r si desea repetir el programa.");
                    System.out.println("Si desea volver al menu, digite m.");
                    letra = entrada.next().charAt(0);
                    }while(letra ==  'r');
                break;
                case 2:
                    do{
                    System.out.println("Ingrese un numero entero y positivo para covertirlo al sistema binario.");
                    numero = entrada.nextInt ();
                    String binario = "";
                    if (numero > 0){
                    while (numero > 0){
                    if (numero % 2 == 0){
                        binario = "0" + binario;
                    }
                    else{
                        binario = "1" + binario;
                    }
                    numero = (int) numero/2;
                    }
                    }
                    else if(numero == 0){
                    binario = "0";
                    }
                    else{
                    binario = "Por favor, ingrese solo numeros positivos";
                    }
                    System.out.println("La conversion resulta en: " + binario + ".");
                    System.out.println("Digite r si desea repetir el programa.");
                    System.out.println("Si desea volver al menu, digite m.");
                    letra = entrada.next().charAt(0);
                    }while(letra ==  'r');
                break;
                case 3:
                    do{                
                    temp = 0;
                    System.out.println("Digite la temperatura.");
                    temp = entrada.nextInt();
                    System.out.println("C = Celsius. F = Farenheit. K = Kelvin. R = Rankine.");
                    System.out.println("Con base en la anterior nomenclatura, digite la unidad de su temperatura inicial:");
                    temperatura = entrada.next().charAt(0);
                    System.out.println("Digite, con base en la nomenclatura, la unidad en que se convertir\u00e1:");
                    convertir = entrada.next().charAt(0);
                    if(temperatura == 'C' & convertir == 'C'){
                    System.out.println("El valor es igual. Digite una conversion valida.");
                    }
                    else if(temperatura == 'C' & convertir == 'F'){
                    resultado = temp*33.8;
                    System.out.println("El resultado es: " + resultado);
                    }
                    else if(temperatura == 'C' & convertir == 'K'){
                    resultado = temp*274.15;
                    System.out.println("El resultado es: " + resultado);
                    }
                    else if(temperatura == 'C' & convertir == 'R'){
                    resultado = temp*493.47;
                    System.out.println("El resultado es: " + resultado);
                    }
                    if(temperatura == 'F' & convertir == 'F'){
                    System.out.println("El valor es igual. Digite una conversion valida.");
                    }
                    else if(temperatura == 'F' & convertir == 'C'){                        
                    resultado = temp*-17.22;
                    System.out.println("El resultado es: " + resultado);
                    }
                    else if(temperatura == 'F' & convertir == 'K'){
                    resultado = temp*255.92;
                    System.out.println("El resultado es: " + resultado);
                    }
                    else if(temperatura == 'F' & convertir == 'R'){
                    resultado = temp*460.67;
                    System.out.println("El resultado es: " + resultado);
                    }
                    if(temperatura == 'K' & convertir == 'K'){
                    System.out.println("El valor es igual. Digite una conversion valida.");
                    }
                    else if(temperatura == 'K' & convertir == 'F'){
                    resultado = temp*-457.87;
                    System.out.println("El resultado es: " + resultado);
                    }
                    else if(temperatura == 'K' & convertir == 'C'){
                    resultado = temp*-272.15;
                    System.out.println("El resultado es: " + resultado);
                    }
                    else if(temperatura == 'K' & convertir == 'R'){
                    resultado = temp*1.8;
                    System.out.println("El resultado es: " + resultado);
                    }
                    if(temperatura == 'R' & convertir == 'R'){
                    System.out.println("El valor es igual. Digite una conversion valida.");
                    }
                    else if(temperatura == 'R' & convertir == 'F'){
                    resultado = temp*-458.67;
                    System.out.println("El resultado es: " + resultado);
                    }
                    else if(temperatura == 'R' & convertir == 'K'){                        
                    resultado = temp*0.55;
                    System.out.println("El resultado es: " + resultado);
                    }
                    else if(temperatura == 'R' & convertir == 'C'){
                    resultado = temp*-272.594;
                    System.out.println("El resultado es: " + resultado);
                    }
                    System.out.println("Digite r si desea repetir el programa.");
                    System.out.println("Si desea volver al menu, digite m.");
                    letra = entrada.next().charAt(0);
                    }while(letra ==  'r');
                break;
                case 4:
                    do{
                    System.out.println("Digita tres numeros y te diremos cuantos son positivos o negativos.");
                    uno = entrada.nextDouble();
                    dos = entrada.nextDouble();
                    tres = entrada.nextDouble();
                    if(uno == 0){
                    System.out.println("El primer numero es neutro.");
                    }
                    else if(uno < 0){
                        System.out.println("El primer numero es negativo.");
                    }
                    else{
                        System.out.println("El primer numero es positivo.");
                    }
                    if(dos == 0){
                    System.out.println("El segundo numero es neutro.");
                    }
                    else if(dos < 0){
                        System.out.println("El segundo numero es negativo.");
                    }                
                    else{
                    System.out.println("El segundo numero es positivo.");
                    }
                    if(tres == 0){
                    System.out.println("El tercer numero es neutro.");
                    }
                    else if(tres < 0){
                    System.out.println("El tercer numero es negativo.");
                    }
                    else{
                    System.out.println("El tercer numero es positivo.");
                    }
                    System.out.println("Digite r si desea repetir el programa.");
                    System.out.println("Si desea volver al menu, digite m.");
                    letra = entrada.next().charAt(0);
                    }while(letra ==  'r');
                break;
                case 5:
                    do{
                    System.out.println("Ofrecemos los siguientes productos:");
                    System.out.println("Condon - 1 $. Chocolate - 5 $. Paleta - 8 $. Cerveza - 10 $.");
                    condon = 1;
                    chocolate = 5;
                    paleta = 8;
                    cerveza = 10;
                    monto = 0;
                    do{System.out.println("Por favor, digite cuatos condones has adquirido.");
                    condon = entrada.nextInt();
                    }while(condon < 0);
                    do{System.out.println("Por favor, digite cuantos chocolates ha adquirido.");
                    chocolate = entrada.nextInt();
                    }while(chocolate < 0);
                    do{System.out.println("Por favor, digite cuantas paletas ha adquirido.");
                    paleta = entrada.nextInt();
                    }while(paleta < 0);
                    do{System.out.println("Por favor, digite cuantas latas de cerveza ha adquirido.");
                    cerveza = entrada.nextInt();
                    }while(cerveza < 0);    
                    monto = (condon + chocolate + paleta + cerveza);
                    System.out.println("Sus productos suman un total de " + monto + " $. Gracias por su compra.");
                    System.out.println("Digite r si desea repetir el programa.");
                    System.out.println("Si desea volver al men\u00fa, digite m.");
                    letra = entrada.next().charAt(0);
                    }while(letra ==  'r');
                break;
                case 6:
                    do{System.out.println("Seleccione, con base en la siguiente nomenclatura, una funcion.");
                    System.out.println("1, area y perimetro de un rectangulo; 2, perimetro de un triangulo; 3, volumen de una esfera; 4, volumen de un cilindro.");
                    opcion = entrada.nextInt();
                    if(opcion == 1){
                    System.out.println("Introduce la base del rectangulo");
                    base = entrada.nextInt();
                    System.out.println("Introduce la altura del rectangulo");
                    altura = entrada.nextInt();
                    perimetro = base*altura;
                    area = 2*(base+altura);
                    System.out.println("El perimetro es de " + perimetro);
                    System.out.println("El area es de" + area);
                    }
                    if(opcion == 2){
                    System.out.println("Introduce la base del triangulo.");
                    base = entrada.nextInt();
                    System.out.println("Introduce, uno a uno, los dos lados restantes del triangulo.");
                    ladoa = entrada.nextInt();
                    ladob = entrada.nextInt();
                    System.out.println("Introduce la altura del triangulo");
                    altura = entrada.nextInt();
                    perimetro = base+ladoa+ladob;
                    area = altura*(base/2);
                    System.out.println("El perimetro es de " + perimetro);
                    System.out.println("El area es de" + area);
                    }
                    if(opcion == 3){
                    System.out.println("Introduce el radio de la esfera");
                    radio = entrada.nextInt();
                    System.out.println("Introduce la altura de la esfera");
                    altura = entrada.nextInt();
                    volumen = 4*3.14*((radio*radio*radio)/3);
                    System.out.println("El volumen es de " + volumen);
                    }
                    if(opcion == 4){
                    System.out.println("Introduce el radio del cilindro");
                    radio = entrada.nextInt();
                    System.out.println("Introduce la altura del cilindro");
                    altura = entrada.nextInt();
                    volumen = 3.14*(radio*radio)*altura;
                    System.out.println("El volumen es de " + volumen);
                    }
                    System.out.println("Digite r si desea repetir el programa.");
                    System.out.println("Si desea volver al menu, digite m.");
                    letra = entrada.next().charAt(0);
                    }while(letra ==  'r');
                break;
                case 7:
                    do{
                    System.out.println("Tabla con unidades, decenas, centenas y millares del uno al diez.");
                    System.out.println("\tN\t\t\t");
                    System.out.println("\t1\t10\t100\t1000");
                    System.out.println("\t2\t20\t200\t2000");
                    System.out.println("\t3\t30\t300\t3000");
                    System.out.println("\t4\t40\t400\t4000");
                    System.out.println("\t5\t50\t500\t5000");
                    System.out.println("\t6\t60\t600\t6000");
                    System.out.println("\t7\t70\t700\t7000");
                    System.out.println("\t8\t80\t800\t8000");
                    System.out.println("\t9\t90\t900\t9000");
                    System.out.println("\t10\t100\t1000\t1000");
                    System.out.println("Digite r si desea repetir el programa.");
                    System.out.println("Si desea volver al menu, digite m.");
                    letra = entrada.next().charAt(0);
                    }while(letra ==  'r');
                break;
                case 8:
                    do{
                    System.out.println("Introduzca el numero cuyo factorial desea conocer:");
                    int calculo = 0;

                    while(calculo < 1) {
                    try {
                    calculo = entrada.nextInt();
                    if(calculo < 1)
                    System.out.println("Por favor, introduzca un valor superior y distinto de 0.");
                    }catch(InputMismatchException e) {
                    System.out.println("Por favor, introduzca un valor numerico.");
                    entrada.nextLine();
                    }
                    }
                    long factorial = 1L;
                    for(int i = calculo; i > 0; i--) {
                    factorial=factorial*i;
                    }
                    System.out.println("El factorial de " + calculo + " es " + factorial + ".");
                    System.out.println("Digite r si desea repetir el programa.");
                    System.out.println("Si desea volver al menu, digite m.");
                    letra = entrada.next().charAt(0);
                    }while(letra ==  'r');
                break;
                case 9:
                    do{
                    System.out.println("No hay sistema joven UnU");
                    System.out.println("Digite r si desea repetir el programa.");
                    System.out.println("Si desea volver al menu, digite m.");
                    letra = entrada.next().charAt(0);
                    }while(letra ==  'r');
                break;
                case 10:
                    do{
                    System.out.println("No hay sistema joven UnU");
                    System.out.println("Digite r si desea repetir el programa.");
                    System.out.println("Si desea volver al menu, digite m.");
                    letra = entrada.next().charAt(0);
                    }while(letra ==  'r');
                break;
                case 11:
                    do{
                    System.out.println("No hay sistema joven UnU");
                    System.out.println("Digite r si desea repetir el programa.");
                    System.out.println("Si desea volver al menu, digite m.");
                    letra = entrada.next().charAt(0);
                    }while(letra ==  'r');
                break;
                case 12:
                    do{
                    System.out.println("No hay sistema joven UnU");
                    System.out.println("Digite r si desea repetir el programa.");
                    System.out.println("Si desea volver al menu, digite m.");
                    letra = entrada.next().charAt(0);
                    }while(letra ==  'r');
                break;
                case 13:
                  do{
                    System.out.println("Bienvenido a la super ultra calculadora de dos variables para machos.");
                    System.out.println("Por favor, digita el primer numero.");
                    primero = entrada.nextDouble();
                    System.out.println("Por favor, digita el segundo numero.");
                    segundo = entrada.nextDouble();
                    System.out.println("Por favor, digita la operacion a realizar con base en la siguiente nomenclatura.");
                    System.out.println("s = suma. d = resta. f = multiplicacion. g = division. h = residuo.");
                    letra = entrada.next().charAt(0);
                    if(letra == 's'){
                    resultado = primero+segundo;
                    System.out.println("El resultado de sumar " + primero + " mas " + segundo + " es: " + resultado);
                    }
                    if(letra == 'd'){
                    resultado = primero-segundo;
                    System.out.println("El resultado de restar " + primero + " menos " + segundo + " es: " + resultado);
                    }
                    if(letra == 'f'){
                    resultado = primero*segundo;
                    System.out.println("El resultado de multiplicar " + primero + " por " + segundo + " es: " + resultado);
                    }
                    if(letra == 'g'){
                    resultado = primero/segundo;
                    System.out.println("El resultado de dividir " + primero + " entre " + segundo + " es: " + resultado);
                    }
                    if(letra == 'h'){
                    resultado = primero%segundo;
                    System.out.println("El residuo de dividir " + primero + " entre " + segundo + " es: " + resultado);
                    }
                    System.out.println("Digite r si desea repetir el programa.");
                    System.out.println("Si desea volver al menu, digite m.");
                    letra = entrada.next().charAt(0);
                    }while(letra ==  'r');
                break;
                default:
                    System.out.println("Gracias por tomar parte.");   
            }
            System.out.println("Digite m nuevamente para salir al men\u00fa.");
            System.out.println("Digite x para cerrar el programa.");
            System.out.println("Este programa fue elaborado por:");
            System.out.println("3IV9 Castilla Garcia Alejandro");
            letra = entrada.next().charAt(0);

        }while(letra == 'm');
    }
} 