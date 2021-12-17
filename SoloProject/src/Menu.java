import java.awt.*;
import java.util.concurrent.TimeUnit;



public class Menu   {
	

	public Rectangle playButton = new Rectangle(Idk.WIDTH/2 + 1500, 700, 100, 50); 
    public Rectangle helpButton = new Rectangle(Idk.WIDTH/2 + 1500, 800, 100, 50); 
    public Rectangle quitButton = new Rectangle(Idk.WIDTH/2 + 1500, 900, 100, 50); 
    public Rectangle backButton = new Rectangle(10, 900, 50,50);

    public void render(Graphics pen) {
        Graphics2D g2d = (Graphics2D) pen;

        Font fnt0 = new Font("arial", Font.BOLD, 50);
        pen.setFont(fnt0);
        pen.setColor(Color.RED);
       // pen.drawString("TYPER", Idk.WIDTH/2 + 930, 100);
   
        
        


        Font fnt1 = new Font("arial", Font.BOLD, 30);
        pen.setFont(fnt1);
        pen.drawString("Play", playButton.x + 19, playButton.y + 30);
        g2d.draw(playButton);
        pen.drawString("Hack", helpButton.x + 19, helpButton.y + 30);
        g2d.draw(helpButton);
        pen.drawString("Quit", quitButton.x + 19, quitButton.y + 30);
        g2d.draw(quitButton);
        
       
       
    }
    
    public void backOption(Graphics pen) {
    	Graphics2D g2d = (Graphics2D) pen;
    	

        pen.drawString("<---", backButton.x + 19, backButton.y + 30);
        g2d.draw(backButton);
     }
    
    

}