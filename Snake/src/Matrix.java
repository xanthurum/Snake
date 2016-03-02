
public class Matrix {

	private int H, B;
	private String[][] matrix;
	
	public Matrix(int breedte, int hoogte) 
	{
		matrix = new String[breedte][hoogte];
		H = breedte;
		B = hoogte;
		vullen();
	}
	
	public String[][] vullen()
	{
		System.out.println("test");
		int i =0, h = 0;
		while(h < H)
		{
		matrix[i][h] = " o ";
		System.out.print(matrix[i][h]);
		i++;
			if(i == B)
			{
				i = 0;
				h++;
				System.out.println();
			}
		}
		return matrix;
	}
	
	public int getH()
	{
		return H;
	}
	
	public int getB()
	{
		return B;
	}
}
