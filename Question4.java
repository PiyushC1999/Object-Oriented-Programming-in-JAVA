package Assignment1;

public class Question4 {

	public static void main(String[] args) {
		System.out.println("The Even Numbers :");
		for(int a=1;a<=100;a++) {
			if(a%2==0) {
				System.out.print(a+ " " );
			}
		}
		System.out.println("\nThe Odd Numbers : ");
		for(int b=1;b<=100;b++) {
			if(b%2!=0) {
				System.out.print(b+ " " );
			}
		}
	}
}
