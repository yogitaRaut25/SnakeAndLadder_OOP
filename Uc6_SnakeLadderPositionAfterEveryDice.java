package com.snakeladder.oop;

public class Uc6_SnakeLadderPositionAfterEveryDice {
	public void positionAfterEveryDice() {
		//local variable
		int position = 0;
		int totalDiceRoll=0;
		//computation to exact winning position 100
		while (position < 100) {
			//dice computation
			int diceRoll = (int) ((Math.random()*10) % 6 + 1);
			System.out.println("diceRoll = "+diceRoll);
			totalDiceRoll+=diceRoll;
			//condition computation
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
		System.out.println("total dice roll = "+totalDiceRoll);
	}

	public static void main(String[] args) {
		Uc6_SnakeLadderPositionAfterEveryDice obj1 = new Uc6_SnakeLadderPositionAfterEveryDice();
		obj1.positionAfterEveryDice();
	}
}

