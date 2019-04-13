package shootingGame;
import java.awt.Graphics;



import javax.swing.*;
public class Fires extends Shooter {
	
	public Fires(int x, int y, String imagePath) {
		super(x, y, imagePath);
		// TODO Auto-generated constructor stub
	}

	
	public void draw(Graphics g){
		ImageIcon fires=new ImageIcon(getImagePath());
		g.drawImage(fires.getImage(), getX(), getY(), null);
	}
	
}
