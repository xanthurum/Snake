
public class Matrix {

	private Food food;
	private String[][] matrix;
	private Snake snake;
	private int row, kolom;
	private Node temp;
	
	public Matrix() 
	{
		matrix = new String[10][10];
		food = new Food();
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
		
		NewFood();
		
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
						
						if(a == food.number) /**insert food*/
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

		public void NewFood()
		{
			while(TestSnake(food.d1,food.d0))
			{
			food = new Food();
			}	
		}
		public void SnakeToMatrix()
		{
			temp = snake.first;
			
			while(temp != null)
			{
			matrix[temp.row][temp.kolom] = temp.model;
			temp = temp.next;
			}
		}
		
		public void ClearSnake()
		{
			Node temp = snake.first;
			
			while(temp != null)
			{
			matrix[temp.row][temp.kolom] = "   ";
			temp = temp.next;
			}
		}
		
		public void print()
		{
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
		
		public Boolean GameOver(int x, int y)
		{
			if(matrix[row+x][kolom+y].equals(" * ") ||
					   matrix[row+x][kolom+y].equals(temp.model))
			{
				print();
				System.out.println("   GAME  OVER   ");
				return true;
			}
			else return false;
				
		}
		public void move()
		{
			while(temp != null)
			{
				int r = temp.row;
				int k = temp.kolom;
				temp.row = row;
				temp.kolom = kolom;
				temp = temp.next;
				row = r;
				kolom =k;
			}
			SnakeToMatrix();
		}
		public void task(int x, int y)
		{
			temp = snake.first;
			row = temp.row;
			kolom = temp.kolom;
			if(!GameOver(x,y))
			{
				if(matrix[row+x][kolom+y].equals(" F "))
				{
					snake.add(row+x,kolom+y);	
					SnakeToMatrix();
					NewFood();
					matrix[food.d1][food.d0] = " F ";
					print();
				}
				else
				{
					if(matrix[row+x][kolom+y].equals("   "))
					{
						
						if(x == 0 )
						{
							snake.first.kolom = snake.first.kolom +y;
							temp = temp.next;
							ClearSnake();
							move();
							print();
						}
						else if(y == 0)
						{
							snake.first.row = snake.first.row +x;
							temp = temp.next;
							ClearSnake();
							move();
							print();
						}
					}
				}
		   }
		}
		public boolean TestSnake(int row, int kolom)
		{
			Node temp = snake.first;
			Boolean result = false;
			while(temp != null)
			{
				if(temp.row == row && temp.kolom == kolom)
				{
					result = true;
				}
				else 
				{
					temp = temp.next;
					result = false;
				}
			}
			return result;
		}
}
