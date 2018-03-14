package Window;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import Backend.CodeAnalysis;

public class LiveUIMain {

	public static void main(String[] args) {
		Frame mainFrame = new Frame();
		Panel mainPanel = new Panel();
		Panel UIPanel = new Panel();
		TextArea codeArea = new TextArea();
		CodeAnalysis ca = new CodeAnalysis(UIPanel, codeArea);
		
		mainFrame.add(mainPanel);
		mainPanel.add(codeArea);
		mainPanel.add(UIPanel);
		
		mainFrame.updateFrame();
		
		codeArea.addKeyListener(new KeyListener(){

			public void keyTyped(KeyEvent e) {
				ca.drawUI();
			}

			public void keyPressed(KeyEvent e) {
				
			}

			public void keyReleased(KeyEvent e) {
				
			}
			
		});
	}

}
