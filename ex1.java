/**
 * @(#)ex1.java
 *
 *
 * @author 
 * @version 1.00 2025/4/17
 */

import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = lectureN(scanner);
        int nbChiffres = compter(n);
        System.out.println("Le nombre " + n + " contient " + nbChiffres + " chiffre(s).");
        scanner.close();
    }

    public static int lectureN(Scanner scanner) {
        int n;
        do {
            System.out.print("Entrez un entier strictement positif : ");
            n = scanner.nextInt();
            if (n <= 0) {
                System.out.println("Erreur : le nombre doit être strictement positif.");
            }
        } while (n <= 0);
        return n;
    }

    public static int compter(int n) {
        if (n == 0) return 1;
        return String.valueOf(n).length();
    }
}
