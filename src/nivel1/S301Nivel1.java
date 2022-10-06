package nivel1;

import java.util.ArrayList;
import java.util.Scanner;

public class S301Nivel1 {

	public static void main(String[] args) {
		 boolean sortir = false;
	       
	        do{
	            switch(menu()){
	                case 1: metode1();
	                	break;
	                case 2: metode2();
	                	break;
	                case 0: System.out.println("Gràcies per utilitzar l'aplicació");
	                		sortir = true;
	                        break;
	            }
	        }while(!sortir);   
	    }
	   
	    public static byte menu(){
	        Scanner entrada = new Scanner(System.in);
	        byte opcio;
	        final byte MINIMO = 0;
	        final byte MAXIMO = 2;

	        do{
	            System.out.println("\nMENú PRINCIPAL");
	            System.out.println("1. Agregar a la lista");
	            System.out.println("2. Consultar lista");
	            System.out.println("0. Sortir de l'aplicació.\n");
	            opcio = entrada.nextByte();
	            if(opcio < MINIMO || opcio > MAXIMO){
	                System.out.println("Escull una opció vàlida");
	            }
	        }while(opcio < MINIMO || opcio > MAXIMO);
	        return opcio;
	    }
	   
	   public static void metode1(){
	    	Scanner scn = new Scanner(System.in);
	    	String producto = null;
	    	
	        System.out.println("Que producto desea agregar a la lista?");
	        producto = scn.nextLine();
	        UndoSingleton.getIntance().addToArray(producto);
	    }
	   
	    public static void metode2(){
	    	ArrayList<String> array = UndoSingleton.getIntance().getArray();
	    	for (int i=0; i<array.size(); i++) {
	    		System.out.println(array.get(i));
	    	}
	    }
}
