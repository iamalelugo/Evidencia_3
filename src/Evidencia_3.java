import java.util.Scanner;

public class Evidencia_3 {

	static Scanner nombre = new Scanner(System.in);
	static Scanner number = new Scanner(System.in);
	static Scanner ecivil = new Scanner(System.in);
	static Scanner sex = new Scanner(System.in);
	static Scanner read = new Scanner(System.in);
	private static double promEdad;
	
	
	public static void main(String[] args) {	
		
		int opcion = 0;
		int total = 1;
		
		String[][] Personas = new String[500][4];
		
		do {
			for(int x = 0 ; x <= 500 ; x++) {
				
				System.out.println("Ingrese el nombre: ");
				String name = nombre.nextLine();
				Personas[x][0] = name;
				
				System.out.println("Ingrese la edad: ");
				String edad = number.nextLine();
				Personas[x][1] = edad;
				
				System.out.println("Ingrese su estado civil [C. Casado / S. Soltero]: ");
				String estado = ecivil.nextLine();
				Personas[x][2] = estado;
				
				System.out.println("Ingrese el sexo [M. Mujer / H. Hombre]: ");
				String sexo = sex.nextLine();
				Personas[x][3] = sexo;
						
				System.out.println("Desea agregar otra persona?[1. SI / 2.NO]");
				opcion = read.nextInt();
				
				if(opcion == 1) {
					total +=1;
					}
				else {
					break;
					}
				}
			}while(opcion == 1);
		
		double sumEdad = 0;
		int sumSolteros = 0;
		int sumCasados = 0;
		int sumMujer = 0;
		int sumHombre = 0;
		
		for(int i = 0; i < total; i++) {
			
			sumEdad = sumEdad + Double.parseDouble(Personas[i][1]); 
			
			if(Personas[i][3].equalsIgnoreCase("M") || Personas[i][3].equalsIgnoreCase("m")) {
				sumMujer = sumMujer + 1;
				}
			else 
			 if (Personas[i][3].equalsIgnoreCase("H")|| Personas[i][3].equalsIgnoreCase("h")){
				sumHombre = sumHombre + 1;
				}
			
			if(Personas[i][2].equalsIgnoreCase("C")|| Personas[i][2].equalsIgnoreCase("C")) {
				sumCasados = sumCasados + 1;
				
			}
			else 
			 if(Personas[i][2].equalsIgnoreCase("S") || Personas[i][2].equalsIgnoreCase("s")){
				sumSolteros = sumSolteros + 1;
			}
		}
		

		promEdad = sumEdad/total;
		
		double porcentHombres = (sumHombre*100)/total;
		
		double porcentMujeres = (sumMujer*100)/total;
		
		double porcentCasados = (sumCasados*100)/total;

		double porcentSolteros = (sumSolteros*100)/total;
		
		System.out.println("Total de personas capturadas: " +total);
		System.out.println("Promedio de edad: " +promEdad);
		System.out.println("Porcentaje de Hombres: " +porcentHombres);
		System.out.println("Porcentaje de Mujeres: "+porcentMujeres);
		System.out.println("Porcentaje de personas casadas: " +porcentCasados);
		System.out.println("Porcentaje de personas solteras: "+porcentSolteros);
		
	}
}
