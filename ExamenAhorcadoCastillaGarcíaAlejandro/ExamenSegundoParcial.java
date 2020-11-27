import java.util.*;
import javax.swing.JOptionPane;	


public class ExamenSegundoParcial{

    public ExamenSegundoParcial(){}
    Scanner entrada = new Scanner(System.in);
    public String palabra;
    private int ultimaletra, letradeM, tampal;
    private char ultimal, lertraMedia;
    
    public void palabra(String palabra){
        this.palabra = palabra;
        this.ultimaletra = ultimaletra;
        this.letradeM = letradeM;
        this.ultimaletra = ultimaletra;
        this.lertraMedia = lertraMedia;
    }
    public String GetPalabra(){
        return palabra;
    }
    public void SetPalabra(String palabra){
        this.palabra = palabra;
    }
    public int GetTampal(){
        return tampal;
    }
    public void SetTampal(int tampal){
        this.tampal = tampal;
    }
    	    
    public void Eleccion(){
        try{
            	            
            System.out.println("Programa hecho por:");
            System.out.println("Castilla Garcia Alejandro");
            System.out.println("Recuerda \nTienes 5 vidas y se restan 1 por cada equivocacion, si llegas a 2 pierdes");
            System.out.println("Dime la palabra que alguien mas tratara de encontrar: ");
            palabra = entrada.next();
            ultimaletra = palabra.length()-1;
            ultimal = palabra.charAt(ultimaletra);
            letradeM = palabra.length()/2;
            lertraMedia = palabra.charAt(letradeM);
            	            
            System.out.println("Pistas: ");
            System.out.println("Inicia con: "+palabra.charAt(0));
            System.out.println("Letra aleatoria de la palabra: "+lertraMedia);
            System.out.println("La palabra termina con: "+ultimal);
        }
        catch(NullPointerException e){
            System.out.println("Has finalizado este pograma");
        }
        	        
    }
    public void tampal(){
        tampal = palabra.length();
    }
    	    
}