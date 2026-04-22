import java.util.Scanner;

public class ClasificadorEdad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuál es tu nombre? ");
        String nombre = sc.nextLine();

        System.out.print("¿Cuántos años tienes? ");
        int edad = sc.nextInt();

        if (edad < 12) {
            System.out.println(nombre + ", eres muy joven para ser detective.");
        } else if (edad <= 17) {
            System.out.println(nombre + ", puedes ser detective junior.");
        } else if (edad <= 59) {
            System.out.println("¡Bienvenido al equipo de detectives, " + nombre + "!");
        } else {
            System.out.println(nombre + ", eres un detective senior con experiencia.");
        }

        System.out.print("¿Cuántas pistas encontraste? ");
        int pistas = sc.nextInt();
        
        if (pistas >= 5) {
            System.out.println("¡Eres un detective EXPERTO!");
            System.out.println("Puedes resolver el caso.");
        } else if (pistas >= 3) {
            System.out.println("Buen trabajo, detective.");
            System.out.println("Necesitas unas pistas más.");
        } else if (pistas >= 1) {
            System.out.println("Vas por buen camino...");
            System.out.println("¡Sigue investigando!");
        } else {
            System.out.println("¡No has encontrado nada!");
            System.out.println("Revisa la escena del crimen.");
        }
    }
}
