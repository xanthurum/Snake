import java.util.Random;
//import static java.lang.Math.toIntExact;

public class Food extends Matrix
{
	public int[] list;
	
	public Food()
	{
		list = new int[10];
		food();
	}


	public int[] food()
	{
		for(int i = 0; i < 10; i++)
		{
			Random random = new Random();
			int k = random.nextInt(100);
			int d0 = k % 10;
			int d1 = (k - d0)/10;
			
			if((d0 == 0)||(d0 == 9)||(d1 == 0)||(d1 == 9))
			{
				i--;
			}
			else
			{
				list[i] = k;
				System.out.println(list[i]);
			}
		}
		return list;
	}
	
	public void test()
	{
		System.out.println("test");
	}
	
	public int Get(int x)
	{
		return list[x];
	}
}
