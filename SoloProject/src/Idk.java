import java.awt.*;
import java.awt.event.*;
import java.time.LocalTime;
import java.applet.Applet;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Idk extends GameFoundation 
{
	
	
	
	
	String easyLevelwords = "I went to the park and saw a tree, it was a big tree and it was very green.";
	String mediumLevel = "Hacking is just a magic trick";
	String mediumLevel2 = "Now you will struggle the farther you go";
	String hardLevel = "Practice, Practice, Practice";
	String hardLevel2 = "But this was too much. The wolf danced about with rage and swore";
	String hardLevel3 = "But while he was climbing on to the roof the little pig made up a blazing";

	
	
	TextField textez1,
	          textez2;
	
	TextField text1, text2, 
			  text3, text4;
	
	TextField texthard1, texthard2,texthard3,
			  texthard4, texthard5, texthard6;
	
	// Mouse Location
	int mx = 0;
	int my = 0;
	
	boolean locked = false;
	
	
	private Menu menu;
	private Tips tips;
	private NextLevel nextLevel;
	private NextLevel2 nextLevel2;
	
	private Gameover overoptions;
	
		
	Rect[] platform = new Rect[3];
	
	
	Stickman stickman = new Stickman(50, 820, 20, 100);
	Stickman stickman2 = new Stickman(50, 820, 20, 100);
	
	Tank tank = new Tank(1000, 600, 0);
	Tank tank2 = new Tank(900, 600, 0);
	
	Line line1 = new Line(0, 0, 0, 1080);
	Line line2 = new Line(0, 900, 1920, 900);
	Line line3 = new Line(1920,0,0,0);
	Line line4 = new Line(1920,1080,1920,0);
	

	
	Background background = new Background("black.jpg");
	Background fighting = new Background("MainMenu.jpg");
	Background backbutton = new Background("backbutton.jpg");
	Background gameover = new Background("gameover.png");
	Victory victory = new Victory("test.jpg");
	
	public static enum STATE
	{
		MENU,
		GAME,
		TIPS,
		EZLEVEL,
		HARDLEVEL,
		GAMEOVER,
		TRYAGAIN,
		VICTORY,
		QUIT
	};
	
	public static STATE State = STATE.MENU;
	
	
	
	public void initialize() 
	{
		 
		menu = new Menu();
		
		nextLevel = new NextLevel();
		
		nextLevel2 = new NextLevel2();
		
		textez1 =  new TextField(25);
		textez2 = new TextField(25);
		add(textez1);
		add(textez2);
		textez1.setText("");
		textez2.setText("");
	
		
		text1 = new TextField(25);
		text2 = new TextField(25);
		text3 = new TextField();
		text4 = new TextField();
		add(text1);
		add(text2);
		add(text3);
		add(text4);
		text1.setText("");
		text2.setText("");
		text3.setText("");
		text4.setText("");
		
		texthard1 = new TextField(25);
		texthard2 = new TextField(25);
		texthard3 = new TextField(25);
		texthard4 = new TextField();
		texthard5 = new TextField();
		texthard6 = new TextField();
		add(texthard1);
		add(texthard2);
		add(texthard3);
		add(texthard4);
		add(texthard5);
		add(texthard6);
		texthard1.setText("");
		texthard2.setText("");
		texthard3.setText("");
		texthard4.setText("");
		texthard5.setText("");
		texthard6.setText("");

				
		tips = new Tips();
		
		
		new Sound(this);
		
		
			
		overoptions = new Gameover();


	}
	

				

	

		public void inGameLoop() 
		{
			
			
		
			if(stickman.overlapsRt(line4)) {
				stickman.x = -300;
				stickman.y = -300;
				State = STATE.GAMEOVER;
			}
			if(stickman2.overlapsRt(line4)) {
				stickman2.x = -300;
				stickman2.y = -300;
				State = STATE.GAMEOVER;
			}
			if(tank.overlaps(line4)) { 
				tank.x = -100;
				tank.y = -100;
					
			}
			if(tank2.overlaps(line4)) {
				tank2.x = -200;
				tank2.y = -200;
			}
	
			
		}
		
	

	public void paint (Graphics pen)
	{
		Font fnt0 = new Font("arial", Font.BOLD, 40);
        pen.setFont(fnt0);
        pen.setColor(Color.GREEN);
        
        
        //double start = LocalTime.now().toNanoOfDay();
	
		//System.out.println(typedWords);
	
	//double end = LocalTime.now().toNanoOfDay();
		
	//double elapsedTime  = end - start;
		// (x characters / 5) / 1min = y wpm formula for calculating typing speed
		//double seconds  = elapsedTime/ 1000000000.0;
		//int numChars = typedWords.length();
		//int wpm = (int) ((((double) numChars / 5) / seconds) * 60);
		//System.out.println("Your wpm is " + wpm + "!");
//        text2.setText(f);
//        String s1 ,s2;
//        s2 = text2.getText();
//        
//        
//        s1 = text1.getText();
//        
//        
//        pen.drawString(s1, 500, 600);
//        pen.drawString(s2, 500, 500);
//        
//        if(s1.contentEquals(s2)) pen.drawString("Winner", 300, 300);
        
        if(State == STATE.EZLEVEL){
        	Sound.menu.stop();
			background.draw(pen);
			textez1.setLocation(100, 420);
			textez2.setLocation(-900, -400);
			textez2.setText(easyLevelwords);
			String ez1,ez2;
			ez1 = textez1.getText();
			ez2 = textez2.getText();
			if(ez1.startsWith("I")) {
				stickman2.draw(pen);
				stickman2.moveRight(1);
			}
			
			pen.drawString(ez1, 350, 450);
			pen.drawString(ez2, 350, 300);
			
			if(ez1.contentEquals(ez2)) {
				
				tank.draw(pen);
				tank.moveForward(7);
				pen.setColor(Color.GREEN);
				pen.drawString("PSS, THIS WAS AS EZ AS HACKING INTO A PUBLIC WIFI", 100, 100);
				stickman2.stopMoving(0);
				nextLevel.render(pen);
			}
		
	}
        
		
        else if(State == STATE.GAME) 
        {
        	Sound.level1.stop();
        	
			background.draw(pen);
			
			textez1.setLocation(-50, -50);
			
			text1.setLocation(100, 460 );
			text2.setLocation(100, 480);
			text3.setLocation(-100, -100);
			text4.setLocation(-200, -200);
			text3.setText(mediumLevel);
			text4.setText(mediumLevel2);
			
			String s1 ,s2, s3, s4;
			
		    s2 = text2.getText();
		    s3  = text3.getText();
		        
		    s1 = text1.getText();
		    s4 = text4.getText();
		    
		    if(s1.startsWith(mediumLevel.substring(0, 1))) {
		    	stickman.draw(pen);
	        	stickman.moveRight(3);
		    }
		        
		     
		    pen.drawString(s1, 350, 500);
		    pen.drawString(s2, 350, 550);
		    pen.drawString(s3, 350, 300);
		    pen.drawString(s4, 350, 350);
		        
		    if(s1.contentEquals(s3) && s2.contentEquals(s4)) {
		    	
		    	nextLevel2.render(pen);
		    	Font fnt1 = new Font("arial", Font.BOLD, 40);
		        pen.setFont(fnt1);
		        pen.setColor(Color.RED);
		    	pen.drawString("Only way you pass the next level is if you hack it", 150, 150);
		    	stickman.stopMoving(0);
		    	tank2.draw2(pen);
		    	tank2.moveForward(7);
		  	
		      }
		
		
		    pen.setColor(Color.BLACK);
		    line2.draw(pen);
		    line1.draw(pen);
		    line3.draw(pen);
		    line4.draw(pen);
		
		}	
		
        else if(State == STATE.HARDLEVEL){
        Sound.level2.stop();
		background.draw(pen);
		
		text1.setLocation(-75, -75 );
		text2.setLocation(-75, -75);
		texthard1.setLocation(100, 500 );
		texthard2.setLocation(100, 520);
		texthard3.setLocation(100, 540);
		texthard4.setLocation(-100, -100);
		texthard5.setLocation(-200, -200);
		texthard6.setLocation(-300, -300);
		
		texthard4.setText(hardLevel);
		texthard5.setText(hardLevel2);
		texthard6.setText(hardLevel3);
		
		String hard1 ,hard2, hard3, hard4, hard5, hard6;
		hard1 = texthard1.getText();
	    hard2 = texthard2.getText();
	    hard3 = texthard3.getText();
	        
	    hard4 = texthard4.getText();
	    hard5 = texthard5.getText();
	    hard6 = texthard6.getText();
	    
	    if(hard1.startsWith(hardLevel.substring(0, 1))) {
	    	stickman.draw(pen);
        	stickman.moveRight(3);
	    }
	    
	    pen.drawString(hard1, 350, 450);
	    pen.drawString(hard2, 350, 500);
	    pen.drawString(hard3, 350, 550);
	    pen.drawString(hard4, 350, 150);
	    pen.drawString(hard5, 350, 200);
	    pen.drawString(hard6, 350, 250);
	    
	    if(hard1.contentEquals(hard4) && hard2.contentEquals(hard5) && hard3.contentEquals(hard6)) {
	    	Idk.State = Idk.STATE.VICTORY;
	    	Sound.victory.play();
	    	
	      }
	    
		
	
	}else if(State == STATE.MENU){
			fighting.draw(pen);
				menu.render(pen);
		}
	
	else if(State == STATE.TRYAGAIN){
				background.draw(pen);
				textez1.setLocation(100, 420);
				textez2.setLocation(-900, -400);
				textez2.setText(easyLevelwords);
				String ez1,ez2;
				ez1 = textez1.getText();
				ez2 = textez2.getText();
				if(ez1.startsWith("I")) {
					stickman2.draw(pen);
					stickman2.moveRight(1);
				}
				
				pen.drawString(ez1, 350, 450);
				pen.drawString(ez2, 350, 300);
				
				if(ez1.contentEquals(ez2)) {
					
					tank.draw(pen);
					tank.moveForward(7);
					pen.setColor(Color.GREEN);
					pen.drawString("PSS, THIS WAS AS EZ AS HACKING INTO A PUBLIC WIFI", 100, 100);
					stickman2.stopMoving(0);
					State = STATE.GAME;
					
				}
			
		}else if(State == STATE.GAMEOVER){
			text1.setLocation(-600, -600);
			text2.setLocation(-700, -700);
			gameover.draw(pen);
			overoptions.render(pen);
			
		
		}else if(State == STATE.TIPS){
			text1.setLocation(-900, -900);
			text2.setLocation(-1000, -1000);
			text3.setLocation(-900, -900);
			text4.setLocation(-1000, -1000);
			background.draw(pen);
			tips.render(pen);
			
		
		}else if(State == STATE.VICTORY) {
			Sound.level3.stop();
			texthard1.setLocation(-4000, -1000 );
			texthard2.setLocation(-2000, -2000);
			texthard3.setLocation(-3000, -900);
			background.draw(pen);
			victory.rendery(pen);
			victory.drawgHacker(pen);
			
		}
		else if(State == STATE.QUIT) {
			System.exit(0);
		}
	}

	public void mouseMoved(MouseEvent e)
	{
		 mx = e.getX();
		 my = e.getY();		
	}
	
	public void mouseDragged(MouseEvent e)
	{
		
	}
	
	public void mousePressed(MouseEvent e)
	{
		 mx = e.getX();
		 my = e.getY();
		 
//		 public Rectangle playButton = new Rectangle(MainGame.WIDTH/2 + 900, 150, 100, 50); 
//		    public Rectangle helpButton = new Rectangle(MainGame.WIDTH/2 + 900, 250, 100, 50); 
//		    public Rectangle quitButton = new Rectangle(MainGame.WIDTH/2 + 900, 350, 100, 50); 
//		 public Rectangle backButton = new Rectangle(10, 900, 50,50);
		 
//		 public Rectangle tryAgain = new Rectangle(Idk.WIDTH/2 + 900, 70, 150, 50); 
//		    public Rectangle home = new Rectangle(Idk.WIDTH/2 + 900, 130, 150, 50); 
//		    public Rectangle quitButton = new Rectangle(Idk.WIDTH/2 + 900, 190, 100, 50);
		
		if(mx >= Idk.WIDTH/2 + 1500 && mx <= Idk.WIDTH/2 + 1620) {
			if(my >= 700 && my <= 750) {
				Idk.State = Idk.STATE.EZLEVEL;
				Sound.level1.play();
				//Sound.music.play();
			}
		}
		
		if(mx >= Idk.WIDTH/2 + 1500 && mx <= Idk.WIDTH/2 + 1620) {
			if(my >= 800 && my <= 850) {
				Idk.State = Idk.STATE.TIPS;
				//Sound.music.play();
			}
		}
		
		
		if(mx >= Idk.WIDTH/2 + 1500 && mx <= Idk.WIDTH/2 + 1620) {
			if(my >= 900 && my <= 950) {
				Idk.State = Idk.STATE.QUIT;
			}
		}
		
		if(mx >= Idk.WIDTH/2 + 900 && mx <= Idk.WIDTH/2 + 1020) {
			if(my >= 130 && my <= 180) {
				Idk.State = Idk.STATE.MENU;
				//Sound.music.play();
			}
		}
		
		if(mx >= Idk.WIDTH/2 + 900 && mx <= Idk.WIDTH/2 + 1020) {
			if(my >= 70 && my <= 120) {
				Idk.State = Idk.STATE.TRYAGAIN;
				//Sound.music.play();
			}
		}
		
		if(mx >= Idk.WIDTH/2 + 900 && mx <= Idk.WIDTH/2 + 1020) {
			if(my >= 190 && my <= 240) {
				Idk.State = Idk.STATE.QUIT;
				//Sound.music.play();
			}
		}
		
		if(mx >= Idk.WIDTH/2 + 50 && mx <= Idk.WIDTH/2 + 170) {
			if(my >= 900 && my <= 950) {
				Idk.State = Idk.STATE.MENU;
				Sound.menu.play();
				//Sound.music.play();
			}
		}
		
		//public Rectangle nextButton = new Rectangle(Idk.WIDTH/2 + 1800, 30, 110, 50); 
		if(mx >= Idk.WIDTH/2 + 1800 && mx <= Idk.WIDTH/2 + 1920) {
			if(my >= 30 && my <= 80) {
				Idk.State = Idk.STATE.GAME;
				Sound.level2.play();
				//Sound.music.play();
			}
		}
		
		if(mx >= Idk.WIDTH/2 + 1800 && mx <= Idk.WIDTH/2 + 1920) {
			if(my >= 100 && my <= 150) {
				Idk.State = Idk.STATE.HARDLEVEL;
				Sound.level3.play();
				//Sound.music.play();
			}
		}
		
	}
	
	
	
	public void keyPressed(KeyEvent e)
	{
		pressing[e.getKeyCode()] = true;	
		
		
	}
	
	public void keyReleased(KeyEvent e)
	{
		pressing[e.getKeyCode()] = false;		
	}
	
	public void keyTyped(KeyEvent e)
	{
		
	}
		

}