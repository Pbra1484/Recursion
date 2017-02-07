package counting.view;

import counting.controller.CountingController;
import javax.swing.JPanel;
import javax.swing.*;
import java.awt.event.*;
import java.awt.Color;


public class CountingPanel extends JPanel 
{
	private CountingController baseController;
	private SpringLayout baseLayout;
	private JTextArea textArea;
	private JTextField textField;
	private JButton fibButton;
	private JButton factButton;
	
	
	public CountingPanel(CountingController baseController)
	{
		super();
		this.baseController = baseController;
		baseLayout = new SpringLayout();
		textArea = new JTextArea(5, 15);
		baseLayout.putConstraint(SpringLayout.NORTH, textArea, 10, SpringLayout.NORTH, this);
		baseLayout.putConstraint(SpringLayout.WEST, textArea, 72, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, textArea, -166, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, textArea, -72, SpringLayout.EAST, this);
		textField = new JTextField(15);
		baseLayout.putConstraint(SpringLayout.NORTH, textField, 20, SpringLayout.SOUTH, textArea);
		baseLayout.putConstraint(SpringLayout.WEST, textField, 72, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.EAST, textField, -72, SpringLayout.EAST, this);
		fibButton = new JButton("Fibonacci");
		baseLayout.putConstraint(SpringLayout.WEST, fibButton, 10, SpringLayout.WEST, this);
		factButton = new JButton("Factorial");
		baseLayout.putConstraint(SpringLayout.NORTH, fibButton, 0, SpringLayout.NORTH, factButton);
		baseLayout.putConstraint(SpringLayout.SOUTH, factButton, -10, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, factButton, -10, SpringLayout.EAST, this);
		
		
		setupPanel();
		setupLayout();
		setupListeners();
	}
	
	
	private void setupPanel()
	{
		this.setLayout(baseLayout);
		this.setBackground(Color.RED);
		this.add(textArea);
		this.add(textField);
		this.add(fibButton);
		this.add(factButton);
		
		}
	private void setupLayout()
	{
	}
	private void setupListeners()
	{
		factButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				textArea.setText(baseController.trasferFactorial(textField.getText()));
			}
		});
		fibButton.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent click)
			{
				textArea.setText(baseController.trasferFibonacci(textField.getText()));
			}
		});
	}

}
