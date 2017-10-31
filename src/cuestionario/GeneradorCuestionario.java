package cuestionario;

import java.util.ArrayList;


public class GeneradorCuestionario 
{
  public ArrayList<Pregunta> generar()
  {
  
      ArrayList<Pregunta> preguntas = new ArrayList<>();
      Opcion op11 = new Opcion("Moscu",false);
      Opcion op21 = new Opcion("Kiev", false);
      Opcion op31 = new Opcion("Helsinky", true);
      Opcion op41 = new Opcion("Tunn", false);
      //Generamos la Pregunta
      ArrayList<Opcion> opciones1 = new ArrayList<>();
      opciones1.add(op11);
      opciones1.add(op21);
      opciones1.add(op31);
      opciones1.add(op41);
      Pregunta p1 = new Pregunta("Capital de Finlandia:",opciones1);  
      preguntas.add(p1);      
      return preguntas;
  }
}