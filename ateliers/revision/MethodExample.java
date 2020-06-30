import java.util.Scanner;

class MothodExample{
    public static void main(String args[]){
        newDog();
    }

    public static void newDog(){
        Scanner input = new Scanner(System.in);
        boolean valide = true;
        boolean valide2 = true;
        do {
            System.out.println("Entrez le nom du proprietaire:");
            String name = input.nextLine().toLowerCase();
            System.out.println("Entrez le nom du chien:");
            String dogName = input.nextLine().toLowerCase();
            System.out.println("Entrez la race du chien:");
            String race = input.nextLine().toLowerCase();
            if (name == null || dogName == null || race == null) {
                System.out.println("Error");
                valide = false;

            } else {
                Proprietaire prop = Proprietaire.getProprietaire(name);
                Dog incompleteDog = Dog.getDog(dogName, race);
                valide = true;
                do {
                    System.out.println("Entrez l'age du chien':");
                    int dogAge = input.nextInt();
                    if (dogAge < 0 || dogAge > 15) {
                        System.out.println("Error");
                        valide2=false;
                    } else {
                        Dog completeDog = Dog.getCompleteDog(dogName, dogAge, race);
                        valide2 = true;
                    }
                }while(!valide2);

            }
        }while(!valide);

    }
}

class Dog {
    String name;
    int age;
    String race;

    public Dog(String name, int age, String race){
        this.name = name;
        this.age = age;
        this.race = race;
    }
    public Dog(String name, String race){
        this.name = name;
        this.race = race;
    }

    public static Dog getDog(String name, String race){
        return new Dog(name, race);
    }

    public static Dog getCompleteDog(String name, int age, String race){
        return new Dog(name, age, race);
    }

}

class Proprietaire{
    String name;

    public Proprietaire(String name){
        this.name = name;
    }

    public static Proprietaire getProprietaire(String name){
        return new Proprietaire(name);
    }

}