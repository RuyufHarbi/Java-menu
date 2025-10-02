package treeMultiple;

import java.util.LinkedList;

public class Order {

	SinglyLinkedList <Item> item=new SinglyLinkedList<>(); 

	
	public Order (SinglyLinkedList <Item> s)
	{
		int Size = s.size();
		for (int l=0;l<Size;l++)
		{
			item.addLast(s.removeFirst());
		}
	}
	//total time
	public int TotalTime() {
		
		int TotalTime=0;
		item.moveToStart();
		for(int i = 0;i<item.size();i++)
		{
			TotalTime+=item.getValue().getPreparationTime();
			item.next();
		}
		return TotalTime;
	}
		//total price
		public double TotalPrice() {
			
			double TotalPrice=0;
			item.moveToStart();
			for(int j = 0;j<item.size();j++)
			{
				TotalPrice+=item.getValue().getCost();
				item.next();
			}
			return TotalPrice;
		
	}
}
