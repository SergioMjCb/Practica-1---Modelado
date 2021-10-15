import java.util.LinkedList;
import java.util.Observer;

// TODO: implements subject

abstract class Servicio implements Subject{

    /**
     * El nombre del servicio
     */
    String nombre;

    /**
    * Lista de clientes sucritos al servicio
     */
    LinkedList<Observer> listaClientes;

    // ? El historial a que se refiere, esta en la diapositiva pero no se a que se refiera xd?

    /**
    Arreglo de peliculas/series del servicio para mandar las recomendaciones
     */
    String[] recomendaciones;

    // TODO: atributo Contratos

    /**
    * Constructor de un Servicio
    * Al inicializar el servicio, la lista de clientes es una lista vacia
    * @param recomendaciones Un arreglo con el catalogo del servicio para enviar las recomendaciones
     */
    public Servicio(String[] recomendaciones, String nombre){

        this.listaCLientes = new LinkedList<Observer>();
        this.recomendaciones = recomendaciones;
        this.nombre = nombre;
    } 

    /** 
    * Metodo para sucribir a un cliente al Servicio
    * @param obs El cliente que se va a suscribir
     */
     @Override
    public void registerObserver(Observer obs){

        this.listaCLientes.add(obs);
    }

    /**
     * Metodo para remover la suscripcion de un cliente
     * @param obs El cliente a remover
     */
    @Override
    public void removeObserver(Observer obs){

        int i = listaClientes.indexOf(obs);

        if(i >= 0){
            listaClientes.remove(i);
        }
    }

    /**
     * Metodo para informar a los clientes que un mes ha pasado, enviar recomendacion y cobrar
     */
    @Override
    public void notifyObservers(){

        for(Observer o : this.listaClientes){

            o.update(this.getRecomendacion(), this.nombre);
        }
    }

    /**
     * Devuelve una seleccion aleatoria para mandarla como recomendacion al usuario
     * @return Un string representando una recomendacion para el usuario
     */
    public String getRecomendacion(){

        int rnd = new Random().nextInt(this.listaClientes.size());
        return listaClientes(rnd);
    }
}