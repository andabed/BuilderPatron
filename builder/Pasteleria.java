public class Pasteleria{

  //DECLARANDO ARREGLO CON PROPIEDADES
  int pisos;
  String forma, tipoMasa, colorMasa, tipoCrema, frase, evento;
  boolean fruta;
  boolean chocolate;

  //MÉTODO PARA CONSTRUIR PASTEL DE BODAS TOMANDO LO SOLICITADO POR EL CLIENTE
  public void construirPastelBoda(Builder pedido){
    pedido.asignarPisos(pisos);
    pedido.asignarMolde(new Molde(forma));
    pedido.asignarMasa(new Masa(tipoMasa, colorMasa));
    pedido.asignarCrema(new Crema(tipoCrema));
    pedido.asignarDecoracion(new Decoracion(fruta,chocolate,frase));
  } 

  //MÉTODO PARA CONSTRUIR PASTEL DE CUMPLEAÑOS TOMANDO LO SOLICITADO POR EL CLIENTE
  public void construirPastelCumple(Builder pedido){
    pedido.asignarPisos(pisos);
    pedido.asignarMolde(new Molde(forma));
    pedido.asignarMasa(new Masa(tipoMasa, colorMasa));
    pedido.asignarCrema(new Crema(tipoCrema));
    pedido.asignarDecoracion(new Decoracion(fruta,chocolate,frase));
  }
}
