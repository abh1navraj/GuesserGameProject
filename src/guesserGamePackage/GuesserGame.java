package guesserGamePackage;

public class GuesserGame {
	
	public static void main(String[] args)
	{
		Umpire umpire = new Umpire();
		umpire.startAndCollectNumb();
		umpire.compare();
		
	}

}
