/*1. Tenemos una clase padre Animal junto con sus 3 clases hijas Perro, Gato, Caballo.
La clase Animal tendrá como atributos el nombre, alimento, edad y raza del
Animal.
Crear un método en la clase Animal a través del cual cada clase hija deberá
mostrar luego un mensaje por pantalla informando de que se alimenta. Generar
una clase Main que realice lo siguiente:
*/
package ejerc01herencia;

import ejerc01herencia.entidades.Animal;
import ejerc01herencia.entidades.Caballo;
import ejerc01herencia.entidades.Gato;
import ejerc01herencia.entidades.Perro;

public class Main01Herencia {

    public static void main(String[] args) {
        
        Animal perro = new Perro("Stich", "Carnivoro", 15, "Doberman");
        perro.alimentarse();
        
        Perro perro1 = new Perro("Teddy", "Croquetas", 10, "Chihuahua");
        perro1.alimentarse();
        
        Animal gato = new Gato("Pelusa", "Galletas", 15, "Siames");
        gato.alimentarse();
        
        Animal caballo = new Caballo("Spark", "Pasto", 25, "Fino");
        caballo.alimentarse();
        
    }
    
}
