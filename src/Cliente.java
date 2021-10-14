//TODO: implements Observer
import java.util.LinkedList;

class Cliente{

    /**
    * Nombre del cliente
    */
    private String nombre;

    // TODO: servicios
    // * private LinkedList<Servicio> servicios;

    /**
    * La cantidad de diner del cliente
    */
    private int dinero;


    //TODO Contrato
    // ? Tengo duda del contrato aun xd?
    // * private LinkedList<Contrato> contratos;

    /**
    * Lista donde se guardan las recomendaciones del mes por cada servicio del cliente
    * ? Mi idea es tener una lista de las recomendaciones de cada servicio, como ves?
    * Se imprimirian en plan, memeflix recomienda : Avengers y asi 
    */
    LinkedList<String> recomendacionesDelMes;

    /**
    * Metodo contrusctor de un cliente
    * @param nombre El nombre del cliente
    * @param dinero La cantidad inicial de dinero del cliente
    */
    public Cliente(String nombre, int dinero){

        this.nombre = nombre;
        this.dinero = dinero;
        recomendacionesDelMes = new LinkedList<String>();
    }

    // TODO: Actualizar recomendaciones
    // * public void actualizarRecomendaciones()
}