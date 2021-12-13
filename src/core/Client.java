package core;

import java.util.*;
public class Client {
    private static int noCompte;
    private static String typeCompte;
    private static ArrayList<String> typeClient = new ArrayList<String>();
    private static ArrayList<String> nomComplet = new ArrayList<String>();
    private static ArrayList<Character> sexe = new ArrayList<Character>();
    private static ArrayList<String> adresse = new ArrayList<String>();
    private static ArrayList<String> tel = new ArrayList<String>();
    private static ArrayList<String> nifCin = new ArrayList<String>();


    public static int getNoCompte() {
        return noCompte;
    }

    public static void setNoCompte(int noCompte) {
        Client.noCompte = noCompte;
    }

    public static String getTypeCompte() {
        return typeCompte;
    }

    public static void setTypeCompte(String typeCompte) {
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
        this.noCompte=noCompte;
        this.typeCompte=typeCompte;
        this.nifCin.add(nifCin);
        this.typeClient.add(typeClient);
        this.nomComplet.add(nomComplet);
        this.sexe.add(sexe);
        this.adresse.add(adresse);
        this.tel.add(tel);
    }

    public static void enregistrer(String nifCin,int noCompte,String typeCompte,String typeClient, String nomComplet,
                                   char sexe,String adresse,String tel,String monnaie)
    {
        int index=0,noCompt=0;
        for(int i=0;i<Compte.getType().size();i++)
        {
            for(int j=0;j<Compte.getMonnaie().size();j++)
            {
                while (Compte.getType().get(i) == typeCompte && Compte.getMonnaie().get(j)==monnaie)
                {
                    index = Compte.getType().indexOf(Compte.getType().get(i));
                    if(Compte.getEtat().get(index) == "N" )
                    {
                        noCompt = Compte.getNumero().get(index);
                        Compte.getEtat().remove(Compte.getEtat().get(index));
                        Compte.getEtat().add(index, "A");
                        break;
                    }
                }
            }

        }

        Client client=new Client(nifCin,noCompt,typeCompte,typeClient,nomComplet,sexe,adresse,tel);


    }

    public static void modifier()
    {

    }

    public static void afficher()
    {

    }

    public static void supprimer()
    {

    }
}
