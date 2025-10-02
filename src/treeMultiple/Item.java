package treeMultiple;

import java.util.Scanner;

public class Item {
	private int ID;
	private String Name;
	private int PrepareingTime;
	private double cost;
	private int stock;
	
	public Item(int ID,String Name,int PrepareingTime,double cost,int stock)
	{
		this.ID=ID;
		this.cost=cost;
		this.Name=Name;
		this.PrepareingTime=PrepareingTime;
		this.stock=stock;
	}
	 public Item() {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
	        return ID;
	    }

	    public String getName() {
	        return Name;
	    }

	    public int getPreparationTime() {
	        return PrepareingTime;
	    }

	    public double getCost() {
	        return cost;
	    }

	    public int getStock() {
	        return stock;
	    }
	    //to change the stock :)

	    public void setStock(int stock) {
	        this.stock = stock;
	    }
	    
	    public String toString()
	    {
	    	return "ID:"+ID+" Name:"+ Name+ " Prepareing Time:"+ PrepareingTime+" cost:$"+cost+ " avilable stock:"+stock;
	    			
	    }
	    public void StockUpdate(Item item,SinglyLinkedList<Item> WholeOrder ){
	    	System.out.println("how many?");
			Scanner quantity1 = new Scanner(System.in);
			int q1=quantity1.nextInt();
			
	    	if(q1<=item.getStock() && q1>0)
	    	{
	    		for (int i=0;i<q1;i++)
	    		{
	    			WholeOrder.addLast(item);
	    		}
	    		System.out.println(+q1+" "+item.getName()+"s were added succesfully :)");
	    		item.setStock(item.getStock()-q1);
	    	}
	    	else {
				System.out.println("Sorry not enough stock :( we only have "+item.getStock()+"left please try again ");
			}
	    }
	    
}
