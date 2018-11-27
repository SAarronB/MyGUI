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
	
	public MyGuiPanel(GuiController appController) {
		super();
		this.appController = appController;
		colorButton = new JButton("Extend by 10ft");
		textLabel = new JLabel("MMMWHAT??");
		setupPanel();
		setupLayout();
		setupListener();
	}

	private void setupPanel(){
		// TODO Auto-generated method stub
		this.setBackground(Color.DARK_GRAY);
		this.add(textLabel);
		this.add(colorButton);
	}
	
	private void setupLayout()
	{
		// TODO Auto-generated method stub
		
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
		textLabel.setText("Marco's LiPs");
	}
}
