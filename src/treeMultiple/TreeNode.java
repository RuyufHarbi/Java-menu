package treeMultiple;

import java.util.ArrayList;
import java.util.List;

public class TreeNode {
	  public int ID; //data for storage
	    String name;
	    public SinglyLinkedList<TreeNode> children;//array will keep children
	    public TreeNode parent;//parent to start the tree
	     public SinglyLinkedList<Item> items;

	    public TreeNode(int ID,String name) {
	    	this.name=name;
	        children = new SinglyLinkedList<>();
	        items = new SinglyLinkedList<>();
	        this.ID = ID;
	    }

	    public TreeNode addChild(TreeNode node) {
	        children.addLast(node);
	        node.parent = this;
	        return this;
	    }
	    public void addItems(Item it )
	    {
	    	items.addLast(it); 
	    	 
	    	
	    }
	   
}
