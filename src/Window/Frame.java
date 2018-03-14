package Window;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class Frame extends JFrame{

	private static final long serialVersionUID = 7948907640887971463L;
	private int screenWidth = Toolkit.getDefaultToolkit().getScreenSize().width;
	private int screenHeight = Toolkit.getDefaultToolkit().getScreenSize().height;
	
	private int windowWidth = screenWidth/2;
	private int windowHeight = screenHeight/2;
	
	public Frame(){
		this.setAlwaysOnTop(false);
		this.setBounds(screenWidth/2-windowWidth/2, screenHeight/2-windowHeight/2, windowWidth, windowHeight);
		this.setTitle("Frame");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	public void updateFrame(){
		this.setVisible(false);
		this.setVisible(true);
	}

}
