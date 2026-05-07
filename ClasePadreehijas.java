import java.util.Scanner;
public class Agente


public class CasoDetective {
public class Agente
{
    protected int id;
    protected String nombre;
    protected String agencia;
    protected String rango;
    protected int experiencia;
    protected String cargo;
    protected String comisaria;
    pretected int telefono;

    public Agente(int id, String nombre, String agencia, String rango)
    {
        this.id = id;
        this.nombre= nombre;
        this.agencia= agencia;
        this.rango=rango;
        this.experiencia=experiencia;
        this.cargo= cargo;
        this.comisaria=comisaria;
        this.telefono=telefono;
    }

    public void reportar(int id, String nombre, String agencia, String rango)
    {
       System.out.println(nombre + " reporta a" + agencia); 
    }

    public void obtenerInfo()
    {
       return nombre + " [" + rango +"]";
    }
    
    public String Registrar(int experiencia, String cargo, String comisaria, int id,int telefono, String nombre, String agencia)
    {
        System.out.println("Ingresa tu nombre:");
        nombre= teclado.nextLine();
        System.out.println("Ingresa tu edad:");
        System.out.println("Ingresa tu Documento :");
        Documento= teclado.nextInt();
        System.out.println("Ingresa tu rango:");
        rango= teclado.nextLine();
        System.out.println("Ingresa tu experiencia:");
        experiencia= teclado.nextInt();
        System.out.println("Ingresa tu Cargo:");
        cargo= teclado.nextLine();
        System.out.println("Ingresa tu Comisaria:");
        comisaria= teclado.nextLine();
        System.out.println("Ingresa tu telefono:");
        telefono= teclado.nextInt();
    
    }
}

class policia extends Agente
{
    System.out.println("Investiga");
    System.out.println("Observa");
    System.out.println("Registra");
    System.out.println("Arresta");
    System.out.println("Analiza");
    System.out.println("Deduce");
    System.out.println("Interroga");
    System.out.println("Pregunta");

}

class Forense extends Agente
{
    System.out.println("Investiga");
    System.out.println("Observa");
    System.out.println("Registra el estado del cuerpo");
    System.out.println("Registra hora");
    System.out.println("Analiza causas");
    System.out.println("Arregla el cuerpo");
    System.out.println("Interroga");
    System.out.println("Recoge el cuerpo");
}

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
