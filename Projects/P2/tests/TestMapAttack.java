import java.awt.Color;
import junit.framework.*;

public class TestMapAttack {

	public void testMapAttack() {
		Mainframe frame = new MainFrame();
		Ghost ghost = frame.addGhost(new Location(9, 11), "Joe", Color.red); //Creates a red ghost named "name" at location x,y
		PacMan pacman = frame.addPacMan(new Location(9, 12)); //Creates PacMan at location x, y

		AssertTrue(ghost.attack());
	}
}
