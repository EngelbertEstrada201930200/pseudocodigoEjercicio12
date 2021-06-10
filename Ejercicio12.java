import java.util.*;
public class Ejercicio12{
	public static void main (String [] args){

		
		int altura; 
		int edad;
		char sexo;
		int sumaF = 0;
		int sumaM = 0;
		int cantF = 0;
		int cantM = 0;
		double promF = 0;
		double promM = 0;
		double promEdad = 0;
		int sumaEdad = 0;
		int cantEdad = 0;


		Scanner entrada = new Scanner(System.in);

		System.out.print( " Ingresa una edad: ");
		edad = entrada.nextInt();

		System.out.print( " Ingresa una altura: ");
		altura = entrada.nextInt();

		System.out.print(" Ingresa un sexo ( M/F): ");
		sexo = entrada.next().charAt(0);

		sexo = 'M';
		sexo = 'F';

		while ( altura > 0 ) {

			if ( sexo == 'F'){

				sumaF = sumaF+ altura;
				cantF = cantF + 1 ;
			}

			if ( sexo == 'M'){

				sumaM = sumaM + altura;
				cantM = cantM +1 ;
			}

			sumaEdad =  sumaEdad + edad ;
			cantEdad = cantEdad + 1 ;

			System.out.print( " Ingresa una edad: ");
			edad = entrada.nextInt();

			System.out.print( " Ingresa una altura: ");
			altura = entrada.nextInt();

			System.out.print(" Ingresa un sexo ( M/F): ");
			sexo = entrada.next().charAt(0);


		}

		promF = sumaF/cantF ; 
		promM = sumaM/cantM ;
		promEdad = sumaEdad/cantEdad; 

		System.out.println (" El promedio de la altura de las mujeres es: "+ promF);
		System.out.println ( "El promedio de la altura de los varones es: "+ promM);
		System.out.println (" El promedio de las edades de los participantes es; "+promEdad);


	}
}