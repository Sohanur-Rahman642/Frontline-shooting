package shootingGame;
import java.awt.Graphics;
import java.awt.Rectangle;

public class BulletFiring extends Thread{
	private GameBoard gameboard;
	private Villains[] villains;
	private Bullets bullets;
	private Shooter shooter;
	private Target target;
	public BulletFiring(GameBoard gameboard, Villains[] villains, Bullets bullets,Shooter shooter,Target target) {
		
		this.gameboard = gameboard;
		this.villains = villains;
		this.bullets = bullets;
		this.shooter=shooter;
		this.target=target;
	}
	
	public void run(){
		
		while(bullets.getX() > 0){
			
			
			checkCollision();
			
			try {
				Thread.sleep(10);
			} 
			catch (Exception e) {
				
			
			}
			
			
			gameboard.repaint();
		}
		
	
		
		
	}
	
	
	
	
	
	
	public void checkCollision(){
		
		
		Rectangle bulletRect = new Rectangle(bullets.getX(),bullets.getY(),49,78);
		
		for(int i = 0; i < villains.length; i++){
			
			Rectangle villainsRect = new Rectangle(villains[i].getX(),villains[i].getY(),36,100);
			
				if(bulletRect.intersects(villainsRect)==true)
				{
				villains[i].setAlive(false);
				
				bullets.setY(-600);
				GameSound.bulletHitSound();
				
				
			}
			
			}
		}
}
