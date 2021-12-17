import java.awt.Color;
import java.awt.Graphics;
import java.time.LocalTime;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;


public class TypingGame {
	
	
	String [] wordList = {" about" ,"have", "grow","may","life","what", "and", "such", "question", "school",
			              "tree", "open", "made","answer","them","computer","science","electronic","number","above" };
	
//	
//	private String[] randomGenarator;
//	Random rng = new Random();
//	
//	public TypingGame(String [] randomGenerator) {
//		
//		this.randomGenarator = randomGenerator;
//		
//		for(int i = 0; i< 10; i++) {
//			
//			randomGenerator[rng.nextInt(9)];
//		}
//		
//		
//	}
//	
//	public void draw(Graphics pen)
//	{
//		
//	}
	
	
	public static void main (String [] args) throws InterruptedException {
		
	System.out.println("3");
	TimeUnit.SECONDS.sleep(1);
	System.out.println("2");
	TimeUnit.SECONDS.sleep(1);
	System.out.println("1");
	TimeUnit.SECONDS.sleep(1);
	
	//word generator 
//	about have grow may life what and such question school tree open made answer them 
//	for good mile end we began point number above carry it away would always men song come
//	look left without once year has two one
	
	Random rng = new Random();
	
	for(int i = 0; i< 10; i++) {
	//System.out.print(randomGenerator[rng.nextInt(9)] +  " ");
	
	
	}
	System.out.println();
	
	double start = LocalTime.now().toNanoOfDay();
	
	Scanner scan = new Scanner(System.in);
	String typedWords = scan.nextLine();
	
	System.out.println(typedWords);
	
	double end = LocalTime.now().toNanoOfDay();
	
	double elapsedTime  = end - start;
	// (x characters / 5) / 1min = y wpm formula for calculating typing speed
	double seconds  = elapsedTime/ 1000000000.0;
	int numChars = typedWords.length();
	int wpm = (int) ((((double) numChars / 5) / seconds) * 60);
	System.out.println("Your wpm is " + wpm + "!");
	
	}
	

}
	

