import junit.framework.*;
import java.awt.Color;
import java.io.*;
import java.util.ArrayList;

public class TestGhostInRange extends TestCase {

	public void testGhostInRange() throws FileNotFoundException{
		MainFrame frame = new MainFrame();
		PacMan pacman = frame.addPacMan(new Location(2 , 1));
		assertFalse(pacman.is_ghost_in_range());
		
		Ghost ghost = frame.addGhost(new Location(1, 1), "test_ghost", Color.red);
		assertTrue(pacman.is_ghost_in_range());
		
		
	}
}

