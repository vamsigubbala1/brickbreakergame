package demogame;

import java.awt.Color;

import javax.swing.JFrame;

public class MainClass {
	public static void main(String[] args) {
		JFrame f=new JFrame();
		GamePlay gamePlay = new GamePlay();
		
		f.setBounds(10, 10, 700, 600);//size of frame
		f.setTitle("Breakout Ball");		
		f.setResizable(false);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// x button on frame
		f.add(gamePlay);//obj for gameplay class
        f.setVisible(true);
		
	}

}