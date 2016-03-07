import java.util.*;

public class Snake
{
	public Node first;
	private int size;
	
	public Snake() 
	{
	first = null;
	size = 0;
	}
	
	public boolean empty()
	{
		return(first == null);
	}
	public void add(int r, int k) /**add new link to the list*/
	{
		Node newNode = new Node(r, k);
		newNode.next = first;
		first = newNode;
		size++;
	}
	
	public Node next() /**next node*/
	{
		return first.next;
	}
}
	

	


