package core;

import java.util.*;
public class Transaction {
    private static ArrayList <Integer> id_Transaction=new ArrayList<Integer>();
    private static ArrayList <Integer> montant=new ArrayList<Integer>();
    private static ArrayList <String> nomClient=new ArrayList<String>();
    private static ArrayList <String> date=new ArrayList<String>();

    public static ArrayList<Integer> getId_Transaction() {
        return id_Transaction;
    }

    public static void setId_Transaction(ArrayList<Integer> id_Transaction) {
        Transaction.id_Transaction = id_Transaction;
    }



    public static ArrayList<Integer> getMontant() {
        return montant;
    }

    public static void setMontant(ArrayList<Integer> montant) {
        Transaction.montant = montant;
    }

    public static ArrayList<String> getNomClient() {
        return nomClient;
    }

    public static void setNomClient(ArrayList<String> nomClient) {
        Transaction.nomClient = nomClient;
    }

    public static ArrayList<String> getDate() {
        return date;
    }

    public static void setDate(ArrayList<String> date) {
        Transaction.date = date;
    }

    public Transaction(int id_Transac, int noCompte,
                       int mont, String client, String dat)
    {
        this.id_Transaction.add(id_Transac);
        this.montant.add(mont);
        this.nomClient.add(client);
        this.date.add(dat);
    }

    public static void enregistrerDepot(int mont)
    {

        Random random=new Random();
        int id_Transac=100+random.nextInt(999999-100);

        int noCompte=Client.getNoCompte();
        int index=Compte.getNumero().indexOf(noCompte);

        if(Compte.getEtat().get(index) == "N" || Compte.getEtat().get(index) == "F")
            System.out.println("Ce compte n'est pas attribue ou est ferme");
        else if(Compte.getEtat().get(index) == "A")
        {
            int value=Compte.getSolde().get(index);
            Compte.getSolde().remove(Compte.getSolde().get(index));
            Compte.getSolde().add(index,value+mont);
            if(Compte.getSolde().subList(index,index+1).contains(value+mont))
                System.out.println("Depot realise");
            else
                System.out.println("Depot non realise");

        }


    }

    public static void enregistrerRetrait()
    {

    }
}
