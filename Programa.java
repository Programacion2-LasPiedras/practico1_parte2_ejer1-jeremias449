import java.util.Scanner;

public class Programa {

    String apellido;
    int edad;
    double altura;
    long cedula;

	 Scanner entrada=new Scanner(System.in);
	
	 void iniciar(){
		cargar(apellido,edad,altura,cedula);
	}
  void cargar(String dato1,int dato2,double dato3,long dato4){
    System.out.println("Ingrese los datos pedidos a continuación");
    System.out.println("");
    dato1=apellido();
    dato2=edad();
    dato3=altura();
    dato4=cedula();
    imprimir(dato1, dato2, dato3, dato4);
  }
  String apellido(){
    Scanner sc=new Scanner(System.in);
    System.out.println("Cual es su apellido:");
    String a =sc.nextLine();
    return a;

  }
  int edad(){
    Scanner sc= new Scanner(System.in);
    System.out.println("");
    System.out.println("Cual es su edad:");
    int b = sc.nextInt();
    return b;


  }

  double altura(){
    Scanner sc=new Scanner(System.in);
    System.out.println("");
    System.out.println("Cual es su altura:");    //Esta altura es en metros, separando la unidad con un punto
    double c = sc.nextDouble();
    return c;
  }
  long cedula(){
    Scanner sc=new Scanner(System.in);
    System.out.println("");
    System.out.println("Cual es su Cédula:");
    long b = sc.nextLong();
    return b;
  }
  void imprimir(String a, int b, double c, long d){
    System.out.println("Los datos que ingreso: ");
    System.out.println("");
    System.out.println("su apellido: " + a);
    System.out.println("su edad: "+ b);
    System.out.println("su altura: " + c);
    System.out.println("su cédula: " + d);
  }
}
