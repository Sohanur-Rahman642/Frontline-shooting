package shootingGame;
import javax.swing.*;
public class Main {

	public static void main(String[] args) {

		GameBoard gb=new GameBoard();
		
		
		JFrame window=new JFrame();
		window.add(gb);
		
		window.setSize(1500, 600);
		window.setLocation(10,15);
		window.setTitle("Frontline Shoot");
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		window.setVisible(true);

	}

}
