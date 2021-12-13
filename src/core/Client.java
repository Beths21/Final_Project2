package core;

public class Client {
    private static ArrayList<String> typeCompte = new ArrayList<String>();
    private static ArrayList<Integer> numeroCompte = new ArrayList<Integer>();
    private static ArrayList<String> typeClient = new ArrayList<String>();
    private static ArrayList<String> nomComplet = new ArrayList<String>();
    private static ArrayList<Character> sexe = new ArrayList<Character>();
    private static ArrayList<String> adresse = new ArrayList<String>();
    private static ArrayList<String> tel = new ArrayList<String>();
    private static ArrayList<String> nifCin = new ArrayList<String>();

    public static ArrayList<String> getTypeCompte() {
        return typeCompte;
    }

    public static void setTypeCompte(ArrayList<String> typeCompte) {
        Client.typeCompte = typeCompte;
    }

    public static ArrayList<Integer> getNumeroCompte() {
        return numeroCompte;
    }

    public static void setNumeroCompte(ArrayList<Integer> numeroCompte) {
        Client.numeroCompte = numeroCompte;
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


    public Client(String nifCin,int numeroCompte,String typeCompte,String typeClient, String nomComplet,
                  char sexe,String adresse,String tel)
    {
        this.nifCin.add(nifCin);
        this.numeroCompte.add(numeroCompte);
        this.typeCompte.add(typeCompte);
        this.typeClient.add(typeClient);
        this.nomComplet.add(nomComplet);
        this.sexe.add(sexe);
        this.adresse.add(adresse);
        this.tel.add(tel);
    }

    public static void enregistrer()
    {

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
