import java.util.Random;

public class Food
{
	public int number, d0, d1;
	
	public Food()
	{
		food();
	}


	public void food()
	{
			Random random = new Random();
			int k = random.nextInt(100);
			d0 = k % 10;
			d1 = (k - d0)/10;
			
			if((d0 == 0)||(d0 == 9)||(d1 == 0)||(d1 == 9)||
				(d1 == 1 && (d0 == 1||d0 == 2||d0 == 3)))
				/**exclude numbers being side numbers*/
			{
				food();
			}
			else
				/**list the random numbers*/
			{
				number = k;
			}
	}
}
