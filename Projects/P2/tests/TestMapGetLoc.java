import junit.framework.*;
import java.awt.Color;
import java.io.*;
import java.util.ArrayList;

public class TestMapGetLoc {
	
	public void testMapGetLoc() {
		Mainframe frame = new MainFrame(); //Creates A New Map With Walls and Tokens Initialized

		//Creating Players
		PacMan pacman = frame.addPacMan(new Location(2, 4)); //Creates PacMan at location x, y
		Map m = frame.getMap();

		ArrayList<Location> l = new ArrayList<>();
	

		AssertEquals(m.getLoc(new Location (2,4)), m.Type.PACMAN);
	}
}
