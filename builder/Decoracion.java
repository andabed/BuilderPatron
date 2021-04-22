public class Decoracion{

  //DECLARANDO ATRIBUTOS
  private boolean frutas;
  private boolean chocolate;
  private String frase;

  //CONSTRUCTOR
  public Decoracion(boolean frutas, boolean chocolate, String frase){
    this.frutas = frutas;
    this.chocolate = chocolate;
    this.frase = frase;
  }

  //METODOS GETTER Y SETTER
  public boolean getFrutas(){
    return frutas;
  }

  public boolean getChocolate(){
    return chocolate;
  }

  public String getFrase(){
    return frase;
  }
  
}