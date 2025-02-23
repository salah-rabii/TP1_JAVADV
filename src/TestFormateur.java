public class TestFormateur {

    public static void main(String[] args){

        Formateur form1 = new Formateur("A12345","Salah eddine","Rabii","4a hna",115,10,16.8,12.4);
        Formateur form2 = new Formateur("B23456","jack","daniel","4a lhih",55,80,26.8,32.4);


        System.out.println(form1.toString());
        System.out.println(form2.toString());
        System.out.println();
        System.out.println("LE SALAIRE DE 1ER PERSONNE:  "+form1.CalculSalaire());
        System.out.println(" LE SALAIRE DE 2EME PERSONNE:  "+form2.CalculSalaire());


    }
}
