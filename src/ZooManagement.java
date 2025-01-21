import java.util.Scanner;

public class ZooManagement {
    int nbrCage ;
    String zooName ;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ZooManagement zoo = new ZooManagement();
        System.out.print(" Veuillez entrer le nom du zoo : ");
        zoo.zooName = scanner.nextLine();

        while (true) {
            System.out.print(" Veuillez entrer le nombre de cages (entier positif) : ");
            if (scanner.hasNextInt()) {
                zoo.nbrCage = scanner.nextInt();
                if (zoo.nbrCage > 0) {
                    break;
                } else {
                    System.out.println(" Erreur : Le nombre de cages doit être supérieur à 0.");
                }
            } else {
                System.out.println(" Erreur : Veuillez entrer un entier valide.");
                scanner.next();
            }
        }

        System.out.println(zoo.zooName + " comporte " + zoo.nbrCage + " cages.");
        scanner.close();
    }
}



