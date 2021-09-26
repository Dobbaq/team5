import java.util.HashSet;
import java.util.ArrayList;
import javax.swing.JComponent;

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
		if(this.myMap.getLoc(this.temp(x - 1, y + 1)) != Map.Type.WALL) 
		{
			validMoves.add(this.temp(x - 1, y + 1)); //Top Left Diagonal
		} else if(this.myMap.getLoc(this.temp(x - 1, y)) != Map.Type.WALL)
		{
			validMoves.add(this.temp(x - 1, y)); //Left
		} else if(this.myMap.getLoc(this.temp(x - 1, y - 1)) != Map.Type.WALL)
		{
			validMoves.add(this.temp(x - 1, y - 1)); //Bottom Left Diagonal
		} else if(this.myMap.getLoc(this.temp(x, y - 1)) != Map.Type.WALL)
		{
			validMoves.add(this.temp(x, y - 1)); //Bottom
		} else if(this.myMap.getLoc(this.temp(x + 1, y - 1)) != Map.Type.WALL)
		{
			validMoves.add(this.temp(x + 1, y - 1)); //Bottom Right Diagonal
		} else if(this.myMap.getLoc(this.temp(x + 1, y)) != Map.Type.WALL)
		{
			validMoves.add(this.temp(x + 1, y)); //Right
		} else if(this.myMap.getLoc(this.temp(x + 1, y + 1)) != Map.Type.WALL)
		{
			validMoves.add(this.temp(x + 1, y + 1)); //Top Right Diagonal
		} else if(this.myMap.getLoc(this.temp(x, y + 1)) != Map.Type.WALL)
		{
			validMoves.add(this.temp(x, y + 1)); //Top
		}
		
		return validMoves; //Returns a list of valid locations
	}

	public boolean move() {
		return false;
	}

	public boolean is_ghost_in_range() { 
		return false;
	}

	public JComponent consume() {  
 		return null;
	}
}
