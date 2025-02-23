public class TestVehicule {



    public static void main(String[] args) {

     Vehicule berlinCar = new Vehicule("BMW","Z4",2,55,8);
     Vehicule miniCar = new Vehicule("Dacia","Lodgy",7,50,6);


        System.out.println(berlinCar);
        System.out.println(berlinCar.range());
        System.out.println(berlinCar.fuelneeded(500));

//       question  5)
        System.out.println(berlinCar.equals(miniCar));

//        question 7)
        Vehicule miniCar1 = miniCar;
        Vehicule miniCar2 = new Vehicule("Dacia", "Lodgy",7 ,50, 6 );
        System.out.println("miniCar1 "+miniCar1);
        System.out.println("miniCar2 "+miniCar2);

        miniCar.setModele("Logan");
        System.out.println("miniCar1 "+miniCar1);
        System.out.println("miniCar2 "+miniCar2);

        System.out.println("comparaison 1 "+ miniCar.equals(miniCar1));
        System.out.println("comparaison 2 "+ miniCar.equals(miniCar2));



    }

}
