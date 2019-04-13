package shootingGame;
import java.awt.Graphics;

import javax.swing.*;

public class Villains extends Shooter {
	private boolean isAlive;
	
	public Villains(int x, int y, String imagePath, boolean isAlive) {
		super(x, y, imagePath);
		this.isAlive=isAlive;
		// TODO Auto-generated constructor stub
	}

	public boolean isAlive() {
		return isAlive;
	}
	public void setAlive(boolean isAlive) {
		this.isAlive = isAlive;
	}
	public void draw(Graphics g){
		ImageIcon villains=new ImageIcon(getImagePath());
		g.drawImage(villains.getImage(), getX(), getY(), null);
	}
}
