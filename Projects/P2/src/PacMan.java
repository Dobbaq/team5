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
		ArrayList<Location> result = new ArrayList<Location>();
		if(myMap.getLoc(myLoc.shift(0,1))!= null && !(myMap.getLoc(myLoc.shift(0,1)).contains(Map.Type.WALL))) {
			if(myMap.getLoc(myLoc.shift(0,-1))!= null && (myMap.getLoc(myLoc.shift(0,-1)).contains(Map.Type.WALL))) {
				this.upDownDir = false;
			}
		}else{
			this.upDownDir=true;
		}
		if(myMap.getLoc(myLoc.shift(1,0))!= null && !(myMap.getLoc(myLoc.shift(1,0)).contains(Map.Type.WALL))) {
			if(myMap.getLoc(myLoc.shift(-1,0))!= null && (myMap.getLoc(myLoc.shift(-1,0)).contains(Map.Type.WALL))) {
				this.leftRightDir = false;
			}
		}else{
			this.leftRightDir=true;
		}
		if (myMap.getLoc(myLoc.shift(0,1))!= null && !(myMap.getLoc(myLoc.shift(0,1)).contains(Map.Type.WALL))) {
			result.add(myLoc.shift(0, 1));
		} 
		if (myMap.getLoc(myLoc.shift(1,0))!= null && !myMap.getLoc(myLoc.shift(1,0)).contains(Map.Type.WALL)) {
		
			result.add(myLoc.shift(1, 0));
		} 
		if (myMap.getLoc(myLoc.shift(-1,0))!= null && !myMap.getLoc(myLoc.shift(-1,0)).contains(Map.Type.WALL)) {
				if(this.leftRightDir) {
					result.add(0,myLoc.shift(-1, 0));
				}else {
					result.add(myLoc.shift(-1, 0));
				}	
		}
		if (myMap.getLoc(myLoc.shift(0,-1))!= null &&!myMap.getLoc(myLoc.shift(0,-1)).contains(Map.Type.WALL)) {
			if(this.upDownDir) {
				result.add(0, myLoc.shift(0, -1));
			}else {
				result.add(myLoc.shift(0, -1));
			}
		}
		return result;
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
