import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestMapMove extends TestCase {

	public void testMapMove() throws FileNotFoundException {
		NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens w/o a Display
		Map map = frame.getMap();
		Ghost ghost = frame.addGhost(new Location(1, 1), "Jerry", Color.red);

		assertTrue(map.getLoc(new Location(1, 1)).contains(Map.Type.GHOST));
		map.move("Jerry", new Location(1, 2), Map.Type.GHOST);
		assertFalse(map.getLoc(new Location(1, 1)).contains(Map.Type.GHOST));
	}
}
