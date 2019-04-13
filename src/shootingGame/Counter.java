package shootingGame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class Counter extends Shooter {
	public Counter(int x, int y, String imagePath) {
		super(x, y, imagePath);
		// TODO Auto-generated constructor stub
	}

	
	public void draw(Graphics g){
		ImageIcon score=new ImageIcon(getImagePath());
		g.drawImage(score.getImage(), getX(), getY(), null);
	}
	
}