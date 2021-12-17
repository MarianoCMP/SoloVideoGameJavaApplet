import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class Tips {

	public Rectangle backButton = new Rectangle(Idk.WIDTH/2 + 50, 900, 130, 50); 
	
	 public void render(Graphics pen) {
	        Graphics2D g2d = (Graphics2D) pen;

	        pen.setColor(Color.BLUE);
	        

	        Font fnt1 = new Font("arial", Font.BOLD, 50);
	        pen.setFont(fnt1);
	        pen.drawString("Tips", 0,40);
	        pen.drawString("How did you get in here, darn it why did I make my password 1234", 0, 120);
	        pen.drawString("Well now that you are here, might as well give you some tips too", 0, 200);
	        pen.drawString("Kali Linux says: ", 100, 400);
	        pen.drawString("- Practice practice, well your terrible typing in this case ", 0, 500);
	        pen.drawString("- Use that tab button on your keyboard ", 0, 600);
	        pen.drawString("- You dont want to waste time lifting your mouse to write input ", 0, 700);
	        pen.drawString("- Happy Hacking, or else i will DDOS 192.168.1.1 ", 700, 900);
	        
	        
	        Font fnt0 = new Font("arial", Font.BOLD, 40);
	        pen.setFont(fnt0);
	        pen.drawString("Back", backButton.x + 19, backButton.y + 40);
	        g2d.draw(backButton);
	    }
	

	
	
}
