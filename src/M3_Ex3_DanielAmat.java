import java.util.Scanner;

public class M3_Ex3_DanielAmat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Variables:
		int num1 = 0, num2 = 0, num3 = 0;
		
		//Lògica:
		Scanner input = new Scanner(System.in);
		System.out.println("Introduce tu primera nota:");
		num1 = input.nextInt();
		System.out.println("Introduce tu segunda nota:");
		num2 = input.nextInt();
		System.out.println("Introduce tu tercera nota:");
		num3 = input.nextInt();	

	System.out.println("La media de tus tres notas es " + ((float)(num1 + num2 + num3) / 3));
		
	}

}
