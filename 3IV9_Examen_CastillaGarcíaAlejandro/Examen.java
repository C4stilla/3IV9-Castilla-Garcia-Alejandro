import java.util.Scanner;
import java.util.*;
import java.io.*;
class Examen{
    public static void main(String[] args) throws IOException {
        Scanner entrada = new Scanner(System.in);
        int charmander, bulbasoar, squartle, Vida, vida2, id, ataque, ataque2, eleccion, fuerza, defensa, pokemon;
        Vida = 100;
        fuerza = 200;
        defensa = 150;
        //*Voy a declarar estos tres aqui porque todos los pokemon que puse son normales ninguno es tipo celestial así que
        //*comparten nivel de vida 
        System.out.println("Este programa fue hecho por:");
        System.out.println("Castilla Garcia Alejandro 3IV9");
        System.out.println("  ");
        System.out.println("Hola otaku promedio UwU/");
        System.out.println("Bienvenido a la Pokedex");
        //*No sé si es necesario mi nombre pero precaución ANTIPLAGIO xd
        do{
            System.out.println("Escoge un Pokemon y te dare sus datos");
            System.out.println("1.- Charmander");
            System.out.println("2.- Bulbasoar");
            System.out.println("3.- Squartle");
            System.out.println("4.- Batalla pokemon");
            System.out.println("5.- Salir");
            
            //*Esto basicamente es lo mismo qu en la tarea un elige y te dire xd

            eleccion = entrada.nextInt();
            
            switch(eleccion){
                //*creo que esta es la parte mas cencilla ya que solo cambian los datos pero la estructura es la misma
                //*Igual lo haremos copiando y pegando uwu
                case 1:
                    ataque = 100;
                    ataque2 = 75;
                    id = 15736;
                    System.out.println("Charmander");
                    System.out.println("1.- Vida " + Vida);
                    System.out.println("2.- ID " + id);
                    System.out.println("3.- Nombre: Charmander");
                    System.out.println("4.- Su fuerza es de " + fuerza );
                    System.out.println("5.- Su defenza es de " + defensa);
                    System.out.println("6.- Ataque es de " + ataque);
                    System.out.println("7.- Ataque secundario es " + ataque2);
                break;
                case 2:
                    id = 15736;
                    ataque = 125;
                    ataque2 = 75;
                    System.out.println("Bulbasoar");
                    System.out.println("1.- Vida " + Vida);
                    System.out.println("2.- ID " + id);
                    System.out.println("3.- Nombre: Bulbasoar ");
                    System.out.println("4.- Su fuerza es de " + fuerza );
                    System.out.println("5.- Su defenza es de " + defensa);
                    System.out.println("6.- Ataque es de " + ataque);
                    System.out.println("7.- Ataque secundario es " + ataque2);
                break;
                case 3:
                    id = 15986;
                    ataque = 200;
                    ataque2 = 150;
                    System.out.println("Squartle");
                    System.out.println("1.- Vida " + Vida);
                    System.out.println("2.- ID " + id);
                    System.out.println("3.- Nombre: Squartle");
                    System.out.println("4.- Su fuerza es de " + fuerza );
                    System.out.println("5.- Su defenza es de " + defensa);
                    System.out.println("6.- Ataque es de " + ataque);
                    System.out.println("7.- Ataque secundario es " + ataque2);
                break;
                //*Vamos a pasar a el ambiente de pelea y estoy seguro de que hay mejores formas
                //*Pero por ahora lo hare con puros "if" xd 
                case 4:
                    System.out.println("Bienvenido al modo de batalla Otaku");
                    System.out.println("Empecemos");
                    System.out.println("Primero escoge tu pokemon peleador");
                    System.out.println("Tu oponente se elegira automaticamente UwU/");
                    System.out.println("Charmander");
                    System.out.println("Bulbasoar");
                    System.out.println("Squartle");
                    pokemon = entrada.nextInt();
                    if (pokemon == 1){
                    System.out.println("Peleara charmander");
                    System.out.println("Tu enemigo sera bulbasour");
                    System.out.println("Elige tu ataque, (1= primario, 2= secundario");
                    ataque = entrada.nextInt();
                    if (ataque == 1){
                    System.out.println("Tu ataque contra bulbasour (planta) con un ataque tipo fuego es critico y bulbasour es derrotado");
                    }else{
                    System.out.println("Tu ataque contra bulbasour (planta) con un ataque tipo fuego es critico y bulbasour es derrotado");
                    System.out.println("Bulbasor ha sufrido un Fatalyti UnU");
                    }
                    }
                    if (pokemon == 3){
                    System.out.println("Peleara squartle");
                    System.out.println("Tu enemigo sera charmander");
                    System.out.println("Elige tu ataque, (1= primario, 2= secundario");
                    ataque = entrada.nextInt();
                    if (ataque == 1){
                    System.out.println("Tu ataque contra charmander (fuego) con un ataque tipo agua es critico y charmander es derrotado");
                    }else{
                    System.out.println("Tu ataque contra charmander (fuego) con un ataque tipo agua es critico y charmander es derrotado");
                    System.out.println("charmander ha sido derrotado y esta cansado");
                    }
                    }
                    if (pokemon == 2){
                    System.out.println("Peleara bulbasour");
                    System.out.println("Tu enemigo sera squartle");
                    System.out.println("Elige tu ataque, (1= primario, 2= secundario");
                    ataque = entrada.nextInt();
                    if (ataque == 1){
                    System.out.println("Tu ataque contra squartle (agua) con un ataque tipo planta es critico y squartle es derrotado");
                    }else{
                    System.out.println("Tu ataque contra squartle (agua) con un ataque tipo planta es critico y squartle es derrotado");
                    System.out.println("squartle ha sido derrotado y esta cansado");
                    }
                    }
                break;
            }
        } while(eleccion != 5);
    }
}