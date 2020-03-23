var  bisiesto;
const year = 1948;


birthYear = 1989;
 leapYear = 4;
 bisiestos=0;
	     i=0;
    
  for ( j=year;j<birthYear; j++ ) {

  
if (i==leapYear) {
    bisiestos++
	i=0
}
i++
}


document.writeln("Los años bisiestos son" + " " + bisiestos);