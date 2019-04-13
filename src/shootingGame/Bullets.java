package shootingGame;
import java.awt.Graphics;



import javax.swing.*;
public class Bullets extends Shooter{
	public Bullets(int x, int y, String imagePath) {
		super(x, y, imagePath);
		// TODO Auto-generated constructor stub
	}

	
	public void draw(Graphics g){
		ImageIcon bullets=new ImageIcon(getImagePath());
		g.drawImage(bullets.getImage(), getX(), getY(), null);
	}
}
