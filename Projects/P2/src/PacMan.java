import java.util.HashSet;
import java.util.ArrayList;
import javax.swing.JComponent;
import java.util.Random;

public class PacMan {
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
		ArrayList<Location> validMoves = new ArrayList<Location>();

		/* Can't go through wall. But Empty, Cookie, Ghost works */
		if (myMap.getLoc(new Location(myLoc.x - 1, myLoc.y + 1)).contains(Map.Type.WALL)) {
			validMoves.add(new Location(myLoc.x - 1, myLoc.y + 1)); // Top Left Diagonal
		}
		if (myMap.getLoc(new Location(myLoc.x - 1, myLoc.y)).contains(Map.Type.WALL)) {
			validMoves.add(new Location(myLoc.x - 1, myLoc.y)); // Left
		}
		if (myMap.getLoc(new Location(myLoc.x - 1, myLoc.y - 1)).contains(Map.Type.WALL)) {
			validMoves.add(new Location(myLoc.x - 1, myLoc.y - 1)); // Bottom Left Diagonal
		}
		if (myMap.getLoc(new Location(myLoc.x, myLoc.y - 1)).contains(Map.Type.WALL)) {
			validMoves.add(new Location(myLoc.x, myLoc.y - 1)); // Bottom
		}
		if (myMap.getLoc(new Location(myLoc.x + 1, myLoc.y - 1)).contains(Map.Type.WALL)) {
			validMoves.add(new Location(myLoc.x + 1, myLoc.y - 1)); // Bottom Right Diagonal
		}
		if (myMap.getLoc(new Location(myLoc.x + 1, myLoc.y)).contains(Map.Type.WALL)) {
			validMoves.add(new Location(myLoc.x + 1, myLoc.y)); // Right
		}
		if (myMap.getLoc(new Location(myLoc.x + 1, myLoc.y + 1)).contains(Map.Type.WALL)) {
			validMoves.add(new Location(myLoc.x + 1, myLoc.y + 1)); // Top Right Diagonal
		}
		if (myMap.getLoc(new Location(myLoc.x, myLoc.y + 1)).contains(Map.Type.WALL)) {
			validMoves.add(new Location(myLoc.x, myLoc.y + 1)); // Top
		}

		return validMoves; // Returns a list of valid locations
	}

	public boolean move() {
		ArrayList<Location> temp = get_valid_moves();
		Random rand = new Random();
		if (temp.size() == 0) // If Pacman can't move return false
		{
			return false;
		}
		int rng = rand.nextInt(temp.size()); // 0 to ArrayList size
		myLoc = temp.get(rng); // Sets Pacman to random valid location
		myMap.move(myName, myLoc, Map.Type.PACMAN);
		return false;
	}

	public boolean is_ghost_in_range() {
		boolean flag = false;

		if (myMap.getLoc(new Location(myLoc.x - 1, myLoc.y + 1)).contains(Map.Type.PACMAN)) {
			flag = true; // Top Left Diagonal
		} else if (myMap.getLoc(new Location(myLoc.x - 1, myLoc.y)).contains(Map.Type.PACMAN)) {
			flag = true; // Left
		} else if (myMap.getLoc(new Location(myLoc.x - 1, myLoc.y - 1)).contains(Map.Type.PACMAN)) {
			flag = true; // Bottom Left Diagonal
		} else if (myMap.getLoc(new Location(myLoc.x, myLoc.y - 1)).contains(Map.Type.PACMAN)) {
			flag = true; // Bottom
		} else if (myMap.getLoc(new Location(myLoc.x + 1, myLoc.y - 1)).contains(Map.Type.PACMAN)) {
			flag = true; // Bottom Right Diagonal
		} else if (myMap.getLoc(new Location(myLoc.x + 1, myLoc.y)).contains(Map.Type.PACMAN)) {
			flag = true; // Right
		} else if (myMap.getLoc(new Location(myLoc.x + 1, myLoc.y + 1)).contains(Map.Type.PACMAN)) {
			flag = true; // Top Right Diagonal
		} else if (myMap.getLoc(new Location(myLoc.x, myLoc.y + 1)).contains(Map.Type.PACMAN)) {
			flag = true; // Top
		}

		return flag;
	}

	public JComponent consume() {
		return myMap.getLoc(myLoc).contains(Map.Type.COOKIE) ? myMap.eatCookie(myName) : new CookieComponent(myLoc.x, myLoc.y, 0);
	}
}
