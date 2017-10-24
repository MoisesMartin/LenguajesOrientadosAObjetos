package cuestionario;

import java.util.ArrayList;


public class Pregunta 
{
    private String titulo;
    private ArrayList<Opcion> respuesta;

    public Pregunta(String titulo, ArrayList<Opcion> respuesta) {
        this.titulo = titulo;
        this.respuesta = respuesta;
    }

    
    public Pregunta(String titulo) {
        this.titulo = titulo;
    }

    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Opcion> getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(ArrayList<Opcion> respuesta) {
        this.respuesta = respuesta;
    }
}
