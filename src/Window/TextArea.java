package Window;
import java.awt.Color;

import javax.swing.JTextArea;

public class TextArea extends JTextArea{
	
	private static final long serialVersionUID = -7870292317116542912L;

	public TextArea(){
		this.setBackground(Color.black);
		this.setForeground(Color.white);
		this.setRows(10);
		this.setColumns(10);
	}
	
}
