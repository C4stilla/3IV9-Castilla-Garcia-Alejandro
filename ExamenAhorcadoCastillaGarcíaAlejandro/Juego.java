import java.util.*;
import javax.swing.JOptionPane;	

public class Juego extends ExamenSegundoParcial{


    Scanner entrada = new Scanner(System.in);

    private char letra;
    private int lei;


    public Juego(){}




    public void prueba(){	    
        Eleccion();	       
        tampal();	       
        char ahorcado[] = new char[GetTampal()-1];	       
      
        int k = 5;	       
        int i = 0;	        
        int j = 0;	       
        try{	       
            try{	           
                do{	               
                    System.out.println("Digite una letra UnU");
              	    letra = entrada.next().charAt(0);
                    lei = palabra.indexOf(letra);
                    	                    
                    if (lei != -1 ){
                     ahorcado[i] = letra;
                    System.out.println("Letra correcta UnU");
                       i++;
                        	                        
                    }	                 
                    else{	                
                        	                        
                        System.out.println("Letra incorrecta");	             
                        System.out.println("Puntuacion: "+k);	              
                        k -= 1;	                     
                        	                        
                    }	                
                    if (k == 1){	            
                        System.out.println("Has perdido");	                       
                        	                        
                    }	                
                }	              
                while(k>0);	        
                	                
            }	   
            	            
            catch (ArrayIndexOutOfBoundsException e){	   
                System.out.println("Has Ganado");	       
            }	         
        	        
            int opcion;	          
            System.out.println("Deseas volver a jugar UnU");	  
            System.out.println("1. Si");	  
            System.out.println("2. No");	       
            opcion = entrada.nextInt();	 
            if (opcion == 1){	    
                prueba();	       
            }	         
            else if (opcion == 2){	        
                System.out.println("Gracias por venir *w*");	         
            }	       
        }	      
        catch(NullPointerException e){	     
            System.out.println("F, tas bien bro?");	        
        }	   
    }	 
}