import java.util.Scanner;

public class SoloPares2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese un numero");;
		
		int n = sc.nextInt(); //Numero ingresado por Cliente
		int i = 0; //Contador
		int par = 0; //Variable pares
		
		while (i <n) {
			i++;
			par+=2;
			System.out.println(par);
			
			}
			
		}
	}


