package colecciones;

import java.util.ArrayList;
import java.util.List;


public class GeneradorUsuario 
{
    public static void main(String[] args) 
    {
        Usuarios usr1=new Usuarios();
        usr1.setNombre("Moises");
        usr1.setEdad(20);
        usr1.setEmail("moises01@live.com.mx");
        
        Usuarios usr2=new Usuarios();
        usr2.setNombre("Roxana");
        usr2.setEdad(20);
        usr2.setEmail("Rox@gmail.com");
        
        Usuarios usr3=new Usuarios();
        usr3.setNombre("Alfonso");
        usr3.setEdad(25);
        usr3.setEmail("Px@gmail.com");
        
        Usuarios usr4=new Usuarios();
        usr4.setNombre("Camila");
        usr4.setEdad(22);
        usr4.setEmail("CL@gmail.com");
        
        Usuarios usr5=new Usuarios();
        usr5.setNombre("Amira");
        usr5.setEdad(23);
        usr5.setEmail(" AMR@gmail.com");
        // Generaremos un arreglo utable
        ArrayList<Usuarios> usuarios=new ArrayList<Usuarios>();//Esto indica que en este arreglo solamente se aceptan objetos de la clase Usuario
        usuarios.add(usr1);
        usuarios.add(usr2);
        usuarios.add(usr3);
        usuarios.add(usr4);
        usuarios.add(usr5);
        //Vamos a iterarlo para ver los nombres
        for(Usuarios u: usuarios)
        {
            System.out.println("Nombre "+u.getNombre()+ "Email: "+u.getEmail()+ "Edad: "+u.getEdad());
        }
    }
}