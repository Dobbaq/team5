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
		Location temp = new Location(this.myLoc);
		ArrayList<Location> validMoves = new ArrayList<Location>();
		x = temp.x;
		y = temp.y;
		/*Can't go through wall. But Empty, Cookie, Ghost works*/
		if(!this.myMap.getLoc(this.temp(x - 1, y + 1)).contains(Map.Type.WALL))
		{
			validMoves.add(this.temp(x - 1, y + 1)); //Top Left Diagonal
		} else if(!this.myMap.getLoc(this.temp(x - 1, y)).contains(Map.Type.WALL))
		{
			validMoves.add(this.temp(x - 1, y)); //Left
		} else if(!this.myMap.getLoc(this.temp(x - 1, y - 1)).contains(Map.Type.WALL))
		{
			validMoves.add(this.temp(x - 1, y - 1)); //Bottom Left Diagonal
		} else if(!this.myMap.getLoc(this.temp(x, y - 1)).contains(Map.Type.WALL))
		{
			validMoves.add(this.temp(x, y - 1)); //Bottom
		} else if(!this.myMap.getLoc(this.temp(x + 1, y - 1)).contains(Map.Type.WALL))
		{
			validMoves.add(this.temp(x + 1, y - 1)); //Bottom Right Diagonal
		} else if(!this.myMap.getLoc(this.temp(x + 1, y)).contains(Map.Type.WALL))
		{
			validMoves.add(this.temp(x + 1, y)); //Right
		} else if(!this.myMap.getLoc(this.temp(x + 1, y + 1)).contains(Map.Type.WALL))
		{
			validMoves.add(this.temp(x + 1, y + 1)); //Top Right Diagonal
		} else if(!this.myMap.getLoc(this.temp(x, y + 1)).contains(Map.Type.WALL))
		{
			validMoves.add(this.temp(x, y + 1)); //Top
		}
		
		return validMoves; //Returns a list of valid locations
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
