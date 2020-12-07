import java.util.Scanner;

public class MenuUwU {

    private int total = 0;
    private int opc;
    private int compra;

    public void MenuOperaciones(){

        Scanner entrada = new Scanner(System.in);

        int OwO;
        String que = null;
        final int precio[] = new int[16];
        precio[0] = 75;
        precio[1] = 89;
        precio[2] = 112;
        precio[3] = 135;
        precio[4] = 89;
        precio[5] = 115;
        precio[6] = 135;
        precio[7] = 175;
        precio[8] = 96;
        precio[9] = 119;
        precio[10] = 131;
        precio[11] = 167;
        precio[12] = 88;
        precio[13] = 97;
        precio[14] = 111;
        precio[15] = 157;


        PizzaOwO picsa = null;
        System.out.println("Bievenido a la pizzzeria de Castilla seguro habra algo que te guste, ademas de mi claro ;3");
        System.out.println("Dime el tama\u00f1o de tu orden guapo *w*/");
        compra = entrada.nextInt();
        while (compra < 1) {
            do {
                System.out.println("JA, JA, JA, te llamaron del circo deberias contestar");
                compra = entrada.nextInt();
            } while (compra < 1);
        }
        PizzaOwO pizaCool [] = new PizzaOwO[compra];

        for (int i = 0; i < compra; i++) {


            System.out.println("Digame, de que la va a llevar wero");
            System.out.println("1.- Pizza de Queso");
            System.out.println("2.- Pizza de Peperoni");
            System.out.println("3.- Pizza Vegetariana");
            opc = entrada.nextInt();
            while (opc < 1 || opc > 3) {
                do {
                    System.out.println("JA, JA, JA, tremenda comedia, casi me matas de la risa");
                    opc = entrada.nextInt();
                } while (opc < 1 || opc > 3);
            }
            System.out.println("Dime de que tama\u00f1o bb uwu");
            System.out.println("1. Chica");
            System.out.println("2. Mediana");
            System.out.println("3. Grande");
            System.out.println("4. Familiar");
            OwO = entrada.nextInt();
            while (OwO < 1 || OwO > 4) {
                do {
                    System.out.println("Debes dejar de hacer tantos chistes o romperas mi caja de la risa");
                    OwO = entrada.nextInt();
                } while (OwO < 1 || OwO > 4);
            }


            switch(opc){
                case 1:
                    /*
                    aquí es donde se implementa el polimorfismo                    
                    */
                    picsa = new Queso();

                    Queso ques = new Queso();
                    ques.elegirtipoqueso();

                    picsa.hornear();
                    picsa.cortar(OwO);
                    picsa.empacar();
                    if (ques.equals("Mozzarela")){
                        total += precio[OwO-1];
                    }else{
                        total += precio[OwO+3];
                    }

                    break;
                case 2:
                    picsa = new Peperonni();
                    Peperonni Pep = new Peperonni();
                    Pep.elegirpeperoni();
                    picsa.hornear();
                    picsa.cortar(OwO);
                    picsa.empacar();
                    total += precio[OwO+7];

                    break;
                case 3:
                    picsa = new Vegetariana();
                    Vegetariana Veg = new Vegetariana();
                    Veg.elegiringredientes();
                    picsa.hornear();
                    picsa.cortar(OwO);
                    picsa.empacar();
                    total += precio[OwO+11];
                break;
            }
        }
        System.out.println("Aqui esta su cuenta joven, son: "+total);
    }
}