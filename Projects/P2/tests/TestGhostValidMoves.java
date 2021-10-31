import junit.framework.*;
import java.awt.Color;
import java.io.*;
import java.util.ArrayList;

public class TestGhostValidMoves extends TestCase {

	public void testGhostValidMoves() throws FileNotFoundException {
		// Creating A Map
		NoFrame frame = new NoFrame(); // Creates A New Map With Walls and Tokens Initialized

		Ghost ghost = frame.addGhost(new Location(1, 1), "test_ghost", Color.red);

		ArrayList<Location> locs = new ArrayList<Location>();
		locs.add(new Location(2, 1));
		locs.add(new Location(1, 2));

		assertEquals(ghost.get_valid_moves(), locs);
	}
}
