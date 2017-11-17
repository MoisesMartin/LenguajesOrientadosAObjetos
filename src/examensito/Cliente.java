
package examensito;


public class Cliente {
    private String nombre;
    private String email;
    private int edad;
    private Direccion direccion;
    
    //Constructor por defecto
    public Cliente()
    {
        
    }
    //Generar el constructor que inicializa todos los atributos
    public Cliente(String nombre, String email, int edad, Direccion direccion)
    {
        this.nombre = nombre;
        this.email = email;
        this.edad = edad;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }
}
