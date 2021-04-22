public class BuilderPastelCumple implements Builder{

  //DECLARANDO ATRIBUTOS
  private Crema crema;
  private Decoracion decoracion;
  private Masa masa;
  private Molde molde;
  private int pisos = 0;

  @Override
  public void asignarPisos(int pisos){
    this.pisos = pisos;
  }

  @Override
  public void asignarMolde(Molde molde){
    this.molde = molde;
  }

  @Override
  public void asignarMasa(Masa masa){
    this.masa = masa;
  }

  @Override
  public void asignarDecoracion(Decoracion decoracion){
    this.decoracion = decoracion;
  }

  @Override
  public void asignarCrema(Crema crema){
    this.crema = crema;
  }

  //MÉTODO PARA RETORNAR EL OBJETO CREADO
  public PastelCumple obtenerObjeto(){

    if(pisos == 0){
      pisos = 1;
    }

    return new PastelCumple(crema, decoracion, masa, molde, pisos);

  }
}