package logic;

import java.awt.Graphics;

import gui.gameboard;

public class Player {

	private int arc = 26;
	private int x = 100;
	private int y = 100;
	private int radius = 20;
	
	
	public void update(gameboard gb){
		
	}
	public void paint(Graphics g){
		g.fillRoundRect(x, y, radius*2, radius*2, arc, arc);
	}
}
