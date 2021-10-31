import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestPacManInRange extends TestCase {

	public void testPacManInRange() throws FileNotFoundException{
		NoFrame frame = new NoFrame();

		Ghost ghost = frame.addGhost(new Location(1, 1), "test_ghost", Color.red);
		assertFalse(ghost.is_pacman_in_range());
		
		PacMan pacman = frame.addPacMan(new Location(1, 2));
		assertTrue(ghost.is_pacman_in_range());
	}
}
