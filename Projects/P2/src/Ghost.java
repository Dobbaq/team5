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
		return false;
	}

	public boolean is_pacman_in_range() { 
		
		// Bottom left
		if (myMap.getLoc(new Location(myLoc.x - 1, myLoc.y - 1)).contains(Map.Type.PACMAN)) {
			return true;
		}
		
		// Bottom middle
		else if (myMap.getLoc(new Location(myLoc.x, myLoc.y - 1)).contains(Map.Type.PACMAN)) {
			return true;
		}

		// Bottom right
		else if (myMap.getLoc(new Location(myLoc.x + 1, myLoc.y - 1)).contains(Map.Type.PACMAN)) {
			return true;
		}

		// Middle left
		else if (myMap.getLoc(new Location(myLoc.x - 1, myLoc.y)).contains(Map.Type.PACMAN)) {
			return true;
		}

		// Middle right
		else if (myMap.getLoc(new Location(myLoc.x + 1, myLoc.y)).contains(Map.Type.PACMAN)) {
			return true;
		}

		// Top left
		else if (myMap.getLoc(new Location(myLoc.x - 1, myLoc.y + 1)).contains(Map.Type.PACMAN)) {
			return true;
		}

		// Top middle
		else if (myMap.getLoc(new Location(myLoc.x, myLoc.y + 1)).contains(Map.Type.PACMAN)) {
			return true;
		}

		// Top right
		else if (myMap.getLoc(new Location(myLoc.x + 1, myLoc.y + 1)).contains(Map.Type.PACMAN)) {
			return true;
		}

		return false;
	}

	public boolean attack() {
		return false;
	}
}
