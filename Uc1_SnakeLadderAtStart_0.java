package com.snakeladder.oop;

public class Uc1_SnakeLadderAtStart_0 {
	
	public void singlePlayer() {
		int position=0;
		while(position <= 100)
		{
			System.out.println("Current Position of a player = "+position);
			position++;
		}
	}

	public static void main(String[] args) {
		Uc1_SnakeLadderAtStart_0 obj1 = new Uc1_SnakeLadderAtStart_0();
		obj1.singlePlayer();
	}
}	


