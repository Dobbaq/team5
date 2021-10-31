import junit.framework.*;
import java.awt.Color;
import java.io.*;
import java.util.HashSet;

public class TestMapGetLoc extends TestCase {
	
	public void testMapGetLoc() throws FileNotFoundException {
		NoFrame frame = new NoFrame(); //Creates A New Map With Walls and Tokens Initialized

		//Creating Players
		PacMan pacman = frame.addPacMan(new Location(2, 3)); //Creates PacMan at location x, y
		Map m = frame.getMap();

		HashSet<Map.Type> l = new HashSet<Map.Type>();
		l.add(Map.Type.PACMAN);
		l.add(Map.Type.COOKIE);
	

		assertEquals(m.getLoc(new Location(2, 3)), l);
	}
}
