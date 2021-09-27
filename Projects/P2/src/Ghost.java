import java.util.HashSet;
import java.util.ArrayList;

public class Ghost{
	String myName;
	Location myLoc;
	Map myMap;

	public Ghost(String name, Location loc, Map map) {
		this.myLoc = loc;
		this.myName = name;
		this.myMap = map;
	}

	public ArrayList<Location> get_valid_moves() {
		return null;
	}

	public boolean move() {
		ArrayList<Location> locations = get_valid_moves();
		if (locations.isEmpty()) {
			return false;
		}

		// Sets the ghost to a random location returned in the get_valid_moves method
		myLoc = locations.get((int) Math.random() * locations.size());
		return true;
	}

	public boolean is_pacman_in_range() { 
		return false;
	}

	public boolean attack() {
		return false;
	}
}
