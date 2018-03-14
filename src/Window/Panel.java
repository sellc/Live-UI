package Window;
import java.awt.Color;

import javax.swing.JPanel;

public class Panel extends JPanel{
	
	
	private static final long serialVersionUID = 3730593986064664265L;

	public Panel(){
		this.setSize(50, 50);
		this.setBackground(Color.gray);
		this.setVisible(true);
	}
	
	public void updatePanel(){
		this.setVisible(false);
		this.setVisible(true);
	}
}
