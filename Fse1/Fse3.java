package Fse1;



public class Fse3 {

		public static void main(String[] args) {
		
			
			int birthYear = 1989;
			int leapYear = 4;
			int year = 1948;
		 
		   
		    
		    
	 for (int j=year;year<=birthYear;year++) {
		 boolean a =(year % leapYear == 0 && ((year % 100 != 0) || year % 400 ==0));
		if(a) {
			System.out.println ("El año " + year + " es bisiesto");
		
		}else {
					
					System.out.println ("El año " + year + " no es bisiesto");
				}
	 

	}
	}
	}


			


