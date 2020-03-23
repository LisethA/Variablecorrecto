/*Creeu una variable on juntareu el nom i els cognoms (tot en una variable) i un altre on juntareu la data
	de naixement separada per “/” (tot en una variable). Mostreu per consola les variables del nom complet,
	la data de naixement i si l’any de naixement es de traspàs o no.*/

package Fse1;

public class Fse4 {

		static String  information;
		
		public static void main(String[] args) {
		
				
				String  lastName =  "Liseth" + " " + "Arias" + " " + "Proaño";
				
				int  dateofBirth = 14051989;
				
				int birthYear = 1989;
				
				int leapYear = 4;
				
				boolean a =(birthYear % leapYear == 0 && ((birthYear % 100 != 0) || birthYear % 400 ==0));
				if(a) {
					
				}
					
					
				System.out.println("Mi nombre es "+ lastName );
				
				System.out.println("Nací el "+ "/" +dateofBirth );

				System.out.println ("El año " + birthYear + " no es bisiesto");
			}

		}


