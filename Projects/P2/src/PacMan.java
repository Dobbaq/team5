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
		return null;	
	}

	public boolean move() {
		return false;
	}

	public boolean is_ghost_in_range() {
		Location temp = new Location(this.myLoc);
		int x = temp.x;
		int y = temp.y;
		boolean flag = false;
		if(this.myMap.getLoc(this.temp(x - 1, y + 1)).contains(Map.Type.GHOST))
		{
			flag = true; //Top Left Diagonal
		} else if(this.myMap.getLoc(this.temp(x - 1, y)).contains(Map.Type.GHOST))
		{
			flag = true; //Left
		} else if(this.myMap.getLoc(this.temp(x - 1, y - 1)).contains(Map.Type.GHOST))
		{
			flag = true; //Bottom Left Diagonal
		} else if(this.myMap.getLoc(this.temp(x, y - 1)).contains(Map.Type.GHOST))
		{
			flag = true; //Bottom
		} else if(this.myMap.getLoc(this.temp(x + 1, y - 1)).contains(Map.Type.GHOST))
		{
			flag = true; //Bottom Right Diagonal
		} else if(this.myMap.getLoc(this.temp(x + 1, y)).contains(Map.Type.GHOST))
		{
			flag = true; //Right
		} else if(this.myMap.getLoc(this.temp(x + 1, y + 1)).contains(Map.Type.GHOST))
		{
			flag = true; //Top Right Diagonal
		} else if(this.myMap.getLoc(this.temp(x, y + 1)).contains(Map.Type.GHOST))
		{
			flag = true; //Top
		}
		
		return flag;
	}

	public JComponent consume() { 
 		return null;
	}
}
