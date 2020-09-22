import java.util.Scanner;

public class SumaImparLimite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese un numero");
		int a = sc.nextInt(); //Primer valor limite
		System.out.println("Ingrese un segundo numero");
		int b = sc.nextInt(); //Segundo valor limite
		int c = 0; //Suma impar
		
		
		while (a < b) {
			a = a + 1;
			if (a % 2 != 0) {
			c = c + a;}}
	
			System.out.println("La suma de los numeros impares es " + c);
	}

}
