
public class Snake 
{
	private Matrix matrix;
	private int B, H;
	
	public Snake(int breedte, int hoogte) 
	{
		B = breedte;
		H = hoogte;
		matrix = new Matrix(breedte, hoogte);
	}


	public static void main (String[]args)
	{
		Snake snake = new Snake(10,10);
	}
}
	

	


