package guesserGamePackage;

public class Umpire {
	
	int guesserNum;
	int player1Num;
	int player2Num;
	int player3Num;
	
	void startAndCollectNumb()
	{
	   Guesser guesser = new Guesser();
	   guesserNum = guesser.guessNum();
	   
	   Player player1 = new Player();
	   player1Num = player1.guessNum();
	   
	   Player player2 = new Player();
	   player2Num = player2.guessNum();
	   
	   Player player3 = new Player();
	   player3Num = player3.guessNum();
	   
	}
	
	void compare()
	{
		if(guesserNum == player1Num)
		{
			if(guesserNum == player2Num && guesserNum == player3Num)
			{
				System.out.println("All player have won");
			}
			
			else if(guesserNum == player2Num)
			{
				System.out.println("Player 1 and Player 2 have won");
			}
			else if(guesserNum == player3Num)
			{
				System.out.println("Player 1 and Player 3 have won");
			}
			
			else
			{
				System.out.println("Player 1 has won");
			}
		}
		
		else if (guesserNum == player2Num)
		{
			if(guesserNum == player3Num)
			{
				System.out.println("Player 2 and Player 3 have won");
			}
			else
			{
				System.out.println("Player 2 has won");
			}
		}
		
		else if(guesserNum == player3Num)
		{
			System.out.println("Player 3 has won");
		}
		else 
		{
			System.out.println("No one has won the match. Better luck next time!!!");
		}
	}
	

}
