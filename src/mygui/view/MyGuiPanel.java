package mygui.view;

import mygui.controller.GuiController;
import java.awt.Color;
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

//+--------------Needs to Extend JPanel-----------+
public class MyGuiPanel extends JPanel{
	private GuiController appController;
	
	private JButton colorButton;
	private JLabel textLabel;
	private SpringLayout appLayout;
	
	public MyGuiPanel(GuiController appController) {
		super();
		this.appController = appController;
		colorButton = new JButton("*TAKES ARROW TO THE KNEE*");
		textLabel = new JLabel("I used to be an adventurer like you");
		appLayout = new SpringLayout();

		setupPanel();
		setupLayout();
		setupListener();
	}

	private void setupPanel(){
		// TODO Auto-generated method stub
		this.setLayout(appLayout);
		this.setBackground(Color.DARK_GRAY);
		this.add(textLabel);
		this.add(colorButton);
	}
	
	private void setupLayout()
	{		appLayout.putConstraint(SpringLayout.NORTH, colorButton, 6, SpringLayout.SOUTH, textLabel);
		appLayout.putConstraint(SpringLayout.WEST, colorButton, 10, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.SOUTH, colorButton, -582, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.EAST, colorButton, -913, SpringLayout.EAST, this);
		appLayout.putConstraint(SpringLayout.NORTH, textLabel, 23, SpringLayout.NORTH, this);
		appLayout.putConstraint(SpringLayout.SOUTH, textLabel, -630, SpringLayout.SOUTH, this);
		appLayout.putConstraint(SpringLayout.WEST, textLabel, 21, SpringLayout.WEST, this);
		appLayout.putConstraint(SpringLayout.EAST, textLabel, -929, SpringLayout.EAST, this);
	}
	
	private void setupListener()
	{
		// TODO Auto-generated method stub
		colorButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent mouseClick) {changeBackgroundColor();}
		});
	}
	
	private void changeBackgroundColor() {
		int red = (int) (Math.random()*256);
		int green = (int) (Math.random()*256);
		int blue = (int) (Math.random()*256);
		int alfa = (int) (Math.random()*256);
		this.setBackground(new Color(red,green,blue,alfa));
		textLabel.setText("");
	}
}
