package mygui.view;

import javax.swing.JFrame;
import mygui.controller.GuiController;

public class myGuiFrame extends JFrame{
	
	private GuiController appController;
	private myGuiFrame appPanel;

//+-------------------Needs Refrence to data member as an argument---------------+
	public myGuiFrame(GuiController appController) {
//+---------------super is an explicit call to the class-------------+
//+------------------Must be first line in constructor---------------+
		super();
		this.appController = appController;
		this.appPanel = new SamplePanel(appController);
		setupFrame();
	}
	
	private void setupFrame() {
		this.setContentPane(appPanel);
		this.setSize(1000, 500);
		this.setTitle("Bears, Beats, BattelStar Galactica");
		this.setResizable(false);
//+---------SETVISIBLE MUST BE THE LAST LINE IN A FRAME SETUP METHOD-----------+
		this.setVisible(true);
	}
}
