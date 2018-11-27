package mygui.view;

import mygui.controller.GuiController;
import javax.swing.*;

//+--------------Needs to Extend JPanel-----------+
public class MyGuiPanel extends JPanel{
	private GuiController appController;
	
	public MyGuiPanel(GuiController appController) {
		super();
		this.appController = appController;
		setupPanel();
		setupLayout();
		setupListener();
	}

	private void setupListener()
	{
		// TODO Auto-generated method stub
		
	}

	private void setupLayout()
	{
		// TODO Auto-generated method stub
		
	}

	private void setupPanel()
	{
		// TODO Auto-generated method stub
		
	}
}
