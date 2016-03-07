
public class Matrix {

	private Food list;
	private String[][] matrix;
	private Snake snake;
	
	public Matrix() 
	{
		matrix = new String[10][10];
		list = new Food();
		snake = new Snake();
		fill();
		SnaketoMatrix();
		print();
	}
	
	private String[][] fill()
	{
		snake.add(1,1);
		snake.add(1,2);
		snake.add(1,3);
		
		int i =0, h = 0;
			while(h < 10)
			{
				if(  (h == 0) || (h == 9) || (i == 0) || (i == 9)) /**sides matrix*/
					{
						matrix[i][h] = " * ";
						//System.out.print(matrix[i][h]);
					}
				else
					{
						/**configure cell number*/
						int a = Integer.parseInt(Integer.toString(h)+Integer.toString(i)); 
						//System.out.print(a);
						int b = 0; 
	
						for(int j = 0; j < 10; j++)
							{
								/**compare cell number with food number*/
								int c = list.Get(j);
								if(c == a)
								{
								b = 1;
								}
							}
						if(b == 1) /**insert food*/
							{
								matrix[i][h] = " F ";
								//System.out.print(matrix[i][h]);
							}
						else /**insert white space*/
							{
								matrix[i][h] = "   ";
								//System.out.print(matrix[i][h]);
							}
					}
				i++;
				if(i == 10)
				{
					i = 0;
					h++;
					//System.out.println();
				}
			}
		return matrix;
	}

		public void SnaketoMatrix()
		{
			Node temp = snake.first;
			
			while(temp != null)
			{
			matrix[temp.row][temp.kolom] = temp.model;
			temp = temp.next;
			}
		}
		public void print()
		{
			for(int r = 0; r < 10; r++)
			{
				for(int k = 0; k < 10; k++)
				{
					System.out.print(matrix[r][k]);
				}
				System.out.println();
			}
		}
		
}
