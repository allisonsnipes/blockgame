import javax.swing.JFrame;

public class Main {

	public static void main(String[] args) {
		JFrame obj = new JFrame();
		obj.setBounds(10, 10, 700, 700); //sets the size of the window
		obj.setTitle("Block Game"); //title of the window
		obj.setResizable(false); //makes the window fixed not re-sizable
		obj.setVisible(true); //makes the window visible
		obj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //exits game on close
		
		GamePlay gamePlay = new GamePlay(); //we needed an object of GamePlay class so that it is called within the main class
		obj.add(gamePlay);
	
	
	
	}


}


