package counting.controller;

import counting.view.CountingFrame;
import counting.model.*;
import javax.swing.JOptionPane;
public class CountingController 
{
	private CountingFrame countingFrame;
	private RecursionTool mathTool;
	private Timer mathTimer;
	
	public CountingController()
	{
		this.countingFrame = new CountingFrame(this);
		this.mathTool = new RecursionTool();
		this.mathTimer = new Timer();
	}
	
	public void start()
	{
		
	}
	
	public String trasferFactorial(String input)
	{
		String factorialInfo = "The factor of " + input + " is ";
		
		mathTimer.startTimer();
		
		if(isValid(input))
		{
			factorialInfo += mathTool.calculateFactorial(Integer.parseInt(input));
		}
		
		mathTimer.stopTimer();
		
		factorialInfo += "\n" + mathTimer.toString();
		
		return factorialInfo;
	}
	public String trasferFibonacci(String input)
	{
		String fibonacciInfo = "The fibonacci of " + input + " is ";
		
		mathTimer.startTimer();
		
		if(isValid(input))
		{
			fibonacciInfo += mathTool.calculateFibonacci(Integer.parseInt(input));
		}
		
		mathTimer.stopTimer();
		
		fibonacciInfo += "\n" + mathTimer.toString();
		
		mathTimer.resetTimer();
		
		fibonacciInfo += "\nThe iterated version returns";
		
		mathTimer.startTimer();
		
		if(isValid(input))
		{
			fibonacciInfo += mathTool.calaculateIteratibeFibonacci(Integer.parseInt(input));
		}
		
		mathTimer.stopTimer();
		
		fibonacciInfo += "\n" + mathTimer.toString();
		
		return fibonacciInfo;
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
