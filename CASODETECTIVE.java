import java.util.Scanner;

public class CasoDetective {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        
        String nombre;
        int pistas = 0;
        int opcion;
        boolean casoResuelto = false;

        
        System.out.println("================================");
        System.out.println("  DESPACHO HOLMES & ASOCIADOS");
        System.out.println("  Caso #1: HIDDEN");
        System.out.println("================================");

        System.out.print("Detective, ¿cuál es tu nombre? ");
        nombre = teclado.nextLine();
        
        System.out.print("¿Cuántos años tienes? ");
        int edad = teclado.nextInt();
        
          if (edad < 12) 
          {
            System.out.println(nombre + ", eres muy joven para ser detective.");
            return;
        } else if (edad <= 17) 
        {
            System.out.println(nombre + ", puedes ser detective junior.");
        } else if (edad <= 59) 
        {
            System.out.println("¡Bienvenido al equipo de detectives, " + nombre + "!");
        } else 
        {
            System.out.println(nombre + ", eres un detective senior con experiencia.");
            return;
        }

        System.out.println("");
        System.out.println("Bienvenido, detective " + nombre + ".");
        System.out.println("Tu misión: resolver el caso HIDDEN.");
        System.out.println("Necesitas al menos 3 pistas.");

      
        do 
        {

            // === MENÚ PRINCIPAL ===
            System.out.println("\n--- MENÚ DEL DETECTIVE ---");
            System.out.println("1. Buscar pistas");
            System.out.println("2. Interrogar sospechosos");
            System.out.println("3. Resolver el caso");
            System.out.print("Elige una opción (1-3): ");
            opcion = teclado.nextInt();
            teclado.nextLine(); 

            switch (opcion) 
            {

                case 1:
                    System.out.println("\n■ BUSCANDO PISTAS...");
                    String[] evidencias = 
                    {
                        "Huella digital en la ventana",
                        "Copa de vino con residuos",
                        "Nota rasgada en el escritorio",
                        "Cuchillo en la cocina"
                    };
                    pistas=0;
                    int i=0;

                    while (i < evidencias.length) 
                    {
                       pistas++;
                        System.out.println("  Pista #" + pistas + ": " + evidencias[i]);
                        i++; 
                    
                    }

                    System.out.println("Total de pistas: " + pistas);
                    break;

                case 2:
                    System.out.println("\n■ INTERROGATORIOS");
                    String[] sospechosos = {
                        "James Barnes",
                        "Aurelio Vásquez",
                        "Victoria Reyes",
                        "Bruno Quiroga"
                    };

                    

                    for (int s = 0; s<sospechosos.length;s++) {
                        System.out.println("  Interrogando a: " + sospechosos[s]);
                        System.out.println("  -> Dice que es inocente...");
                
                    }

                        
                        break;

                case 3:
                    System.out.println("\n■ RESOLUCIÓN DEL CASO");

                    if (pistas >= 3) 
                    {
                        System.out.println("  ¡Tienes suficientes pistas!");
                        System.out.println("  El culpable es: Aurelio Vásquez");
                        System.out.println("  ¡CASO RESUELTO, detective " + nombre + "!");
                        casoResuelto = true;

                    } else if (pistas >= 1) 
                    {
                        System.out.println("  Tienes " + pistas + " pista(s). Necesitas 3.");
                        System.out.println("  ¡Sigue investigando!");

                    } else {
                        System.out.println("  No tienes ninguna pista.");
                        System.out.println("  Ve a buscar pistas primero.");
                    }
                    break;

                default:
                    System.out.println("Opción no válida.");
                    break;
            }

        } while (!casoResuelto); 

        System.out.println("\nGracias por jugar, " + nombre + ". Caso cerrado.");
        teclado.close();
    }
}
