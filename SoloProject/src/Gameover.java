import java.awt.*;
import java.util.concurrent.TimeUnit;



public class Gameover   {
	

	public Rectangle tryAgain = new Rectangle(Idk.WIDTH/2 + 900, 70, 160, 50); 
    public Rectangle home = new Rectangle(Idk.WIDTH/2 + 900, 130, 160, 50); 
    public Rectangle quitButton = new Rectangle(Idk.WIDTH/2 + 900, 190, 160, 50); 
    

    public void render(Graphics pen) {
        Graphics2D g2d = (Graphics2D) pen;

        pen.setColor(Color.RED);
        

        Font fnt1 = new Font("arial", Font.BOLD, 30);
        pen.setFont(fnt1);
        pen.drawString("Try Again", tryAgain.x + 19, tryAgain.y + 30);
        g2d.draw(tryAgain);
        pen.drawString("127.0.0.1", home.x + 19, home.y + 30);
        g2d.draw(home);
        pen.drawString("Quitter", quitButton.x + 19, quitButton.y + 30);
        g2d.draw(quitButton);
        
       
       
    }
    
    
}