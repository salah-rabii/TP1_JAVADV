public class Stagiaire {

    private String Numero_Cin;
    private String Nom;
    private String Prenom;
    private String Adresse;
    private String Filiere;
    private double Moy_Gen;


    public  Stagiaire(String Numero_Cin,String Nom,String Prenom,String Adresse,String Filiere,double Moy_Gen ){
        this.Numero_Cin=Numero_Cin;
        this.Nom=Nom;
        this.Prenom=Prenom;
        this.Adresse=Adresse;
        this.Filiere=Filiere;
        this.Moy_Gen=Moy_Gen;
    }

    @Override
    public String toString(){
        return "NumCin= "+Numero_Cin +" Nom: "+Nom+" et mon prenom: "+Prenom+" Adresse: "+Adresse+" Filiere: "+Filiere+" MOY: "+Moy_Gen;
    }

}
