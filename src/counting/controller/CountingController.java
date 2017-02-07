package counting.controller;

import counting.view.CountingFrame;
import counting.model.RecursionTool;
import javax.swing.JOptionPane;
public class CountingController 
{
	private CountingFrame countingFrame;
	private RecursionTool mathTool;
	
	public CountingController()
	{
		this.countingFrame = new CountingFrame(this);
		this.mathTool = new RecursionTool();
	}
	
	public void start()
	{
		
	}
	
	public String trasferFactorial(String input)
	{
		String factorialInfo = "The factor of " + input + " is ";
		
		if(isValid(input))
		{
			factorialInfo += mathTool.calculateFactorial(Integer.parseInt(input));
		}
		
		return factorialInfo;
	}
	
	private boolean isValid(String testValue)
	{
		try
		{
			double test = Double.parseDouble(testValue);
			if(test >= 0)
			{
				return true;
			}
			else 
			{
				return false;
			}
		}
		catch(NumberFormatException error)
		{
			JOptionPane.showMessageDialog(countingFrame, "Type in a valid number >= 0");
			return false;
		}
	}

}
