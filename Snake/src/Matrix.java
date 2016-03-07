
public class Matrix {

	private Food list;
	private String[][] matrix;
	private Snake snake;
	private int row, kolom;
	private Node temp;
	
	public Matrix() 
	{
		matrix = new String[10][10];
		list = new Food();
		snake = new Snake();
		fill();
		SnakeToMatrix();
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
							}
						else /**insert white space*/
							{
								matrix[i][h] = "   ";
							}
					}
				i++;
				if(i == 10)
				{
					i = 0;
					h++;
				}
			}
		return matrix;
	}

		public void SnakeToMatrix()
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
			SnakeToMatrix();
			
			for(int i = 0; i < 24;i++)
			{
			System.out.println();
			}
			for(int r = 0; r < 10; r++)
			{
				for(int k = 0; k < 10; k++)
				{
					System.out.print(matrix[r][k]);
				}
				System.out.println();
			}
		}
		
		public void GameOver()
		{
			print();
			System.out.println("   GAME  OVER   ");
		}
		public void move()
		{
			while(temp.next != null)
			{
				int r = temp.row;
				int k = temp.kolom;
				temp.row = row;
				temp.kolom = kolom;
				temp = temp.next;
				row = r;
				kolom =k;
			}
		}
		public void right()
		{
			Node temp = snake.first;
			row = temp.row;
			kolom = temp.kolom;
			
			if(matrix[row+1][kolom].equals(" F "))
			{
				snake.add(row+1,kolom);	
			}
			else
			{
				if(matrix[row+1][kolom].equals(" * "))
				{
					GameOver();
				}
				if(matrix[row+1][kolom].equals("   "))
				{
					snake.first.kolom++;
					temp = temp.next;
					move();
				}
			}
			
		}
		
}
