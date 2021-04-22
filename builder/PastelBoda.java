public class PastelBoda{

  //DECLARANDO ATRIBUTOS
  private final Crema crema;
  private final Decoracion decoracion;
  private final Masa masa;
  private final Molde molde;
  private final int pisos;

  //CREANDO CONSTRUCTOR
  public PastelBoda(Crema crema, Decoracion decoracion, Masa masa, Molde molde, int pisos){
    this.crema = crema;
    this.decoracion = decoracion;
    this.masa = masa;
    this.molde = molde;
    this.pisos = pisos;
  }

  //MÉTODO DESCRIPCION
  public void descripcion(){
    System.out.println("Ocasión: Boda");
    System.out.println("Molde: "+molde.getForma());
    System.out.println("Tipo de Masa: "+masa.getTipo());
    System.out.println("Color de Masa:"+masa.getColor());
    System.out.println("Tipo de Crema: "+crema.getTipo());
    System.out.println("Fruta: "+decoracion.getFrutas());
    System.out.println("Chololate: "+decoracion.getChocolate());
    System.out.println("Frase: "+decoracion.getFrase());
    System.out.println("Número de pisos: "+getPisos());
  }

  //MÉTODOS GETTER
  public Crema getCrema(){
    return crema;
  }

  public Decoracion getDecoracion(){
    return decoracion;
  }

  public Masa getMasa(){
    return masa;
  }

  public Molde getMolde(){
    return molde;
  }

  public int getPisos(){
    return pisos;
  }
}