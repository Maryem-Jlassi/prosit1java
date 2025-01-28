import java.util.Scanner;

public class ZooManagement {

    public static void main(String[] args) {
        Animal lion=new Animal("fhbh","lion",5,false);
        Zoo myZoo=new Zoo("belvedere","tunis",10);
        myZoo.addAnimal(lion,0);
        myZoo.display();

    }
}
