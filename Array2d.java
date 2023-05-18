package coreJava;

public class Array2d {

	public static void main(String[] args) {
		double account [] [] = new double  [2] [100]; //3rd account info from list of 100.
		
		account [0][2] = 86.77; //savings account
		account [1][2] = 12.44; //current account
		
		System.out.println("The balance of savings account 3 is Rs." + account [0][2]);
		System.out.println("The balance of current account 3 is Rs." + account [1][2]);
	

	}

}
