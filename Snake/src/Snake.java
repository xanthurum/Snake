
public class Snake 
{
	public static void main (String[]args)
	{

		public String[][] matrix;
		public int B, H;
	
		public Snake(int breedte, int hoogte) 
		{
			matrix = new String[hoogte][breedte];
			B = breedte;
			H = hoogte;
			vullen();
		}
	
		private void vullen()
		{
			int i =0, h = 0;
			while(h < H)
			{
			matrix[i][h] = "o";
			System.out.print(matrix[i][h]);
			i++;
				if(i == B)
				{
					i = 0;
					h++;
					System.out.println();
				}
			}
		}
	}

}
