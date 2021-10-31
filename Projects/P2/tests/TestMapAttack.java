import java.awt.Color;
import junit.framework.*;
import java.io.*;

public class TestMapAttack extends TestCase {

	public void testMapAttack() throws FileNotFoundException {
		NoFrame frame = new NoFrame();
		Ghost ghost = frame.addGhost(new Location(9, 8), "Joe", Color.red); //Creates a red ghost named "name" at location x,y
		PacMan pacman = frame.addPacMan(new Location(9, 9)); //Creates PacMan at location x, y

		assertTrue(ghost.attack());
	}
}
