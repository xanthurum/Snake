
public class Node
{
	/**public to avoid get and set*/
	public int row, kolom;
	public String model;
	public Node next;
	
	public Node(int r, int k)
	{
		row = r;
		kolom = k;
		model = " o ";
	}
	
}
