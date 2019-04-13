package shootingGame;
import java.io.File;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class GameSound {
public static void bulletHitSound(){
		
		try{
			
			File sound = new File("Sounds//GUN_FIRE-GoodSoundForYou-820112263.wav");
			AudioInputStream ais =AudioSystem.getAudioInputStream(sound);
			Clip clip = AudioSystem.getClip();
			clip.open(ais);
			clip.start();
		}
		catch(Exception e){
			
			
		}
		
		
	}
}
