import java.util.Scanner;

    class MenuDeFiguras{

        public static void main(String[] args){
            Scanner entrada = new Scanner(System.in);
            int altura, base, apotema, radio, opcion;
            char letra;
            double resultado;

            do{

                System.out.println("Bienvenido al programa de calculo de areas y perimetros");
                System.out.println("Elija una de las siguientes opciones");
                System.out.println("Calcular area de un cuadrado");
                System.out.println("Calcular area de un triangulo");
                System.out.println("Calcular area de un circulo");
                System.out.println("Calcular area de un rectangulo");
                System.out.println("Calcular area de un rombo");
                System.out.println("Calcular area de un hexagono");
                System.out.println("Calcular perimetro de un cuadro");
                System.out.println("Calcular perimetro de un triangulo");
                System.out.println("Calcular perimetro de un circulo");
                System.out.println("Calcular perimetro de un rectangulo");
                System.out.println("Calcular perimetro de un rombo");
                System.out.println("Calcular perimetro de un hexagono");

                opcion = entrada.nextInt();

                    switch(opcion){
                        case 1:
                            System.out.println("Ingresa el valor de un lado");
                            base = entrada.nextInt();
                            resultado = base*base;
                            System.out.println("El area es de: "+resultado);
                        break;

                        case 2:
                            System.out.println("Ingresa el valor de la base");
                            base = entrada.nextInt();
                            System.out.println("Ingresa el valor de la altura");
                            altura = entrada.nextInt();
                            resultado = (base*altura)/2;
                            System.out.println("El area es de: "+resultado);
                        break;

                        case 3:
                            System.out.println("Ingresa el valor del radio");
                            base = entrada.nextInt();
                            resultado = 3.1416*(base*base);
                            System.out.println("El area es de: "+resultado);
                        break;

                        case 4:
                            System.out.println("Ingresa el valor de la base");
                            base = entrada.nextInt();
                            System.out.println("Ingresa el valor de la altura");
                            altura = entrada.nextInt();
                            resultado = base*altura;
                            System.out.println("El area es de: "+resultado);
                        break;

                        case 5:
                            System.out.println("Ingresa el valor de la diagonal menor");
                            base = entrada.nextInt();
                            System.out.println("Ingresa el valor de la diagonal mayor");
                            altura = entrada.nextInt();
                            resultado = (base*altura)/2;
                            System.out.println("El area es de "+ resultado);
                        break;

                        case 6:
                            System.out.println("Ingresa el valor del apotema");
                            apotema = entrada.nextInt();
                            System.out.println("ingresa el valor del perimetro");
                            base = entrada.nextInt();
                            resultado = (apotema*base)/2;
                            System.out.println("El area es de "+resultado);
                        break;

                        case 7:
                            System.out.println("Ingresa el valor de la base");
                            base = entrada.nextInt();
                            resultado = base*4;
                            System.out.println("El perimetro es de "+ resultado);
                        break;

                        case 8:
                            System.out.println("Ingresa el valor de un lado");
                            base = entrada.nextInt();
                            resultado = base*3;
                            System.out.println("El perimetro es de "+ resultado);
                        break;

                        case 9:
                            System.out.println("Ingresa el valor del radio");
                            radio = entrada.nextInt();
                            resultado = 2*3.1415*radio;
                            System.out.println("El perimetro es de "+ resultado);
                        break;

                        case 10:
                            System.out.println("Ingresa el valor de la base");
                            base = entrada.nextInt();
                            System.out. println("Ingresa el valor de la altura");
                            altura = entrada.nextInt();
                            resultado = (base*2)+(altura*2);
                            System.out.println("El perimetro es de "+ resultado);
                        break;

                        case 11:
                            System.out.println("Ingresa el valor de un lado");
                            base = entrada.nextInt();
                            resultado = base*4;
                            System.out.println("El perimetro es de "+ resultado);
                        break;

                        case 12:
                            System.out.println("Ingresa el valor de un lado");
                            base = entrada.nextInt();
                            resultado = base*6;
                            System.out.println("El perimetro es de "+ resultado);
                        break;
                    }

                    System.out.println("Desea continuar?, presione 'c'");
                    letra = entrada.next().charAt(0);

            }while(letra == 'c');

        }

    }