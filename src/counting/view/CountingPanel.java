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
		textField = new JTextField(15);
		fibButton = new JButton("");
		factButton = new JButton("");
		
		
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
		baseLayout.putConstraint(SpringLayout.WEST, textArea, 135, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.WEST, textField, 130, SpringLayout.WEST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, textField, -178, SpringLayout.SOUTH, this);
		baseLayout.putConstraint(SpringLayout.EAST, textField, -130, SpringLayout.EAST, this);
		baseLayout.putConstraint(SpringLayout.SOUTH, textArea, -6, SpringLayout.NORTH, textField);
		baseLayout.putConstraint(SpringLayout.NORTH, fibButton, 6, SpringLayout.SOUTH, textField);
		baseLayout.putConstraint(SpringLayout.WEST, fibButton, 0, SpringLayout.WEST, textArea);
		baseLayout.putConstraint(SpringLayout.NORTH, factButton, 6, SpringLayout.SOUTH, textField);
		baseLayout.putConstraint(SpringLayout.EAST, factButton, 0, SpringLayout.EAST, textArea);
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
				
			}
		});
	}

}
