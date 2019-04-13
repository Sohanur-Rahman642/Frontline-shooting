package shootingGame;
import java.awt.Graphics;

import javax.swing.*;

public class Target extends Shooter{
	public Target(int x, int y, String imagePath) {
		super(x, y, imagePath);
		// TODO Auto-generated constructor stub
	}

	public void draw(Graphics g){
		ImageIcon target=new ImageIcon(getImagePath());
		g.drawImage(target.getImage(), getX(), getY(), null);
	}
}
