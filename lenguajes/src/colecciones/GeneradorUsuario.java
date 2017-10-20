package colecciones;

import java.util.ArrayList;
import java.util.List;


public class GeneradorUsuario 
{
    public static void main(String[] args) 
    {
        Usuario usr1=new Usuario();
        usr1.setNombre("Moises");
        usr1.setEdad(20);
        usr1.setEmail("moises01@live.com.mx");
        
        Usuario usr2=new Usuario();
        usr2.setNombre("Roxana");
        usr2.setEdad(20);
        usr2.setEmail("Rox@gmail.com");
        
        Usuario usr3=new Usuario();
        usr3.setNombre("Alfonso");
        usr3.setEdad(25);
        usr3.setEmail("Px@gmail.com");
        
        Usuario usr4=new Usuario();
        usr4.setNombre("Camila");
        usr4.setEdad(22);
        usr4.setEmail("CL@gmail.com");
        
        Usuario usr5=new Usuario();
        usr5.setNombre("Amira");
        usr5.setEdad(23);
        usr5.setEmail(" AMR@gmail.com");
        // Generaremos un arreglo utable
        ArrayList<Usuario> usuarios=new ArrayList<Usuario>();//Esto indica que en este arreglo solamente se aceptan objetos de la clase Usuario
        usuarios.add(usr1);
        usuarios.add(usr2);
        usuarios.add(usr3);
        usuarios.add(usr4);
        usuarios.add(usr5);
        //Vamos a iterarlo para ver los nombres
        for(Usuario u: usuarios)
        {
            System.out.println("Nombre "+u.getNombre()+ "Email: "+u.getEmail()+ "Edad: "+u.getEdad());
        }
    }
}