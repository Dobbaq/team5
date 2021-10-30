import junit.framework.*;
import java.awt.Color;
import java.io.*;
import java.util.ArrayList;

public class TestGhostMove extends TestCase {

	public void testGhostMove() throws FileNotFoundException{
		NoFrame frame = new NoFrame();

		Ghost ghost = frame.addGhost(new Location(1, 1), "test_ghost", Color.red);
		Map map = frame.getMap();

		ArrayList<Location> moves = ghost.get_valid_moves();
		assertTrue(ghost.move());

		boolean ghostInLoc = false;
		if (map.getLoc(moves.get(0)).contains(Map.Type.GHOST) || map.getLoc(moves.get(1)).contains(Map.Type.GHOST)) {
			ghostInLoc = true;
		}

		assertTrue(ghostInLoc);
	}
}
