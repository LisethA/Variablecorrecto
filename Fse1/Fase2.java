/*Sabent que l�any 1948 es un any de trasp�s:
Creeu una constant amb el valor de l�any (1948).
Creeu una variable que guardi cada quan hi ha un any de trasp�s.
Calculeu quants anys de trasp�s hi ha entre 1948 i el vostre any de naixement i emmagatzemeu el valor
resultant en una variable.
Mostreu per pantalla el resultat del c�lcul.*/

package Fse1;

public class Fase2 {
	
	static int year=1948;
	
	public static void main(String[] args) {
		
		int birthYear = 1989;
		int leapYear = 4;
		int bisiestos=Math.abs(year-birthYear)/leapYear;  //metodo que devuelve resultado absoluto 
		int i=0;
		
		System.out.println("Los a�os bisiestos son " + bisiestos); // calculado con formula matematica

	
		bisiestos = 0;
		for (int j=year;j<birthYear;j++) {  
			
			
			if(i==leapYear) {  
				bisiestos++;
				i=0;
			}
			i++;
		}
		
		
		System.out.println("Los a�os bisiestos son " + bisiestos); // calculado con un bucle

	}
}


