import java.util.Scanner;
import com.zubiri.geometria.Circulo;
import com.zubiri.geometria.Rectangulo;

/*
 *Programa para visualizar en pantalla el area y la circunferencia de un circulo 
 */
public class Main {

	public static void main (String args[]) {

	
		String palabra;
		String palabra1 = "rectangulo";
		String palabra2= "circulo";		
		Scanner sc = new Scanner(System.in);
		System.out.print("\ningresa el la operacion que quieres hacer circulo o rectangulo?: ");
		palabra = sc.next();
		
		int resultado=palabra.compareToIgnoreCase(palabra1);
		if (resultado == 0) {
		System.out.print("\nHAS ELEGIDO EL RECTANGULO ");
System.out.print("\n-----------------------------------------------------------------------------------------");
		double altura,base, resultadoArea, resultadoPerimetro ;
		
		Rectangulo rectangulo = new Rectangulo();
		
		System.out.print("\ningresa la ALTURA del rectangulo: ");
		altura = sc.nextDouble();
		System.out.print("\ningresa la BASE del rectangulo: ");
		base = sc.nextDouble();
		rectangulo.setAltura(altura);
		rectangulo.setBase(base);

		resultadoArea = rectangulo.area();

		System.out.println("\nEl AREA del RECTANGULO es: " + resultadoArea);

		resultadoPerimetro = rectangulo.perimetro();
	
		System.out.println("\nLa PERIMETRO del RECTANGULO es: " + resultadoPerimetro);

	
		}
		
	else
		{

	System.out.print("\nHAS ELEGIDO EL CIRCULO ");
System.out.print("\n***********************************************************************************");

		double radio, result, resultadoArea, resultadoCircunferencia ;
		Circulo circulo = new Circulo();
		
	
		System.out.print("\ningresa el radio del circulo: ");
		radio = sc.nextDouble();
		circulo.setRadio(radio);

		resultadoArea = circulo.area();

		System.out.println("\nEl AREA del circulo es: " + resultadoArea);

		resultadoCircunferencia = circulo.circunferencia();
		
		System.out.println("\nLa circunferencia del circulo es: " + resultadoCircunferencia);
	

	}
	
}
}
