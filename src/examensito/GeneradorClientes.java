//Esta es la clase modelo GeneradorClientes
package examensito;

import java.util.ArrayList;

public class GeneradorClientes 
{
    public  ArrayList<Cliente>generarCliente()
    {
        //Generamos el arreglo que contenga las preguntas
        ArrayList<Cliente> cliente = new ArrayList<Cliente>();
        //Generar 3 clientes con sus respectivas direcciones y datos ficticios
        Direccion dir1=new Direccion("Calle 31", "Campestr Guadalupana", "Nezahualcoyotl", 57120);
        Cliente cliente1=new Cliente("Moises Martin", "moises01@live.com.mx",20,dir1);
       
    return cliente;
    }
}
