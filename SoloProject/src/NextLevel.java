import java.awt.*;
public class NextLevel {

		

		public Rectangle nextButton = new Rectangle(Idk.WIDTH/2 + 1800, 30, 110, 50); 
	 

	    public void render(Graphics pen) {
	        Graphics2D g2d = (Graphics2D) pen;

	        Font fnt0 = new Font("arial", Font.BOLD, 50);
	        pen.setFont(fnt0);
	        pen.setColor(Color.BLUE);
	       // pen.drawString("TYPER", Idk.WIDTH/2 + 930, 100);
	   
	        
	        
	        Font fnt1 = new Font("arial", Font.BOLD, 30);
	        pen.setFont(fnt1);
	        pen.drawString("NEXT", nextButton.x + 19, nextButton.y + 30);
	        g2d.draw(nextButton);
	       
	        
	       
	       
	    }
	    
}
