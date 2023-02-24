package guesserGamePackage;

import java.util.Scanner;

public class Player {
	
	int guessNum;
	
	
	int guessNum() {
		Scanner sc =new Scanner(System.in);
		System.out.println("Player, please guess a number");
		guessNum = sc.nextInt();
		return guessNum;
		
	}
	

}
