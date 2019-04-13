package shootingGame;
import java.awt.Graphics;



import javax.swing.*;
public class Fires2 extends Shooter{
	
	public Fires2(int x, int y, String imagePath) {
		super(x, y, imagePath);
		// TODO Auto-generated constructor stub
	}

	
	public void draw(Graphics g){
		ImageIcon fires2=new ImageIcon(getImagePath());
		g.drawImage(fires2.getImage(), getX(), getY(), null);
	}
}
