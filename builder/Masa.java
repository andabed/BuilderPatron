public class Masa{

  //DECLARANDO ATRIBUTOS
  private String tipo;
  private String color;

  //CONSTRUCTOR
  public Masa(String tipo, String color){
    this.tipo = tipo;
    this.color = color;
  }

  //MÉTODOS GETTER
  public String getTipo(){
    return tipo;
  }

  public String getColor(){
    return color;
  }
}