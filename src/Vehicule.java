public class Vehicule {

    private static int cts=1;
    private int id;
    private String fabriquant;
    private String modele;
    private int passagers;
    private int fuelcap;
    private int kmpl;



//    getters
    public int getKmpl() {
        return kmpl;
    }

    //    getters
    public void setKmpl(int kmpl) {
        this.kmpl = kmpl;
    }

    //    getters
    public int getFuelcap() {
        return fuelcap;
    }

    //    setters
    public void setFuelcap(int fuelcap) {
        this.fuelcap = fuelcap;
    }

    //    setters
    public void setModele(String modele) {
        this.modele = modele;
    }

//      constructor
    public Vehicule(String fab,String mod,int pass,int fucp,int kmpl){
        this.id=cts++;
        this.fabriquant = fab;
        this.modele = mod;
        this.passagers = pass;
        this.fuelcap = fucp;
        this.kmpl = kmpl;
    }


//    methode toString il est au default en java
    @Override
    public  String toString(){
        return "ID: "+id+" Fabriquant: " + fabriquant + ", Modèle: " + modele;
    }


//  methose range
    public int range(){
        return fuelcap * kmpl ;
    }

//    methode fuelneeded
    public double fuelneeded(int kms){
        return ( (double) kms / kmpl) ;
    }


//    redifinition de equels je connait que equels(): au default existe mais il comparer just emplacement  memoire
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // Vérifie si les deux références sont identiques
        if (obj == null || getClass() != obj.getClass()) return false; // Vérifie le type de l'objet (vehicule)

        Vehicule vehicule = (Vehicule) obj; // Cast en Vehicule

        return passagers == vehicule.passagers &&
                fuelcap == vehicule.fuelcap &&
                kmpl == vehicule.kmpl &&
                fabriquant.equals(vehicule.fabriquant) &&
                modele.equals(vehicule.modele);
    }














}


