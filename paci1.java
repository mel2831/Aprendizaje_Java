public class Espia
    {
        String nombreClave;
        String identidadFalsa;
        int contactosIdentificados;

        public Espia(String nombreClave, String identidadFalsa, int contactosIdentificados)
        {
            this.nombreClave=nombreClave;
            this.identidadFalsa=identidadFalsa;
            this.contactosIdentificados=contactosIdentificados;
        }

        public void reporteFiesta()
        {
            System.out.println("La agente" + nombreClave +" se presentó como" + identidadFalsa + "e identificó" + contactosIdentificados + "contactos sospechosos.");
        }

    

    public static void main(String[] args) {

        Espia agente = new Espia("Rosa negra", "Valeria Lopez", 7);
        agente.reporteFiesta();

    }
        
}
