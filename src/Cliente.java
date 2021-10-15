import java.util.LinkedList;

class Cliente implements Observer{

    /**
    * Nombre del cliente
    */
    private String nombre;


    private LinkedList<Subject> servicios;

    /**
    * La cantidad de diner del cliente
    */
    private int dinero;


    //TODO Contrato
    // ? Tengo duda del contrato aun xd?
    // * private LinkedList<Contrato> contratos;


    // * Mi idea es que cada que llegue la recomencacion de un servicio, imprimirla o guardarla en el txt
    /** Recomendacion del mes de un servicio */
    String recomendacionDelMes;

    /**
    * Metodo contrusctor de un cliente
    * @param nombre El nombre del cliente
    * @param dinero La cantidad inicial de dinero del cliente
    */
    public Cliente(String nombre, int dinero){

        this.nombre = nombre;
        this.dinero = dinero;
        recomendacionesDelMes = new LinkedList<String>();
        this.servicios = new LinkedList<Servicio>();
    }

    public void setRecomendacion(String recomendacion){

        this.recomendacionDelMes = recomendacion;
    }

    /**
     * Metodo para actualizar a un cliente cuando pasa un mes
     * @param recomendacion La recomendacion recibida del servicio
     * @param servicio El nombre del servicio que recomienda 
     */

     // ? Si solo vamos a imprimir la recomendacion es necesario tenerla como atributo?
    public void update(String recomendacion, String servicio){

        System.out.println(
            this.nombre + " " + servicio + " te recomienda " + recomendacion
        );
    }
}