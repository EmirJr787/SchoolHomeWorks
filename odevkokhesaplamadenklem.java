/* 04/11/2021
 * Emircan Ko�
 * HR210057
 *
 * Denklemin k�klerini bulan program 
 * 
 */




import java.util.Scanner ;




public class odevkokhesaplamadenklem {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in) ;
		
System.out.println(" (ax^2+bx+c) ifadesi ikinci dereceden bir denklemi belirtmektedir. \n L�tfen a , b ve c sabit say�lar�n� giriniz . \n" ) ;		

double a ,b , c   ;
double x1 ,x2 , delta	 ;


	System.out.println("L�tfen a say�s�n� giriniz");
	
a = input.nextDouble() ;
	
	System.out.println("L�tfen b say�s�n� giriniz ");

b = input.nextDouble() ;
	
	System.out.println("L�tfen c say�s�n� giriniz"); 

c = input.nextDouble();

	System.out.println("***************************************************************");
	System.out.println("Olusturulan ikinci dereceden denklem : " + a + "x^2 +"+ b + "x + " + c + " = 0 " );


delta = ((b*b) - (4*a*c)   ) ;
	
	System.out.println("Delta : " + delta);

	if(delta > 0 ) {
		
x1 =  ( ( -b + Math.sqrt(delta) ) /  2*a ) ;
	
x2 =  ( ( -b + Math.sqrt(delta) )  / 2*a  ) ;

		
		System.out.println("Delta > 0 yani denklemin iki k�k� vard�r : ");
		System.out.println("Birinci k�k : " + x1 );
		System.out.println("�kinci k�k  : " + x2 );
		
	
	}else if(delta < 0  ) {
		
		System.out.println("Delta  < 0 yani bu denkemin ger�el k�k� yoktur , yani denklemin ��z�m� bulunanamaz ");
		
		
	}else if( delta == 0 ) {
		
		x1 = x2 = (-b / 2*a) ;
		
		System.out.println("Delta = 0 Yani denklemin �ak���k iki k�k� vard�r (bu k�kler birbirine e�ittir)");
		System.out.println("x1 = x2 = "+  x1 );
		
		
		}

	}

}






