package core;


import java.util.ArrayList;

public class Compte {
	private static ArrayList<Integer> numero=     new ArrayList<Integer>();
	private static ArrayList<String> type =    new ArrayList<String>();
	private static ArrayList<String> monnaie=   new ArrayList<String>();
	private static ArrayList<Integer> solde =  new ArrayList<Integer>();
	private static ArrayList<String> etat   = new ArrayList<String>();








	public ArrayList<Integer> getNumero() {
		return numero;
	}




	public void setNumero(ArrayList<Integer> numero) {
		this.numero = numero;
	}




	public ArrayList<String> getType() {
		return type;
	}



	public void setType(ArrayList<String> type) {
		this.type = type;
	}




	public ArrayList<String> getMonnaie() {
		return monnaie;
	}



	public void setMonnaie(ArrayList<String> monnaie) {
		this.monnaie = monnaie;
	}



	public ArrayList<Integer> getSolde() {
		return solde;
	}



	public void setSolde(ArrayList<Integer> solde) {
		this.solde = solde;
	}


	public ArrayList<String> getEtat() {
		return etat;
	}


	public void setEtat(ArrayList<String> etat) {
		this.etat = etat;
	}





	public Compte(ArrayList<Integer> numero, ArrayList<String> type, ArrayList<String> monnaie,
			ArrayList<Integer> solde, ArrayList<String> etat) {
		super();
		this.numero = numero;
		this.type = type;
		this.monnaie = monnaie;
		this.solde = solde;
		this.etat = etat;
	}


	public static void Enregistrer(int num, int sol,String typ, String mon, String et) {
		numero.add(num);
		solde.add(sol);
		type.add(typ);
		monnaie.add(mon);
		etat.add(et);
		
		if(numero.contains(num) && solde.contains(sol) && type.contains(typ) && monnaie.contains(mon) && etat.contains(et)) {
			System.out.println("Enregistrer avec succes");
			
		}
		else
		System.out.println("non enregistrer");
	}
	
	
	public static void ModifierSolde(int num,int sol, String et) {
		if(et=="N" || et=="F")
			System.out.println("Ce compte est non attribue ou ferme");
		else
		{
			int index = numero.indexOf(num);
			solde.remove(solde.get(index));
			solde.add(index, sol);
			
	}
	}
	
	public static void ModifierEtat(int num,String et)
	{
		if(et=="A")
			System.out.println("Ce compte est deja attribue");
		else
		{
			et="A";
		int index = numero.indexOf(num);
		etat.remove(etat.get(index));
		etat.add(index, et);
	}
	}
	
	
	public static void AfficherCompte(int num)
	{
		
	}
	}
	