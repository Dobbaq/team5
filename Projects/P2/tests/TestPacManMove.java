import junit.framework.*;
import java.awt.Color;
import java.io.*;
import java.util.ArrayList;

public class TestPacManMove extends TestCase {

	public void testPacManMove() throws FileNotFoundException{
		MainFrame frame = new MainFrame();
		PacMan pacman = frame.addPacMan(new Location(2, 1));
		Map map = frame.getMap();
		
		
		ArrayList<Location> locs = pacman.get_valid_moves();
		assertTrue(pacman.move());
		
		boolean temp = false;
		
		if(map.getLoc(locs.get(0)).contains(Map.Type.PACMAN) || 
			map.getLoc(locs.get(1)).contains(Map.Type.PACMAN) ||
			map.getLoc(locs.get(3)).contains(Map.Type.PACMAN)) {
			temp = true;
			}
		assertTrue(temp);
	}
}
