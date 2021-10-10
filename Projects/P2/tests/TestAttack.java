import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestAttack extends TestCase {

	public void testAttack() throws FileNotFoundException{
		MainFrame frame = new MainFrame(); //Creates A New Map With Walls and Tokens w/o a Display
		PacMan pacman = frame.addPacMan(new Location(1, 1));
		Ghost ghost = frame.addGhost(new Location(1, 2), "Clyde", Color.red);
		assertTrue(ghost.attack());
		
		pacman = frame.addPacMan(new Location(1, 1));
		ghost = frame.addGhost(new Location(1, 3), "Clyde", Color.red);
		assertFalse(ghost.attack());
	}
}
