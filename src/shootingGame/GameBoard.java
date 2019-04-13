package shootingGame;

import javax.swing.*;

import java.awt.Graphics;
import java.awt.event.*;

public class GameBoard extends JPanel implements MouseMotionListener,KeyListener{
	Shooter shooter;
	Shooter2 shooter2;
	Target target;
	Counter score;
	Villains[] villains =new Villains[15];
	Bullets[] bullets=new Bullets[15];
	Fires fires;
	Fires2 fires2;
	int bulletCount=0;
	
	public GameBoard(){
		shooter=new Shooter(600,370,"Images//shooter.png");
		shooter2=new Shooter2(-600,-370,"Images//shooter2.png");
		target=new Target(560,300,"Images//target.png");
		score=new Counter(50,20,"Images//Score.png");
		fires=new Fires(-100,-100,"Images//Fires.png");
		fires2=new Fires2(-100,-100,"Images//Fires.png");
		int xVillain=200,yVillain=300;
		
		super.addMouseMotionListener(this);
		
		for(int i=0;i<villains.length;i++){
			villains[i]=new Villains(xVillain+50*i,yVillain,"Images//villains.png",true);
			
			bullets[i]=new Bullets(-100,-100,"Images//bullets.png");
			
		
		}
		
		
		super.addKeyListener(this);
		super.setFocusable(true);
	}
	
	public void paint(Graphics g){
		ImageIcon background=new ImageIcon("Images//background.png");
		g.drawImage(background.getImage(),0,0, null);
		shooter.draw(g);
		shooter2.draw(g);
		for(int i=0;i<villains.length;i++){
			if(villains[i].isAlive()==true)
				villains[i].draw(g);
			bullets[i].draw(g);
		}
		
		target.draw(g);
		//score.draw(g);
		fires.draw(g);
		fires2.draw(g);
		g.drawString("SCORE", 50, 15);
		
	}

	@Override
	public void mouseDragged(MouseEvent e) {
			
		}
	
	


	@Override
	public void mouseMoved(MouseEvent e) {
		
		target.setX(e.getX());
		target.setY(e.getY());
		
		super.repaint();
	}	
		
		
	
	
	/*public void mousePressed(MouseEvent e){
		if(e.getButton()==MouseEvent.BUTTON1){
			bullets[bulletCount].setX(target.getX()+26); 	
			bullets[bulletCount].setY(target.getY()+20);
			fires.setX(shooter.getX());
			fires.setY(shooter.getY()+15);
			fires2.setX(shooter2.getX()+160);
			fires2.setY(shooter2.getY()-5);
			BulletFiring bulletFire = new BulletFiring(this,villains,bullets[bulletCount], shooter,target);
			bulletFire.start();
			
			
			bulletCount++;
			
		
		
			
			if(bulletCount == 13)
				bulletCount = 0;
		}
		super.repaint();
	
	}
	public void mouseReleased(MouseEvent e){
		if(e.getButton()==MouseEvent.BUTTON1){
			fires.setX(-200);	
			fires2.setX(-200);
		}
	}
*/
	@Override
	
	public void keyPressed(KeyEvent e) {
		
		if(e.getKeyCode() == e.VK_LEFT)
		{
		
			
			
			
			if(shooter.getX()>350)
				
				
				shooter.setX(shooter.getX()-6);
				shooter2=new Shooter2(-600,-370,"Images//shooter2.png");
				
				shooter=new Shooter(600,370,"Images//shooter.png");
				
			
			
			
		}
		else if(e.getKeyCode() == e.VK_RIGHT)
			{
			
			if(shooter2.getX()<800)
				
				shooter=new Shooter(-600,-370,"Images//shooter.png");
				shooter2=new Shooter2(600,370,"Images//shooter2.png");	
			}	
			
			else if(e.getKeyCode() == e.VK_S){
			
				bullets[bulletCount].setX(target.getX()+10); 	
				bullets[bulletCount].setY(target.getY()+10);
				fires.setX(shooter.getX());
				fires.setY(shooter.getY()+15);
				fires2.setX(shooter2.getX()+160);
				fires2.setY(shooter2.getY()-5);
				BulletFiring bulletFire = new BulletFiring(this,villains,bullets[bulletCount], shooter,target);
				bulletFire.start();
			
			
				bulletCount++;
			
		
		
			
				if(bulletCount == 13)
					bulletCount = 0;
		}
		
		super.repaint();
	}


	@Override
	public void keyReleased(KeyEvent e) {
		if(e.getKeyCode() == e.VK_S){
			
		fires.setX(-200);	
		fires2.setX(-200);
		
		}
		
	}


	@Override
	public void keyTyped(KeyEvent e) {
		
		
	}
}

