import java.util.HashSet;
import java.util.ArrayList;
import javax.swing.JComponent;
import java.util.Random;

public class PacMan{
	String myName;
	Location myLoc;
	Map myMap;
	Location shift; 

	public PacMan(String name, Location loc, Map map) {
		this.myLoc = loc;
		this.myName = name;
		this.myMap = map;
	}

	public ArrayList<Location> get_valid_moves() {
		return null;	
	}

	public boolean move() {
		ArrayList<Location> temp = get_valid_moves();
		Random rand = new Random();
		if(temp.size() == 0) //If Pacman can't move return false
		{
			return false;
		}
		int rng = rand.nextInt(temp.size()); // 0 to ArrayList size 
		myLoc = temp.get(rng); //Sets Pacman to random valid location
		return true;
	}

	public boolean is_ghost_in_range() { 
		return false;
	}

	public JComponent consume() { 
 		return myMap.getLoc(myLoc) == Map.Type.COOKIE ? myMap.eatCookie(myName) : null;
	}
}
