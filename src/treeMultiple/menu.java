package treeMultiple;

import java.util.Scanner;

public class menu {
	
	boolean exit=false;
	boolean exitAPP=false;
	
	
	public void printHeader()
	{
		System.out.println("+_________________________+");
		System.out.println("|    WELCOME TO FOOFY     |");
		System.out.println("|      ꕥ RESTURANT ꕥ     |");
		System.out.println("+_________________________+");
	}
	public void printMenu() {
		System.out.println("\n Please make a selection: -->*");
		System.out.println("1) ୨⎯ Appetizers ⎯୧");
		System.out.println("2) ୨⎯ Salads ⎯୧");
		System.out.println("3) ୨⎯ Burgers ⎯୧");
		System.out.println("4) ୨⎯ Pizzaz ⎯୧");
		System.out.println("5) ୨⎯ Deserts ⎯୧");
		System.out.println("0) ୨⎯ Exit and complete order ⎯୧");
	}
	public void printDrinkMenu()
	{
		System.out.println("\n Please make a selection: -->*");
		System.out.println("1) Juice");
		System.out.println("2) Cola");
		System.out.println("3) Water");
		System.out.println("0) exit");

	}
	public void printDrinkMenuHeader()
	{
		System.out.println("+_________________________+");
		System.out.println("|         WELCOME         |");
		System.out.println("|   ꕥ VENDING MACHINE ꕥ  |");
		System.out.println("+_________________________+");
		
	}
	
	public int getInput(String s)
	{
		int y=5;
		int x=0;
	
		 if (s=="B")
		{
			
			y=2;
		}
		else if(s=="C")
		{
			y=3;
		}
		
		Scanner scanner = new Scanner(System.in);
		int choiceMethod =-1;
		while(choiceMethod <x || choiceMethod >y) {
			try {
				System.out.println("\nEnter choice: ");
				choiceMethod = Integer.parseInt(scanner.nextLine());
				
			}catch(NumberFormatException e)
			{
				System.out.println("Inavlid selection. Please try again.");
			}
		}
		return choiceMethod;
		
		
		
		
	}
	
	
}
