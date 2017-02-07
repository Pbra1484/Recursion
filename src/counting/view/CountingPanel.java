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
		
	}
	private void setupListeners()
	{
		
	}

}
