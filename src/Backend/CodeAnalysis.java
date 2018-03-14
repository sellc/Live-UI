package Backend;

import java.awt.Color;
import java.util.Scanner;

import Window.Frame;
import Window.Panel;
import Window.TextArea;

public class CodeAnalysis {
	
	private Panel codePanel;
	private TextArea codeArea;
	
	public CodeAnalysis(Panel codePanel, TextArea codeArea){
		this.codePanel = codePanel;
		this.codeArea = codeArea;
		drawUI();
	}
	
	public void drawUI(){
		codePanel.removeAll();
		interpretCode(codeArea.getText());
		codePanel.updatePanel();
	}
	
	public void interpretCode(String code){
		Scanner input = new Scanner(code);
		while(input.hasNext()){
			switch(input.next()){
			case "frame":
				//addFrame();
				break;
			case "panel":
				addPanel();
				break;
			case "label":
				System.out.println("label");
				break;
			}
		}
		input.close();
	}
	public Frame addFrame(){
		Frame frame = new Frame();
		codePanel.add(frame);
		return frame;
	}
	public Panel addPanel(){
		Panel panel = new Panel();
		panel.setBackground(Color.red);
		//panel.setSize(50, 50);
		codePanel.add(panel);
		return panel;
	}
		
}
