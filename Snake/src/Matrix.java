
public class Matrix {

	private Food list;
	private String[][] matrix;
	
	public Matrix() 
	{
		matrix = new String[10][10];
		//list = new Food();
		vullen();
	}
	
	public String[][] vullen()
	{
		Food list = new Food();
		int i =0, h = 0;
		while(h < 10)
		{
			
			if(  (h == 0) || (h == (9)) )
			{
				matrix[i][h] = " * ";
				System.out.print(matrix[i][h]);
			}
			else
			{
				if(i == 0 || i == (9))
				{
					matrix[i][h] = " * ";
					System.out.print(matrix[i][h]);
				}
			else
				{
				int a = Integer.parseInt(Integer.toString(h)+Integer.toString(i));
				System.out.print(a);
				int b = 0; 

				for(int j = 0; j < 10; j++)
				{
					int c = list.Get(j);
					if(c == a)
					{
						b = 1;
					}
				}
				if(b == 1)
				{
					matrix[i][h] = "F";
					System.out.print(matrix[i][h]);
				}
					matrix[i][h] = "   ";
					System.out.print(matrix[i][h]);
				}
			}
			i++;
			if(i == 10)
			{
				i = 0;
				h++;
				System.out.println();
			}
		}
		return matrix;
	}
}
