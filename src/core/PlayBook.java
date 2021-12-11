package core;


import java.util.ArrayList;
import java.util.Scanner;

public class PlayBook {
	public static void main(String[]args)
    {

		
			Scanner src = new Scanner(System.in);
	  int num1= src.nextInt();
	  int sol1= src.nextInt();
	  String mon1= src.next();
	  String type1= src.next();
	  String etat1= src.next();
	  
	  
	  
	  Compte.Enregistrer(num1, sol1,type1, mon1, etat1);
	  
    }

}
