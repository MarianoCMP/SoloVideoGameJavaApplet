import java.awt.*;

public class Victory {
	Image image;
	 
	
	 public Victory(String filename) {
		 image = Toolkit.getDefaultToolkit().getImage(filename);
	 }
	 
		public void drawgHacker(Graphics pen)
		{
			pen.drawImage(image, 1100, 10 , null);
		}
		public void drawHacker(Graphics pen)
		{
			pen.drawImage(image, 960, 150, null);
		}
	
	 public void rendery(Graphics pen) {
	        Graphics2D g2d = (Graphics2D) pen;

	        pen.setColor(Color.RED);
	        

	        Font fnt1 = new Font("arial", Font.BOLD, 50);
	        pen.setFont(fnt1);
	        pen.drawString("Victory", 400, 200);
	        pen.drawString("You whitehat hackers really test my patience!!", 0, 400);
	        pen.drawString("You may have won, but the war is not over", 0, 475);
	        pen.drawString("MORE LEVELS COMING SOON", 0, 800);
	        
	        
	        Font fnt0 = new Font("arial", Font.BOLD, 40);
	        pen.setFont(fnt0);
	    
	    }
	

	
	
}