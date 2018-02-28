package br.pro.hashi.ensino.desagil.tequilada;

import java.io.*;

public class Main {
	public static void main(String[] args){
		
		
		Engine  vrumVrum = new Engine();
        vrumVrum.gen();
       
        System.out.println("Game Over");
        
        
        /*
		System.out.println("Projeto 1");
		
		String thisLine;
		
		     try {
		       BufferedReader br = new BufferedReader(new FileReader("teste.txt"));
		       while ((thisLine = br.readLine()) != null) { // while loop begins here
		         System.out.println(thisLine);
		         StringBuilder newString = new StringBuilder(thisLine);
		         int x = 0;
		         while (x < newString.length()){
		        	 if (newString.charAt(x) == '#') newString.setCharAt(x, 'X');
		        	 x++;
		         }
		         System.out.println(newString);
		       } // end while 
		     } // end try
		     catch (IOException e) {
		       System.err.println("Error: " + e);
		     }
	*/	
	}
}
