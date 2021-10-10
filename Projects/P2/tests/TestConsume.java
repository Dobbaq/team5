import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestConsume extends TestCase {

	public void testConsume() throws FileNotFoundException {
		MainFrame frame = new MainFrame(); //Creates A New Map With Walls and Tokens w/o a Display
		PacMan pacman = frame.addPacMan(new Location(1, 1));
		assertTrue(pacman.consume() instanceof CookieComponent);
		pacman = frame.addPacMan(new Location(0, 0));
		assertTrue(pacman.consume() == null);
	}
}
