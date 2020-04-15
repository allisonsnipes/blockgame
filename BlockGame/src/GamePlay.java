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
		timer = new Timer(delay, this); //object for timer
		timer.start();
		
	}
	
	public void paint(Graphics g) {//draws the slider ball and different objects in the game
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
	
	
	
	//these are all of the implemented methods for the action and key listeners
	
	//actionListener that moves the ball around
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

	//keyListener to move the slider
	@Override
	public void keyTyped(KeyEvent e) {
		// we don't need this but it will throw an error	
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// we don't need this but it will throw an error	
	}
	
	@Override
	public void keyPressed(KeyEvent e) {
		
	}

}
