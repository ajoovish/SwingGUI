package edu.neu.csye6200.cacrystal;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.util.logging.Logger;

import javax.swing.JButton;
import javax.swing.JPanel;

import edu.neu.csye6200.ui.CAApp;
import edu.neu.csye6200.ui.CACanvas;
public class CrystalApp extends CAApp{
	private static Logger log = Logger.getLogger(CrystalApp.class.getName());

	protected JPanel northPanel = null;
	protected JButton startBtn = null;
	protected JButton stopBtn = null;
	protected JButton pauseBtn=null;
	protected CAPanel caDisplay;

	public CrystalApp()
	{
		frame.setSize(500, 400);
		frame.setTitle("WolfApp");
		
    	caDisplay = new CAPanel();
    	frame.add(caDisplay , BorderLayout.CENTER); // Add to the center of our frame
		frame.setVisible(true); // The UI is built, so display it
	}
	@Override
	public JPanel getNorthPanel() {
		northPanel = new JPanel();
		northPanel.setLayout(new FlowLayout());

		startBtn = new JButton("Start");
		startBtn.addActionListener(this); // Allow the app to hear about button pushes
		northPanel.add(startBtn);

		pauseBtn = new JButton("Pause");
		pauseBtn.addActionListener(this); // Allow the app to hear about button pushes
		northPanel.add(pauseBtn);

		stopBtn = new JButton("Stop"); // Allow the app to hear about button pushes
		stopBtn.addActionListener(this);
		northPanel.add(stopBtn);

		return northPanel;	

	}
	@Override
	public void actionPerformed(ActionEvent actionE) {
		System.out.println("actionPerformed Executed ");

		if(actionE.getSource()== startBtn)
		{
			System.out.println("Start Button Pressed");
		}
		else if(actionE.getSource()== pauseBtn)
		{
			System.out.println("Pause Button Pressed");
		}
		else if(actionE.getSource()==stopBtn)
		{
			System.out.println("Stop Button Pressed");
		}
		System.out.println("Action has been Sent to observer class");
	}

	@Override
	public void windowOpened(WindowEvent e) {
		log.info("Window Opened");

	}

	@Override
	public void windowClosing(WindowEvent e) {
		log.info("Window Closed");

	}

	@Override
	public void windowClosed(WindowEvent e) {
		log.info("Window Closed, Porgram terminated");

	}

	@Override
	public void windowIconified(WindowEvent e) {

	}

	@Override
	public void windowDeiconified(WindowEvent e) {

	}

	@Override
	public void windowActivated(WindowEvent e) {

	}

	@Override
	public void windowDeactivated(WindowEvent e) {

	}


}	