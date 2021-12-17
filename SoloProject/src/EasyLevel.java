import java.awt.TextField;
import java.awt.*;
import java.awt.event.*;

import javax.swing.JPanel;



public class EasyLevel extends JPanel{
	
	Tank tank = new Tank(5, 600, 0);
	
	String words = "I went to the park and saw a tree, it was a big tree and it was very green.";
	
	
	
	
	
	
	
	public void easyLevel(Graphics pen) {
		
		
		TextField textez =  new TextField(25);
		TextField textez1 = new TextField(25);
		add(textez);
		add(textez1);
		textez.setText("");
		textez1.setText("");
		textez.setLocation(100, 420);
		textez1.setLocation(-900, -400);
		textez1.setText(words);
		
		String ez,ez1;
		ez = textez.getText();
		ez1 = textez1.getText();
		
		pen.drawString(ez, 350, 450);
		pen.drawString(ez1, 350, 300);
		
		if(ez.contentEquals(ez1)) {
			tank.draw(pen);
			tank.moveForward(7);
			pen.drawString("PSS, THIS WAS AS EZ AS HACKING INTO A PUBLIC WIFI", 300, 300);
			
		}
	}






}
