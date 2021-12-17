import java.awt.*;

public class NextLevel2 {

	

	public Rectangle nextButton2 = new Rectangle(Idk.WIDTH/2 + 1800, 100, 110, 50); 
 

    public void render(Graphics pen) {
        Graphics2D g2d = (Graphics2D) pen;

        Font fnt0 = new Font("arial", Font.BOLD, 50);
        pen.setFont(fnt0);
        pen.setColor(Color.RED);
       // pen.drawString("TYPER", Idk.WIDTH/2 + 930, 100);
   
        

        Font fnt1 = new Font("arial", Font.BOLD, 30);
        pen.setFont(fnt1);
        pen.drawString("NEXT", nextButton2.x + 19, nextButton2.y + 30);
        g2d.draw(nextButton2);
       
        
       
       
    }
}
