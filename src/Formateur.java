public class Formateur {

    private String numero_Cin;
    private String nom;
    private String prenom;
    private String adresse;
    private int MH;
    private int HS;
    private double THE;
    private double THS;

    public Formateur(String numero_Cin,String nom,String prenom,String adresse,int MH,int HS,double THE,double THS){
        this.numero_Cin=numero_Cin;
        this.nom=nom;
        this.prenom=prenom;
        this.adresse=adresse;
        this.MH=MH;
        this.HS=HS;
        this.THE=THE;
        this.THS=THS;
    }

    @Override
    public String toString() {
        return "mon nom est "+nom+" et mon prenom et "+prenom+" et mon adresse et "+adresse+" et mon numero de cin "+numero_Cin+" et MH: "+MH+" et HS: "+HS+" et THE: "+THE+"et THS "+THS;
    }

    public double CalculSalaire(){
        return (MH*THE) + (HS*THS);
    }

}
