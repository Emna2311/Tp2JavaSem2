import java.util.Scanner;

public class tp8 ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez une chaîne de caractères : ");
        String chaine = scanner.nextLine();

       
        System.out.print("Entrez la lettre à compter : ");
        char lettre = scanner.next().charAt(0);

       
        int nombre = compterLettre(chaine, lettre);

        System.out.println("La lettre '" + lettre + "' apparaît " + nombre + " fois dans la chaîne.");
    }
    public static int compterLettre(String chaine, char lettre) {
        int count = 0;
        for (int i = 0; i < chaine.length(); i++) {
            if (chaine.charAt(i) == lettre) {
                count++;
            }
        }
        return count;
    }
}