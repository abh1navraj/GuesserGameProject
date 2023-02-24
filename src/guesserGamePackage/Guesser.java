package guesserGamePackage;

import java.util.Scanner;

public class Guesser {
	
	int guessNum;
	
	int guessNum()
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Gusser, please guess a number: ");
		guessNum = sc.nextInt();
		return guessNum;
	}

}
