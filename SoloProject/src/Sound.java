/*Chase by Alexander Nakarada | https://www.serpentsoundstudios.com	
Music promoted by https://www.chosic.com/free-music/all/
Attribution 4.0 International (CC BY 4.0)
https://creativecommons.org/licenses/by/4.0/


/*Superepic by Alexander Nakarada | https://www.serpentsoundstudios.com/
Music promoted by https://www.chosic.com/free-music/all/
Attribution 4.0 International (CC BY 4.0)
https://creativecommons.org/licenses/by/4.0/


Action Rock by MaxKoMusic | https://maxkomusic.com/
Music promoted by https://www.chosic.com/free-music/all/
Creative Commons Attribution-ShareAlike 3.0 Unported (CC BY-SA 3.0)
https://creativecommons.org/licenses/by-sa/3.0/
*/



import java.applet.AudioClip;	
import java.net.URL;
public class Sound {

	URL url;
	static Idk sp;
	static AudioClip menu, level1, level2, level3, victory;
	
	
	public Sound(Idk sp) {
		
		try {
			url = sp.getDocumentBase();
		}catch(Exception e) {
			
		}
		menu = sp.getAudioClip(url, "music/menu.au");
		level1 = sp.getAudioClip(url, "music/lvl1.au");
		level2 = sp.getAudioClip(url, "music/lvl2.au");
		level3 = sp.getAudioClip(url, "music/lvl3.au");
		victory = sp.getAudioClip(url, "music/victory.au");
		
	}
}