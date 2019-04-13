package shootingGame;
import java.awt.Graphics;

import javax.swing.*;

public class Shooter2 extends Shooter{
	public Shooter2(int x, int y, String imagePath) {
		super(x, y, imagePath);
		// TODO Auto-generated constructor stub
	}

	public void draw(Graphics g){
		ImageIcon shooter2=new ImageIcon(getImagePath());
		g.drawImage(shooter2.getImage(), getX(), getY(), null);
	}
	
}
