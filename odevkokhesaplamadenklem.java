/* 04/11/2021
 * Emircan Koç
 * HR210057
 *
 * Denklemin köklerini bulan program 
 * 
 */




import java.util.Scanner ;




public class odevkokhesaplamadenklem {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in) ;
		
System.out.println(" (ax^2+bx+c) ifadesi ikinci dereceden bir denklemi belirtmektedir. \n Lütfen a , b ve c sabit sayýlarýný giriniz . \n" ) ;		

double a ,b , c   ;
double x1 ,x2 , delta	 ;


	System.out.println("Lütfen a sayýsýný giriniz");
	
a = input.nextDouble() ;
	
	System.out.println("Lütfen b sayýsýný giriniz ");

b = input.nextDouble() ;
	
	System.out.println("Lütfen c sayýsýný giriniz"); 

c = input.nextDouble();

	System.out.println("***************************************************************");
	System.out.println("Olusturulan ikinci dereceden denklem : " + a + "x^2 +"+ b + "x + " + c + " = 0 " );


delta = ((b*b) - (4*a*c)   ) ;
	
	System.out.println("Delta : " + delta);

	if(delta > 0 ) {
		
x1 =  ( ( -b + Math.sqrt(delta) ) /  2*a ) ;
	
x2 =  ( ( -b + Math.sqrt(delta) )  / 2*a  ) ;

		
		System.out.println("Delta > 0 yani denklemin iki kökü vardýr : ");
		System.out.println("Birinci kök : " + x1 );
		System.out.println("Ýkinci kök  : " + x2 );
		
	
	}else if(delta < 0  ) {
		
		System.out.println("Delta  < 0 yani bu denkemin gerçel kökü yoktur , yani denklemin çözümü bulunanamaz ");
		
		
	}else if( delta == 0 ) {
		
		x1 = x2 = (-b / 2*a) ;
		
		System.out.println("Delta = 0 Yani denklemin çakýþýk iki kökü vardýr (bu kökler birbirine eþittir)");
		System.out.println("x1 = x2 = "+  x1 );
		
		
		}

	}

}






