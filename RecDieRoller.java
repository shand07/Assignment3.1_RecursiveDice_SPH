/**
 * 
 * @author shand
 *
 */
import java.util.Random;

public class RecDieRoller 
{
	
	Random random = new Random();//Random Object used to roll.
	int rand = 0;//Int value where we will store our rolled int.
	int rolls = 0;//Number of times we have rolled
	int amountOfTwos = 0;//The amount of twos we currently have
	
	
	
	/**
	 * Recursive Roll() for rolling a random die. If we get a 2 we will print
	 * and return that value. If not, we will print the value we rolled,
	 * and roll again until we get a 2.
	 * @return rand when it equals 2.
	 */
	
	public int roll()
	{
		
		while(rolls<1000)
		{
		
			rand = random.nextInt(1,7);//Our 1-6 die.
			rolls++;//Increment of rolls for our while loop to get 1000 rolls.
			
			
			if(rand!=2)//Recursive if statement for not rolling a 2. If we don't get a 2 we print the number we rolled and then we call the roll method again.
			{
				System.out.println("You rolled a " +rand);
				roll();//Recursive Method
			}
			else//If we get a 2 we print that we rolled a two, increment the number of twos by one, and print the amount of twos we currently have.
			{
				System.out.println("You have rolled a " +rand+ "!");
				amountOfTwos++;//Increment of twos
				System.out.println("You currently have rolled: " +amountOfTwos+ " two's!");
			}
			
			
		}
		
		return rand;//Return statement for the random number we rolled.
		
	}
	/**
	 * Method for getting the mean roll of twos in decimal format out of 1000 rolls.
	 */
	public void mean()
	{
		System.out.println("The mean number of two's until a 2 is rolled this session: "+ (double)amountOfTwos/1000);
	}
		
}
