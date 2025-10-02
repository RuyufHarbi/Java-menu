package treeMultiple;

import java.util.Stack;

public class drink_vending_machine {
Stack <Item> juice= new Stack<>();
Stack <Item> cola= new Stack<>();;
Stack <Item> water= new Stack<>();;
public drink_vending_machine() {};
public drink_vending_machine(Item water,Item cola,Item juice)
{
	this.water.push(water);
	this.cola.push(cola);
	this.juice.push(juice);
}
public void drink_vending_machineAdd(Item water,Item cola,Item juice)
{
	this.water.push(water);
	this.cola.push(cola);
	this.juice.push(juice);
}


}
