package treeMultiple;
import java.util.*;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
//ruyuf harbi 
//444011600
public class testmultible {
	  //ouside main
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		////////------------------MENU ------------------------------------
		TreeNode root = new TreeNode(1,"Menu") ;
		TreeNode App = new TreeNode(2,"Appetizers") ;//5
		TreeNode Salads = new TreeNode(5,"Salads") ;//5
		TreeNode Burgers = new TreeNode(3,"Burgers") ;
		TreeNode Pizzas = new TreeNode(4,"Pizzas") ;//5
		TreeNode Desert = new TreeNode(6,"Deserts") ;//5
		TreeNode Fried_burgers = new TreeNode(7,"Fried burgers") ;//2
		TreeNode Grilled_burgers = new TreeNode(8,"Grilled burgers") ;//3
		//asumply 
		root.addChild(App);
		root.addChild(Salads);
		root.addChild(Burgers);
		root.addChild(Pizzas);
		root.addChild(Desert);
		
		Burgers.addChild(Grilled_burgers);
		Burgers.addChild(Fried_burgers);
		
		//apitaizer and its items
		Item French_Fries = new Item(1 ,"French Fries",18 ,7, 20);
		Item Onion_Rings  = new Item(2 ,"Onion_Rings",18 ,7, 18);
		Item Mozzarella_Sticks  = new Item(3 ,"Mozzarella_Sticks",22  ,9,15);
		Item Chicken_Wings  = new Item(4 ,"Chicken_Wings",24 ,10,12);
		Item Nachos   = new Item(5 ,"Nachos",20 ,8,12);
		App.addItems(French_Fries);
		App.addItems(Onion_Rings);
		App.addItems(Mozzarella_Sticks);
		App.addItems(Chicken_Wings);
		App.addItems(Nachos);
		
		//salads and its items
		Item Caesar_Salad  = new Item(6 ,"Caesar_Salad",24 ,12, 8);
		Item Greek_Salad   = new Item(7 ,"Greek_Salad",24 ,12, 8);
		Item Caprese_Salad = new Item(8 ,"Caprese_Salad",24  ,12,8);
		Item Cobb_Salad    = new Item(9 ,"Cobb_Salad  ",26 ,13,8);
		Item Garden_Salad  = new Item(10 ,"Garden_Salad",20 ,10,10);
		
		Salads.addItems(Caesar_Salad);
		Salads.addItems(Greek_Salad);
		Salads.addItems(Caprese_Salad);
		Salads.addItems(Cobb_Salad);
		Salads.addItems(Garden_Salad);
		
		//fried borger
		Item Cheeseburger  = new Item(11 ,"Cheeseburger",30 ,10, 10);
		Item Hamburger   = new Item(12 ,"Hamburger",28 ,9, 15);
		Fried_burgers.addItems(Cheeseburger);
		Fried_burgers.addItems(Hamburger);
		//grillerd borger
		Item Veggie_Burger  = new Item(13 ,"Veggie_Burger",26 ,10, 12);
		Item Mushroom_Swiss_Burger= new Item(14 ,"Mushroom_Swiss_Burger",32 ,12, 10);
		Item BBQ_Chicken_Burger = new Item(15 ,"BBQ_Chicken_Burger",32 ,12, 10);
		Grilled_burgers.addItems(Veggie_Burger);
		Grilled_burgers.addItems(Mushroom_Swiss_Burger);
		Grilled_burgers.addItems(BBQ_Chicken_Burger );
		//pizzaz 
		Item Cheese_Pizza = new Item(16 ,"Cheese_Pizza",36 ,14, 10);
		Item Pepperoni_Pizza = new Item(17 ,"Pepperoni_Pizza",36 ,14, 10);
		Item Margherita_Pizza= new Item(18 ,"Margherita_Pizza",36 ,14, 10);
		Item BBQ_Chicken_Pizza = new Item(19 ,"BBQ_Chicken_Pizza",38 ,15, 10);
		Item Veggie_Pizza = new Item(20 ,"Veggie_Pizza",38 ,15, 10);
		Pizzas.addItems(Cheese_Pizza);
		Pizzas.addItems(Pepperoni_Pizza);
		Pizzas.addItems(Margherita_Pizza );
		Pizzas.addItems(BBQ_Chicken_Pizza );
		Pizzas.addItems(Veggie_Pizza  );
		
		//deserts
		Item Chocolate_Cake  = new Item(21 ,"Chocolate_Cake ",18 ,9, 10);
		Item Apple_Pie   = new Item(22 ,"Apple_Pie  ",18 ,9, 10);
		Item Ice_Cream_Sundae   = new Item(23 ,"Ice_Cream_Sundae  ",12 ,9, 10);
		Item Brownie_Sundae   = new Item(24 ,"Brownie_Sundae  ",14 ,10, 10);
		Item Cheesecake   = new Item(25 ,"Cheesecake  ",20 ,11, 8);
		Desert.addItems(Chocolate_Cake);
		Desert.addItems(Apple_Pie);
		Desert.addItems(Ice_Cream_Sundae);
		Desert.addItems(Brownie_Sundae);
		Desert.addItems(Cheesecake);
		
		////////------------------DRINKS ------------------------------------
		drink_vending_machine vending=new drink_vending_machine();
		
		Item j1 = new Item(1 ,"Juice" ,100, 10, 0);
		Item c1 = new Item(2, "Cola", 10, 5,0);
		Item w1 = new Item(3, "Water", 10, 2,0);
		vending.drink_vending_machineAdd(j1, c1, w1);
		Item j2 = new Item(4 ,"Juice" ,100, 10, 0);
		Item c2 = new Item(5, "Cola", 10, 5,0);
		Item w2 = new Item(6, "Water", 10, 2,0);
		vending.drink_vending_machineAdd(j2, c2, w2);
		Item j3 = new Item(7 ,"Juice" ,100, 10, 0);
		Item c3 = new Item(8, "Cola", 10, 5,0);
		Item w3 = new Item(9, "Water", 10, 2,0);
		vending.drink_vending_machineAdd(j3, c3, w3);
		Item j4 = new Item(10 ,"Juice" ,100, 10, 0);
		Item c4 = new Item(11, "Cola", 10, 5,0);
		Item w4 = new Item(12, "Water", 10, 2,0);
		vending.drink_vending_machineAdd(j4, c4, w4);
		Item j5 = new Item(13 ,"Juice" ,100, 10, 0);
		Item c5 = new Item(14, "Cola", 10, 5,0);
		Item w5 = new Item(15, "Water", 10, 2,0);
		vending.drink_vending_machineAdd(j5, c5, w5);
		Item j6 = new Item(16 ,"Juice" ,100, 10, 0);
		Item c6 = new Item(17, "Cola", 10, 5,0);
		Item w6 = new Item(18, "Water", 10, 2,0);
		vending.drink_vending_machineAdd(j6, c6, w6);
		Item j7 = new Item(19 ,"Juice" ,100, 10, 0);
		Item c7 = new Item(20, "Cola", 10, 5,0);
		Item w7 = new Item(21, "Water", 10, 2,0);
		vending.drink_vending_machineAdd(j7, c7, w7);
		Item j8 = new Item(22 ,"Juice" ,100, 10, 0);
		Item c8 = new Item(23, "Cola", 10, 5,0);
		Item w8 = new Item(24, "Water", 10, 2,0);
		vending.drink_vending_machineAdd(j8, c8, w8);
		Item j9 = new Item(25 ,"Juice" ,100, 10, 0);
		Item c9 = new Item(26, "Cola", 10, 5,0);
		Item w9 = new Item(27, "Water", 10, 2,0);
		vending.drink_vending_machineAdd(j9, c9, w9);

		SinglyLinkedList<Item> WholeOrder=new SinglyLinkedList<Item>();
		SinglyLinkedList<Order> orders =new SinglyLinkedList<>();//store alll orders here

		menu menu =new menu();
		
		
		menu.printHeader();
		boolean exit = false;
		while(exit!=true) {
			
			boolean exitAPP=false;
			boolean exitSAl=false;
			boolean exitBUR=false;
			
			boolean exitPIZ=false;
			boolean exitDES=false;
		menu.printMenu();
		int choice =menu.getInput("A");
		//main menuuu
		
		switch (choice) {
		case 0:
			
			System.out.println("here is your full order :");
			WholeOrder.print();
		    Order o = new Order(WholeOrder);
			orders.addLast(o);
			
			System.out.println("Total price:$"+o.TotalPrice()+"\nprepation Time:"+o.TotalTime()+" Minutes");
			System.out.println("༶•┈┈୨♡୧┈┈•༶ Thank you. ༶•┈┈୨♡୧┈┈•༶\n༶•┈┈୨♡୧┈┈•༶Enjoy your meal ༶•┈┈୨♡୧┈┈•༶");
			
			System.out.println("press 1 if you Would like to make a new order or 2 to Start preparing food !!");
			Scanner scanner1 = new Scanner(System.in);
			int newOrder=-1;
			   
			    while (newOrder<1 || newOrder>2)
			    {
			    	try {
			    		System.out.print("Enter your choice: ");
			    		newOrder=Integer.parseInt(scanner1.nextLine());
			    	}
			    	catch(NumberFormatException e)
			    	{
			    		System.out.println("inavlid selection please try again .");
			    	}
			    	
			    }
			if (newOrder==1) {
				WholeOrder.clear();
				
				break;
			}
			////TestT
			
			else if(newOrder==2)
			{
				//switch put order in queue 
				LinkedQueue<Order> kitchenLine = new LinkedQueue<Order>();
				orders.moveToStart();
				for (int y=0;y<orders.size();y++) {
					kitchenLine.enqueue(orders.getValue());
					orders.next();
				}
				boolean finished =false;
				int timer=0;
				//while loop
				while(finished!=true)
				{
					int numOfOrders=kitchenLine.size();
					for (int s=0;s<numOfOrders;s++) {
						Order tempOrder = new Order(kitchenLine.dequeue().item);
						System.out.println("now preparing :"); 
						tempOrder.item.print();
						
						timer=0;//reset
						for (int h=0 ;h<tempOrder.TotalTime();h++)//timer
						{
							timer++;
							
						}
					}
					System.out.println("would you like to order drinks?");
					System.out.println("1)Yes 2)No ");
					
					
					
					Scanner scannChoice = new Scanner(System.in);
					
				    int choiceString =-1;
				    while (choiceString<1 || choiceString>2)
				    {
				    	try {
				    		System.out.print("Enter your choice: ");
				    		choiceString=Integer.parseInt(scannChoice.nextLine());
				    	}
				    	catch(NumberFormatException e)
				    	{
				    		System.out.println("inavlid selection please try again .");
				    	}
				    	
				    }
					
					
					switch (choiceString) {
					case 1:
						menu.printDrinkMenuHeader();
						//idk order drink
						boolean moreDrinks=false;
					
						while(moreDrinks!=true) {
						menu.printDrinkMenu();
						int choiceDrink = menu.getInput("A");
						switch(choiceDrink) {
						case 0:
							moreDrinks=true;
							break;
						case 1:
							if(!(vending.juice.isEmpty())) {
							
							System.out.println("1 juice $10 ");
							vending.juice.pop();
						}else {
							System.out.println("we ran out of juice :(");
						}
							break;
						case 2:
							if(!(vending.cola.isEmpty())) {
							System.out.println("1 cola $5 ");
							vending.cola.pop();
							}
						else {
							System.out.println("we ran out of cola :(");
						}
							break;
						case 3:
							if(!(vending.water.isEmpty())) {
							System.out.println("1 water $1 ");
							vending.water.pop();
							}
							else {
								System.out.println("we ran out of water :(");
							}
							break;
							default:
								//useer cant get here ;P
								System.out.println("error 402");
								
						}
						}
					
						break;
					case 2:
						System.out.println("no drink requested ");
						
						
						break;
					default:
						System.out.println("you entered the Worng letterr needs to be capital try again please ");
				        }
					finished=true;
					}
						System.out.println("All your orders are finished would you like to make a new order?");
						System.out.println("press 1 to make a new order 2 to leave program ");
						int choiceNew=menu.getInput("B");
						switch(choiceNew) {
						case 1:
							orders.clear();
							break;
						case 2:
							exit= true;
							break;
						default:
							//user cant get here :P 
							System.out.println("finished loop error");
						}
					
			}
			break;
		case 1: //Appitizers
			
			while(exitAPP!=true) {
			System.out.println("\n Please make a selection: -->*");
			App.items.print();
			System.out.println("0) Return back");
			int choiceApp = menu.getInput("A");
			
			switch(choiceApp) {
			case 0:
				exitAPP = true ;
				break;
			case 1://french friees
				French_Fries.StockUpdate(French_Fries, WholeOrder);
				break;
			case 2://onion
				Onion_Rings.StockUpdate(Onion_Rings, WholeOrder);
				break;
			case 3://motzarilla
				Mozzarella_Sticks.StockUpdate(Mozzarella_Sticks , WholeOrder);
				break;
			case 4://chickenwings
				Chicken_Wings.StockUpdate(Chicken_Wings, WholeOrder);
				break;
			case 5://natchos
				Nachos.StockUpdate(Nachos , WholeOrder);
				break;
				default :
					//user cant even get here :P
			}
			}//end of while 
			
			break;
			
		case 2://Salads
			while(exitSAl!=true) {
				System.out.println("\n Please make a selection: -->*");
				Salads.items.print();
				System.out.println("0) Return back");
				int choiceSAl = menu.getInput("A");
				
				switch(choiceSAl) {
				case 0:
					exitSAl = true ;
					break;
				case 1://Caesar_Salad 
					Caesar_Salad.StockUpdate(Caesar_Salad, WholeOrder);
					break;
				case 2://Greek_Salad
					Greek_Salad.StockUpdate(Greek_Salad , WholeOrder);
					break;
				case 3://Caprese_Salad
					Caprese_Salad.StockUpdate(Caprese_Salad, WholeOrder);
					break;
				case 4://Cobb_Salad
					Cobb_Salad.StockUpdate(Cobb_Salad , WholeOrder);
					break;
				case 5://Garden_Salad
					Garden_Salad .StockUpdate(Garden_Salad , WholeOrder);
					break;
					default :
						//user cant even get here :P
				}
				}//end of while 
				
				break;
		case 3://Burgers
			while(exitBUR!=true) {
				boolean exitFB=false;
				boolean exitGB=false;
				System.out.println("\n Please make a selection: -->*");
				System.out.println("1) Fried Burgers");
				System.out.println("2) Griled Burgers");

				System.out.println("0) Return back");
				int choiceBUR = menu.getInput("B");
				
				switch(choiceBUR) {
				case 0:
					exitBUR = true ;
					break;
				case 1://Fried burger
					while(exitFB!=true)
					{
						System.out.println("\n Please make a selection: -->*");
						Fried_burgers.items.print();
						System.out.println("0) Return back");
						int choiceFB = menu.getInput("B");
						switch(choiceFB)
						{
						case 0:
							exitFB=true;
							break;
						case 1:
							Cheeseburger.StockUpdate(Cheeseburger, WholeOrder);
							break;
						case 2:
							Hamburger.StockUpdate(Hamburger, WholeOrder);
							break;
						default:
								//user cant even get here :P
						}

					}
					break;
				case 2://grilled
					while(exitGB!=true)
					{
						System.out.println("\n Please make a selection: -->*");
						Grilled_burgers.items.print();
						System.out.println("0) Return back");
						int choiceGB = menu.getInput("C");
						switch(choiceGB)
						{
						case 0:
							exitGB=true;
							break;
						case 1:
							Veggie_Burger.StockUpdate(Veggie_Burger, WholeOrder);
							break;
						case 2:
							Mushroom_Swiss_Burger .StockUpdate(Mushroom_Swiss_Burger , WholeOrder);
							break;
						case 3:
							BBQ_Chicken_Burger  .StockUpdate(BBQ_Chicken_Burger  , WholeOrder);
							break;
						default:
								//user cant even get here :P
						}

					}
					
					
				}
			}
			break;
		
		case 4://Pizzaz
			while(exitPIZ!=true) {
				System.out.println("\n Please make a selection: -->*");
				Pizzas.items.print();
				System.out.println("0) Return back");
				int choicePIZ = menu.getInput("A");
				
				switch(choicePIZ) {
				case 0:
					exitPIZ = true ;
					break;
				case 1://french friees
					Cheese_Pizza .StockUpdate(Cheese_Pizza , WholeOrder);
					break;
				case 2://onion
					Pepperoni_Pizza .StockUpdate(Pepperoni_Pizza , WholeOrder);
					break;
				case 3://motzarilla
					Margherita_Pizza .StockUpdate(Margherita_Pizza  , WholeOrder);
					break;
				case 4://chickenwings
					BBQ_Chicken_Pizza .StockUpdate(BBQ_Chicken_Pizza , WholeOrder);
					break;
				case 5://natchos
					Veggie_Pizza .StockUpdate(Veggie_Pizza  , WholeOrder);
					break;
					default :
						//user cant even get here :P
				}
				}//end of while 
				
				break;
		case 5://desert
			while(exitDES!=true) {
				System.out.println("\n Please make a selection: -->*");
				Desert.items.print();
				System.out.println("0) Return back");
				int choiceDES = menu.getInput("A");
				
				switch(choiceDES) {
				case 0:
					exitDES = true ;
					break;
				case 1://french friees
					Chocolate_Cake  .StockUpdate(Chocolate_Cake  , WholeOrder);
					break;
				case 2://onion
					Apple_Pie  .StockUpdate(Apple_Pie  , WholeOrder);
					break;
				case 3://motzarilla
					Ice_Cream_Sundae  .StockUpdate(Ice_Cream_Sundae   , WholeOrder);
					break;
				case 4://chickenwings
					Brownie_Sundae  .StockUpdate(Brownie_Sundae  , WholeOrder);
					break;
				case 5://natchos
					Cheesecake.StockUpdate(Cheesecake , WholeOrder);
					break;
					default :
						//user cant even get here :P
				}
				}//end of while 
				
				break;
		default://null
			System.out.println("An unkown error occured ");
		}
		}
	
		
	

	}
}
