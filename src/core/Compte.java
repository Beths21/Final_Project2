package core;

public class Compte {private ArrayList<Integer> numero;
private ArrayList<String> client;
private ArrayList<String> monnaie;
private ArrayList<Integer> solde;
private ArrayList<String> etat;








public ArrayList<Integer> getNumero() {
	return numero;
}




public void setNumero(ArrayList<Integer> numero) {
	this.numero = numero;
}




public ArrayList<String> getClient() {
	return client;
}



public void setClient(ArrayList<String> client) {
	this.client = client;
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





public Compte(ArrayList<Integer> numero, ArrayList<String> client, ArrayList<String> monnaie,
		ArrayList<Integer> solde, ArrayList<String> etat) {
	super();
	this.numero = numero;
	this.client = client;
	this.monnaie = monnaie;
	this.solde = solde;
	this.etat = etat;
}



	

}
