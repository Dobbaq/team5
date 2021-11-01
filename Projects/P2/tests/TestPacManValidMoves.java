import junit.framework.*;
import java.awt.Color;
import java.io.*;
import java.util.ArrayList;

public class TestPacManValidMoves extends TestCase {

	public void testPacManValidMoves() throws FileNotFoundException{
		NoFrame frame = new NoFrame();
		
		PacMan pacman = frame.addPacMan(new Location(20, 10));
		
		ArrayList<Location> locs = new ArrayList<Location>();
		locs.add(new Location(1, 2));
		locs.add(new Location(1, 1));
		locs.add(new Location(3, 1));
		
		assertEquals(pacman.get_valid_moves(), locs);
		
	}
}
