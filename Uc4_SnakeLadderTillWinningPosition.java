package com.snakeladder.oop;

public class Uc4_SnakeLadderTillWinningPosition {
	public void tillWinningPosition_100() {
		//local variable
		int position = 0;
		//computation
		while (position < 100) {
			//computing diceroll
			int diceRoll = (int) ((Math.random()*10) % 6 + 1);
			System.out.println("diceRoll = "+diceRoll);
			//computing condition
			int condition = (int) (Math.floor(Math.random()*10)%3);
			System.out.println("Condition =  "+condition);

			switch (condition) {
			case 0: //no play
				System.out.println("New Position is: "+position);
				break;

			case 1: //ladder
				if((position == 95 && diceRoll > 5) || (position == 96 && diceRoll > 4) || (position == 97 && diceRoll > 3) || (position == 98 && diceRoll > 2) || (position == 99 && diceRoll > 1))
					break;

				position+= diceRoll;
				System.out.println("New Position is: "+position);
				break;

			default: //snake
				position-= diceRoll;
				if (position >= 0) {
					System.out.println("New Position is: "+position);
				}
				else {
					position = 0;
					System.out.println("New Position is: "+position);
				}
			}
		}	
		if (position == 100) {
			System.out.println("CONGRATULATIONS \n YOU WON!!!");
		}
	}
	public static void main(String[] args) {
		Uc4_SnakeLadderTillWinningPosition obj1 = new Uc4_SnakeLadderTillWinningPosition();
		obj1.tillWinningPosition_100();
	}
}

