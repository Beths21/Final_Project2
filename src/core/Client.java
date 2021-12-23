package core;

import java.util.*;
public class Client {
    private static ArrayList<Integer> noCompte = new ArrayList<Integer>();
    private static ArrayList<String> typeCompte = new ArrayList<String>();
    private static ArrayList<String> typeClient = new ArrayList<String>();
    private static ArrayList<String> nomComplet = new ArrayList<String>();
    private static ArrayList<Character> sexe = new ArrayList<Character>();
    private static ArrayList<String> adresse = new ArrayList<String>();
    private static ArrayList<String> tel = new ArrayList<String>();
    private static ArrayList<String> nifCin = new ArrayList<String>();

    public static ArrayList<Integer> getNoCompte() {
        return noCompte;
    }

    public static void setNoCompte(ArrayList<Integer> noCompte) {
        Client.noCompte = noCompte;
    }

    public static ArrayList<String> getTypeCompte() {
        return typeCompte;
    }

    public static void setTypeCompte(ArrayList<String> typeCompte) {
        Client.typeCompte = typeCompte;
    }

    public static ArrayList<String> getTypeClient() {
        return typeClient;
    }

    public static void setTypeClient(ArrayList<String> typeClient) {
        Client.typeClient = typeClient;
    }

    public static ArrayList<String> getNomComplet() {
        return nomComplet;
    }

    public static void setNomComplet(ArrayList<String> nomComplet) {
        Client.nomComplet = nomComplet;
    }

    public static ArrayList<Character> getSexe() {
        return sexe;
    }

    public static void setSexe(ArrayList<Character> sexe) {
        Client.sexe = sexe;
    }

    public static ArrayList<String> getAdresse() {
        return adresse;
    }

    public static void setAdresse(ArrayList<String> adresse) {
        Client.adresse = adresse;
    }

    public static ArrayList<String> getTel() {
        return tel;
    }

    public static void setTel(ArrayList<String> tel) {
        Client.tel = tel;
    }

    public static ArrayList<String> getNifCin() {
        return nifCin;
    }

    public static void setNifCin(ArrayList<String> nifCin) {
        Client.nifCin = nifCin;
    }


    public Client(String nifCin,int noCompte,String typeCompte,String typeClient, String nomComplet,
                  char sexe,String adresse,String tel)
    {
        this.noCompte.add(noCompte);
        this.typeCompte.add(typeCompte);
        this.nifCin.add(nifCin);
        this.typeClient.add(typeClient);
        this.nomComplet.add(nomComplet);
        this.sexe.add(sexe);
        this.adresse.add(adresse);
        this.tel.add(tel);
    }

    public static void enregistrer(String nifCin,String typeCompte,String typeClient, String nomComplet,
                                   char sexe,String adresse,String tel,String monnaie)
    {
        int index=0,noCompt=0;
        for(int i=0 ;i<Compte.getType().size() && i < Compte.getMonnaie().size();i++)
        {
            while (Compte.getType().get(i) == typeCompte && Compte.getMonnaie().get(i)==monnaie)
            {
                index = Compte.getType().indexOf(Compte.getType().get(i));
                if (Compte.getEtat().get(index) == "N")
                {
                    noCompt = Compte.getNumero().get(index);
                    Compte.ModifierEtat(noCompt, "A");
                    break;
                }
                break;
            }
        }

        new Client(nifCin,noCompt,typeCompte,typeClient,nomComplet,sexe,adresse,tel);

    }

    public static void modifier(String nif, String telephone, String Nomcomplet, String Adress)
    {
    	int index=0;
    	index = nifCin.indexOf(nif);
    	tel.remove(get(index));
    	tel.add(index, telephone);
    	
    	nomComplet.remove(get(index));
    	nomComplet.add(index, Nomcomplet);
    	
    	adresse.remove(get(index));
    	adresse.add(index, Adress);
    			
    }

    public static void afficher()
    {
    	
    }

    public static void supprimer()
    {
public CtrlSupprimerClient(PanelAgence pan, Model mode)
	{
		this.Pan = pan;
		this.model = mode;
	}

	public void actionPerformed(ActionEvent arg0) 
	{
		Client cli = model.getClient(Pan.getclient());
		model.SupprimerClient(cli);
		Pan.setClients(model.getAgence(Pan.getnumAgneceSelect()).getNomPnomClients());
	}

    }
}
