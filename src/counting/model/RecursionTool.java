package counting.model;

public class RecursionTool 
{
	public int calculateFactorial(int currentNumber)
	{
		if(currentNumber == 1 || currentNumber == 1)
		{
			return 1;
		}
		else
		{
			return calculateFactorial(currentNumber - 1) * currentNumber;
		}
	}

}