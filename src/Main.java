import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Declaració i inicialització de les variables
        double primer = 7;
        double segon = 3;

// Càlculs
        double suma = primer + segon;
        double resta = primer - segon;
        double multiplicacio = primer * segon;
        double divisio = primer / segon;

// Exercici 1: Mostra els resultats dels càlculs
        System.out.println("Exercici 1");
        System.out.println("La suma de " + primer + " i " + segon + " és igual a " + suma);
        System.out.println("La resta de " + primer + " i " + segon + " és igual a " + resta);
        System.out.println("La multiplicació de " + primer + " i " + segon + " és igual a " + multiplicacio);
        System.out.println("La divisió de " + primer + " i " + segon + " és igual a " + divisio);
        System.out.println();


// Exercici 2: Mitjana nota alumnes
        // Scanner
        Scanner scanner = new Scanner(System.in);

        System.out.println("Exercici 2");

        // Nom
        System.out.print("Introdueix el nom de l'alumne: ");
        String nomAlumne = scanner.nextLine();

        // Notes av.
        System.out.print("Introdueix la nota de la primera avaluació: ");
        double nota1 = scanner.nextDouble();

        System.out.print("Introdueix la nota de la segona avaluació: ");
        double nota2 = scanner.nextDouble();

        System.out.print("Introdueix la nota de la tercera avaluació: ");
        double nota3 = scanner.nextDouble();

        // Mitjana
        double mitjana = (nota1 + nota2 + nota3) / 3;
        System.out.println("La mitjana de l'alumne " + nomAlumne + " és: " + mitjana);

        System.out.println();


// Exercici 3: Sou treballador
        // Scanner
        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Exercici 3");

        // Nom
        System.out.print("Introdueix el nom del treballador: ");
        String nomTreballador = scanner2.nextLine();

        // Hores
        System.out.print("Introdueix les hores que fa feina al dia el treballador: ");
        double hores = Double.parseDouble(scanner2.nextLine());

        // Dies
        System.out.print("Introdueix els dies que fa feina al mes el treballador: ");
        double dies = Double.parseDouble(scanner2.nextLine());

        // Salari per hora
        System.out.print("Introdueix quant cobra per hora treballada el treballador: ");
        double salariHora = Double.parseDouble(scanner2.nextLine());

        //Salari mensual
        double salari = (hores * salariHora * dies);
        System.out.println("El salari del treballador " + nomTreballador + " és: " + salari);

        System.out.println();
    }
}