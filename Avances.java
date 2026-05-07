import java.util.Scanner;

public class CasoDetective 
{

    public static class Agente 
{
        protected int id;
        protected String nombre;
        protected String agencia;
        protected String rango;
        protected int experiencia;
        protected String cargo;
        protected int telefono;
        protected String correo;
        protected int edad;

        public Agente(int id, String nombre, String agencia, String rango, int experiencia, String cargo, int telefono, String correo, int edad) 
{
            this.id = id;
            this.nombre = nombre;
            this.agencia = agencia;
            this.rango = rango;
            this.experiencia = experiencia;
            this.cargo = cargo;
            this.telefono = telefono;
            this.correo = correo;
            this.edad = edad;
        }

        public void reportar(int id, String nombre, String agencia, String rango) 
{
            System.out.println(nombre + " reporta a" + agencia); 
        }

        public String obtenerInfo() 
{
            return nombre + " [" + rango +"]";
        }
        
        public void registrar() 
{
            System.out.println("--- Agente ---");
            System.out.println("ID         : " + id);
            System.out.println("Nombre     : " + nombre);
            System.out.println("Agencia    : " + agencia);
            System.out.println("Rango      : " + rango);
            System.out.println("Experiencia: " + experiencia);
            System.out.println("Cargo      : " + cargo);
            System.out.println("Telefono   : " + telefono);
            System.out.println("Correo     : " + correo);
            System.out.println("Edad       : " + edad);
        }
    }

    public static class Policia extends Agente 
{
        protected String comisaria;

        public Policia(int id, String nombre, String agencia, String rango, int experiencia, String cargo, String comisaria, int telefono, String correo, int edad) {
            super(id, nombre, agencia, rango, experiencia, cargo, telefono, correo, edad);
            this.comisaria = comisaria;
        } 

        public void acciones() 
{
            System.out.println("Investiga");
            System.out.println("Observa");
            System.out.println("Registra los datos");
            System.out.println("Registra los el área del crimen");
            System.out.println("Arresta");
            System.out.println("Analiza");
            System.out.println("Deduce");
            System.out.println("Interroga a los sospechosos");
            System.out.println("Pregunta a testigos");
            System.out.println("Redacta el informe policial");
        }

        public void registrar() 
{
            super.registrar();
            System.out.println("Comisaria : " + comisaria);
        }
    }

    public static class Forense extends Agente 
{
        String especialidad;

        public Forense(int id, String nombre, String agencia, String rango, int experiencia, String cargo, int telefono, String correo, int edad, String especialidad) {
            super(id, nombre, agencia, rango, experiencia, cargo, telefono, correo, edad);
            this.especialidad = especialidad;
        }

        public void acciones() 
{
            System.out.println("Tomar fotos del cuerpo");
            System.out.println("Recolectar muestras");
            System.out.println("Registra el estado del cuerpo");
            System.out.println("Estimar hora de la muerte");
            System.out.println("Registrar la escena del crimen");
            System.out.println("analizar evidencias");
            System.out.println("Identificar arma usada");
            System.out.println("Escribir informe");
            System.out.println("determinar causa");
            System.out.println("Realizar autopsia");
        }

        public void registrar() 
{
            super.registrar();
            System.out.println("Especialidad : " + especialidad);
        }
    }

    public static class Detective extends Agente 
{
        String alias;

        public Detective(int id, String nombre, String agencia, String rango, int experiencia, String cargo, int telefono, String correo, int edad, String alias) {
            super(id, nombre, agencia, rango, experiencia, cargo, telefono, correo, edad);
            this.alias = alias;
        }

        public void acciones() 
{
            System.out.println("Interrogar sospechosos");
            System.out.println("Recolectar evidencias");
            System.out.println("Observar escena del crimen");
            System.out.println("Encontrar al culpable");
            System.out.println("Analizar pistas");
            System.out.println("Elaborar teorías");
            System.out.println("Encontrar causas de asesinato");
            System.out.println("Registrar caso");
            System.out.println("Determinar causas de asesinato");
            System.out.println("Hablar con testigos");
        }

        public void registrar() 
{
            super.registrar();
            System.out.println("Alias: " + alias);
        }
    }

    public static void main(String[] args) 
{

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
        } else {
            System.out.println(nombre + ", eres un detective senior con experiencia.");
            return;
        }

        System.out.println("");
        System.out.println("Bienvenido, detective " + nombre + ".");
        System.out.println("Tu misión: resolver el caso HIDDEN.");
        System.out.println("Necesitas al menos 3 pistas.");

        do 
{
          
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
                    String[] sospechosos = 
{
                        "James Barnes",
                        "Aurelio Vásquez",
                        "Victoria Reyes",
                        "Bruno Quiroga"
                    };

                    for (int s = 0; s<sospechosos.length;s++) 
{
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

                    } else 
{
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
