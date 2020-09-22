import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese la cantidad de elementos para serie Fibonacci");
		
		int limite = sc.nextInt(); //Limite Fibonacci
		int a = 0; //Primer valor
		int b = 1; //Segundo valor
		int c; //Tercer valor
		
		for (int i = 0 ; i <= limite ; i++) {
			System.out.println(a);
			c = a + b;
			a = b;
			b = c;
		}
	}

}
