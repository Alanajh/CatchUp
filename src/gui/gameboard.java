package gui;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

import logic.Player;

public class gameboard extends Applet implements Runnable{

	Thread thread = new Thread(this);
	boolean running = true;
	
	Player p;
	
	public gameboard() {}
	public void run() {
		while(running){
			try{
				Thread.sleep(20);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
		
	}
	public void init(){
		setBackground(Color.BLUE);
		setSize(400, 300);
		p = new Player();
	}
	public void start(){
		thread.start();
	}
	public void stop(){
		running = false;
	}
	public void destroy(){
		running = false;
	}
	public void paint(Graphics g){
		p.paint(g);
	}
}
