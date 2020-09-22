import java.util.Scanner;

public class SumaImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero");
		
		int n = sc.nextInt();
		int i;
		int sum = 0;
		
		for (i = 0; i < n; i = i + 1) {
			if (i%2!=0) {
				sum = sum + i;
			}
		}
		System.out.println("La suma de los numeros impares es " + sum);
	}

}
