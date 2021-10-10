import junit.framework.*;
import java.awt.Color;
import java.io.*;

public class TestMapEatCookie extends TestCase {
	
	public void testMapEatCookie() throws FileNotFoundException {
		MainFrame frame = new MainFrame();
		PacMan pacman = frame.addPacMan(new Location(4, 6)); //Creates PacMan at location 4,6 no cookie at 4,6

		Map m = frame.getMap();

		assertEquals(m.eatCookie("pacman"), null);
	}
}
