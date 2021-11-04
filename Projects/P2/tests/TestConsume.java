import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestConsume extends TestCase {

	public void testConsume() throws FileNotFoundException {
		NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens w/o a Display
		PacMan pacman = frame.addPacMan(new Location(1, 1));
		assertTrue(pacman.consume() instanceof CookieComponent);
		pacman = frame.addPacMan(new Location(1, 1));
		assertTrue(pacman.consume() == null);
	}
}
