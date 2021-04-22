import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{

  public static void main(String[] args) throws IOException {

    BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    Pasteleria proveedor = new Pasteleria();
    int auxiliarInt;

    //INGRESANDO EL TIPO DE PASTEL
    System.out.print("\n1) Cumpleaños \n2) Bodas \nSeleccione el evento: ");
    auxiliarInt = Integer.parseInt(in.readLine());
    switch(auxiliarInt){
      case 1:
        proveedor.evento = "cumple";
        break;
      case 2: 
        proveedor.evento = "boda";
        break;
      default:
        proveedor.evento = "boda";
        break;
    }

    //INGRESANDO LA FORMA
    System.out.print("\n1) Circular \n2) Cuadrado \nSeleccione un molde: ");
    auxiliarInt = Integer.parseInt(in.readLine());
    switch(auxiliarInt){
      case 1:
        proveedor.forma = "Circular";
        break;
      case 2: 
        proveedor.forma = "Cuadrado";
        break;
      default:
        proveedor.forma = "Circular";
        break;
    }

    //INGRESANDO LOS PISOS
    System.out.print("\nIngrese el número de pisos: ");
    proveedor.pisos = Integer.parseInt(in.readLine());

    //INGRESANDO EL TIPO DE MASA
    System.out.print("\n1) Batidas Aireadas \n2) Batidas Cremosas \nSeleccione un tipo de masa: ");
    auxiliarInt = Integer.parseInt(in.readLine());
    switch(auxiliarInt){
      case 1:
        proveedor.tipoMasa = "Batidas Aireadas";
        break;
      case 2: 
        proveedor.tipoMasa = "Cuadrado";
        break;
      default:
        proveedor.tipoMasa = "Circular";
        break;
    }

    //INGRESANDO EL COLOR DE MASA
    System.out.print("\n1) Blanca \n2) Marrón \n3) Rojo \nSeleccione un tipo de crema: ");
    auxiliarInt = Integer.parseInt(in.readLine());
    switch(auxiliarInt){
      case 1:
        proveedor.colorMasa = "Blanca";
        break;
      case 2: 
        proveedor.colorMasa= "Marron";
        break;
      case 3:
        proveedor.colorMasa = "Rojo";
      default:
        proveedor.colorMasa = "Blanca";
        break;
    }

    //INGRESANDO EL TIPO DE CREMA
    System.out.print("\n1) Ledevit \n2) Chantilly \n3) Pastelera \nSeleccione un tipo de crema: ");
    auxiliarInt = Integer.parseInt(in.readLine());
    switch(auxiliarInt){
      case 1:
        proveedor.tipoCrema = "Ledevit ";
        break;
      case 2: 
        proveedor.tipoCrema = "Chantilly";
        break;
      case 3:
        proveedor.tipoCrema = "Pastelera";
      default:
        proveedor.tipoCrema = "Pastelera";
        break;
    }

    //INGRESANDO SI QUIERE FRUTA
    System.out.print("\n1) Si \n2) No \n¿Desea frutas en el pastel?: ");
    auxiliarInt = Integer.parseInt(in.readLine());
    switch(auxiliarInt){
      case 1:
        proveedor.fruta = true;
        break;
      case 2: 
        proveedor.fruta = false;
        break;
      default:
        proveedor.fruta = false;
        break;
    }

    //INGRESANDO SI QUIERE CHOCOLATE
    System.out.print("\n1) Si \n2) No \n¿Desea chocolate en el pastel?: ");
    auxiliarInt = Integer.parseInt(in.readLine());
    switch(auxiliarInt){
      case 1:
        proveedor.chocolate = true;
        break;
      case 2: 
        proveedor.chocolate = false;
        break;
      default:
        proveedor.chocolate = false;
        break;
    }

    System.out.print("\nIngrese la frase que desee: ");
    proveedor.frase = in.readLine();

    System.out.print("\n======================================\n");

    //CRENADO EL OBJETO PASTEL
    Main metodos = new Main();
    metodos.construir(proveedor);
  }

  //MÉTODO PARA LAS CONSTRUCCIÓN DE OBJETOS
  public void construir(Pasteleria proveedor){

    switch(proveedor.evento){
      case "boda":
        BuilderPastelBoda builPastelBoda = new BuilderPastelBoda();
        proveedor.construirPastelBoda(builPastelBoda);
        PastelBoda pastelBoda = builPastelBoda.obtenerObjeto();
        pastelBoda.descripcion();
        
      case "cumple":
        BuilderPastelCumple builPastelCump = new BuilderPastelCumple();
        proveedor.construirPastelBoda(builPastelCump);
        PastelCumple pastelCumple = builPastelCump.obtenerObjeto();
        pastelCumple.descripcion();
    }
    
  }
}