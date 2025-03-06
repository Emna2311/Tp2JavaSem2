import java.util.Scanner;

public class tp8 ex5 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       System.out.println("Donnez un nombre entier:");
        int nombre = scanner.nextInt();

     
        String chaine = String.valueOf(nombre);

       
        System.out.println("Affichage vertical :");
        for (int i = 0; i < chaine.length(); i++) {
            System.out.println(chaine.charAt(i));
        }
        scanner.close();
    }
}