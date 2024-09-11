package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in); 
		System.out.println("Please enter the start amount");
		int startAmount = in.nextInt();
		System.out.println("Please enter the win chance");
		double winChance = in.nextDouble();
		System.out.println("Please enter the win limit");
		int winLimit = in.nextInt();
		System.out.println("Please enter the total simulations");
		int totalSimulations = in.nextInt();
		
		for (int i = 0; i < totalSimulations+1; i++) {
			int count = 0;
			while (startAmount < winLimit && startAmount > 0) {
				double random = Math.random();
				if (random < winChance) {
					startAmount++;
					count++;
				} else {
					startAmount--;
					count++;
				}
				
				System.out.println(startAmount);
				System.out.println(random);
				
			}
			
			if (startAmount >= winLimit) {
				System.out.println("Day " + (i+1) + " was a success! You played " + count + " rounds.");
			} else if (startAmount <= 0) {
				System.out.println("Day " + (i+1) + " was a ruin! You played " + count + " rounds.");
			}
			
		}
		
		
			

	}

}
