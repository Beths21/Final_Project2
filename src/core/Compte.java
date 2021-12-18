package core;


import java.util.ArrayList;

public class Compte {
	private static ArrayList<Integer> numero=     new ArrayList<Integer>();
	private static ArrayList<String> type =    new ArrayList<String>();
	private static ArrayList<String> monnaie=   new ArrayList<String>();
	private static ArrayList<Integer> solde =  new ArrayList<Integer>();
	private static ArrayList<String> etat   = new ArrayList<String>();








	public static ArrayList<Integer> getNumero() {
		return numero;
	}




	public void setNumero(ArrayList<Integer> numero) {
		this.numero = numero;
	}




	public static ArrayList<String> getType() {
		return type;
	}



	public void setType(ArrayList<String> type) {
		this.type = type;
	}




	public static ArrayList<String> getMonnaie() {
		return monnaie;
	}



	public void setMonnaie(ArrayList<String> monnaie) {
		this.monnaie = monnaie;
	}



	public static ArrayList<Integer> getSolde() {
		return solde;
	}



	public void setSolde(ArrayList<Integer> solde) {
		this.solde = solde;
	}


	public static ArrayList<String> getEtat() {
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


	public static void genererNumeroCompte(int num,String typ,String mon)
	{
		Random random=new Random();
		int i=0,sol=0;
		String et="N";
		while(i<=99)
		{
			num=100000+random.nextInt(999999-100000);
			while(numero.contains(num))
				num=100000+random.nextInt(999999-100000);
			Enregistrer(num,sol,typ,mon,et);
			i++;
		}
	}
	public static void genererCompte()
	{
		int num = 100000;
		String typ = "Courant", mon = "Dollars";
		genererNumeroCompte(num, typ, mon);

		mon = "Gourdes";
		genererNumeroCompte(num, typ, mon);

		typ = "Epargne";
		mon = "Dollars";
		genererNumeroCompte(num, typ, mon);

		mon = "Gourdes";
		genererNumeroCompte(num, typ, mon);
	}

	public static void ModifierSolde(int num,int sol) {
		int index = numero.indexOf(num);
		String et= etat.get(index);
		if(et=="N" || et=="F")
			System.out.println("Ce compte est non attribue ou ferme");
		else
		{

			solde.remove(solde.get(index));
			solde.add(index, sol);

		}

		if(numero.contains(num) && solde.contains(sol)) {
			System.out.println("Modifie avec succes");

		}
		else
			System.out.println("non modifie");
	}

	public static void ModifierEtat(int num,String eta)
	{
		int index = numero.indexOf(num);
		String et= etat.get(index);
		if(et==eta)
			System.out.println("Ce compte est deja dans l'etat voulu");
		else
		{
			etat.remove(etat.get(index));
			etat.add(index, eta);
		}
	}


	public static void AfficherCompte()
	{
		for(int i=1; i<numero.size();i++) {
			System.out.println("---------------------------------------------------");
			System.out.println("Numero de compte : " + numero.get(i)+ " \nType de compte : "+ type.get(i)+ " \nMonnaie : "
					+ monnaie.get(i)+ " \nSolde : "+ solde.get(i)+ " \nEtat : "+ etat.get(i)+ " \n");
		}
	}

	public static void afficherComptePrecis(int numeroCompte)
	{
		int index=numero.indexOf(numeroCompte);
		System.out.println("---------------------------------------------------");
		System.out.println("Numero de compte : " + numero.get(index)+ " \nType de compte : "+ type.get(index)+ " \nMonnaie : "
				+ monnaie.get(index)+ " \nSolde : "+ solde.get(index)+ " \nEtat : "+ etat.get(index)+ " \n");
		System.out.println("---------------------------------------------------");

	}
}
	