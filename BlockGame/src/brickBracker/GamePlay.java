package brickBracker;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Timer;

import javax.swing.JPanel;

public class GamePlay extends JPanel implements KeyListener, ActionListener {
	private boolean play = false; //once game starts it shouldn't start playing by itself
	private int score = 0; //starts the game at score 0
	private int totalBlocks = 21; //how many blocks should populate
	private Timer timer; //timer for setting a goal for the level
	private int delay = 8; //speed for the timer
	
	private int playerX = 310; // give the player some sort of value
	private int xSliderPosition = 310; //the starting position of the slider
	private int xBallPosition = 120; //the starting x-axis position of the ball
	private int yBallPosition = 350; //the starting x-axis position of the ball
	private int xBallDirection = -1; //direction of the ball travel
	private int yBallDirection = -2; //direction of the ball travel		
	
	//constructor method <--- look up. this is for the objects we created for the game in order for it to work
	public GamePlay() {
		addKeyListener(this);
		setFocusable(true);
		setFocusTraversalKeysEnabled(false);
//		timer = new Timer(delay, this); //object for timer
//		timer.start();
		
	}
	
	//draws the slider ball and different objects in the game
	public void paint(Graphics g) {
		//drawing background
		g.setColor(Color.black);
		g.fillRect(1, 1, 692, 592);
	
		//drawing borders
		g.setColor(Color.yellow);
		g.fillRect(0, 0, 3, 592);
		g.fillRect(0, 0, 692, 3);
		g.fillRect(691, 0, 3, 592); //if the ball goes all the way down it should end the game
		
		//drawing the paddle
		g.setColor(Color.green);
		g.fillRect(playerX, 550, 100, 8);
		
		//drawing the ball
		g.setColor(Color.yellow);
		g.fillRect(xBallPosition, yBallPosition, 20, 20);
	} 
	
	//these methods are in charge of the movement of the ball left or right
	public void moveRight() {
		play = true; //set this value to true since it was false in the beginning
		playerX+=20;
	}
	
	public void moveLeft() {
		play = true; //set this value to true since it was false in the beginning
		playerX-=20;
	}
	
	
	//these are all of the implemented methods for the action and key listeners
	@Override
	public void actionPerformed(ActionEvent e) {
		//actionListener that moves the ball around
	}

	
	@Override
	public void keyTyped(KeyEvent e) {
		//keyListener to move the slider
		// we don't need this but it will throw an error	
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// we don't need this but it will throw an error	
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		if(e.getKeyCode() == KeyEvent.VK_RIGHT) {
			if(playerX >= 600) {
				playerX = 600;
			} else {
				moveRight();
			}
		}
		
		if(e.getKeyCode() == KeyEvent.VK_LEFT) {
			if(playerX < 10) {
				playerX = 10;
			} else {
				moveLeft();
			}
		}
	}

}
