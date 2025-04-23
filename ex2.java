/**
 * @(#)ex2.java
 *
 *
 * @author 
 * @version 1.00 2025/4/17
 */

import java.util.Scanner;

public class ex2 {

    public static double addition(double a, double b) {
        return a + b;
    }

    public static double soustraction(double a, double b) {
        return a - b;
    }

    public static double multiplication(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        if (b == 0) {
            System.out.println("Erreur : Division par zéro !");
            return Double.NaN;
            b= scanner.nextDouble();
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choix;
        double a, b, resultat;

        System.out.println("=== Calculatrice Simple ===");
        System.out.println("1. Addition");
        System.out.println("2. Soustraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.print("Choisissez une opération (1/2/3/4) : ");
        choix = scanner.nextInt();

        System.out.print("Entrez le premier nombre : ");
        a = scanner.nextDouble();

        System.out.print("Entrez le second nombre : ");
        b = scanner.nextDouble();

        switch (choix) {
            case 1:
                resultat = addition(a, b);
                System.out.println("Résultat : " + resultat);
                break;
            case 2:
                resultat = soustraction(a, b);
                System.out.println("Résultat : " + resultat);
                break;
            case 3:
                resultat = multiplication(a, b);
                System.out.println("Résultat : " + resultat);
                break;
            case 4:
                resultat = division(a, b);
                if (!Double.isNaN(resultat)) {
                    System.out.println("Résultat : " + resultat);
                   
                }
                break;
            default:
                System.out.println("Choix invalide veuillez entrer un seconde nombre non valide !");
                
        }

        scanner.close();
    }
}
