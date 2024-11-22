package org.yanG.patrones.singleton;
//singleton es un patrón creacional con el cual solo puedo crear una sola instancia
public class ConexionBdSingleton {

    private static ConexionBdSingleton instancia;

    /* el constructor debe ser privado ya que no puedo crear
    una instancia desde fuera de esta clase con el constructor: */
    private ConexionBdSingleton(){
        System.out.println("Conectandose a algpun motor de base de datos.");
    }

    /* Debe de tener un método stático que nos devuelva la intancia de esta clase
     pero que sea unica. Es estatico para poder llamarlo/reutilizarlo desde cualquier lugar*/
    public static ConexionBdSingleton getInstance(){
        if(instancia == null){
            instancia = new ConexionBdSingleton();
        }
        return instancia;
    }
}
