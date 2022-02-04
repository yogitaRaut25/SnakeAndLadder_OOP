package com.snakeladder.oop;

public class Uc2_SnakeLadderRollDice {

	public void rollDice() {
		int position=0;
		int diceRoll=0;
		while(position < 100)
		{
			diceRoll=(int)((Math.random()*10)%6)+1;
			System.out.println(diceRoll);
			if((position == 95 && diceRoll > 5) || (position == 96 && diceRoll > 4) || (position == 97 && diceRoll > 3) || (position == 98 && diceRoll > 2) || (position == 99 && diceRoll > 1))
				break;
			position+=diceRoll;
			System.out.println("Current Position of a player = "+position);
		}
	}	
	public static void main(String[] args) {
		Uc2_SnakeLadderRollDice obj1 = new Uc2_SnakeLadderRollDice();
		obj1.rollDice();
	}

}
