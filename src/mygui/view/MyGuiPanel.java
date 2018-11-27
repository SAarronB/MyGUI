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
		colorButton = new JButton("!!P0WER BUTT0N!!");
		textLabel = new JLabel("PR3SS DA BUTT0N");
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
			public void actionPerformed(ActionEvent mouseClick) {}
		});
	}
}
