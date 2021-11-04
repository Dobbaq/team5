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
		ArrayList<Location> locations = new ArrayList<Location>();

		// Bottom left
		if (!myMap.getLoc(new Location(myLoc.x - 1, myLoc.y - 1)).contains(Map.Type.WALL)) {
			locations.add(new Location(myLoc.x - 1, myLoc.y - 1));
		}
		
		// Bottom middle
		if (!myMap.getLoc(new Location(myLoc.x, myLoc.y - 1)).contains(Map.Type.WALL)) {
			locations.add(new Location(myLoc.x, myLoc.y - 1));
		}

		// Bottom right
		if (!myMap.getLoc(new Location(myLoc.x + 1, myLoc.y - 1)).contains(Map.Type.WALL)) {
			locations.add(new Location(myLoc.x + 1, myLoc.y - 1));
		}

		// Middle left
		if (!myMap.getLoc(new Location(myLoc.x - 1, myLoc.y)).contains(Map.Type.WALL)) {
			locations.add(new Location(myLoc.x - 1, myLoc.y));
		}

		// Middle right
		if (!myMap.getLoc(new Location(myLoc.x + 1, myLoc.y)).contains(Map.Type.WALL)) {
			locations.add(new Location(myLoc.x + 1, myLoc.y));
		}

		// Top left
		if (!myMap.getLoc(new Location(myLoc.x - 1, myLoc.y + 1)).contains(Map.Type.WALL)) {
			locations.add(new Location(myLoc.x - 1, myLoc.y + 1));
		}

		// Top middle
		if (!myMap.getLoc(new Location(myLoc.x, myLoc.y + 1)).contains(Map.Type.WALL)) {
			locations.add(new Location(myLoc.x, myLoc.y + 1));
		}

		// Top right
		if (!myMap.getLoc(new Location(myLoc.x + 1, myLoc.y + 1)).contains(Map.Type.WALL)) {
			locations.add(new Location(myLoc.x + 1, myLoc.y + 1));
		}

		return locations;
	}

	public boolean move() {
		ArrayList<Location> locations = get_valid_moves();
		if (locations.isEmpty()) {
			return false;
		}

		// Sets the ghost to a random location returned in the get_valid_moves method
		myLoc = locations.get((int) (Math.random() * locations.size()) + 8);
		myMap.move(myName, myLoc, Map.Type.GHOST);
		return true;
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
		return is_pacman_in_range() ? myMap.attack(myName) : false;
	}
}
