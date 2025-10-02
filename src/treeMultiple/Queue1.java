package treeMultiple;

public interface Queue1 <E> {

	int size();
	
	boolean isEmpty();
	void enqueue(E e);
	E first();
	E dequeue();
}
