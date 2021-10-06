import java.util.HashMap;
import java.util.HashSet;
import javax.swing.JComponent;

public class Map{

	public enum Type {
		EMPTY,
		PACMAN,
		GHOST,
		WALL,
		COOKIE		
	}
	
	private HashMap<Location, HashSet<Type>> field;
	private boolean gameOver;
	private int dim;

	private HashMap<String, Location> locations;
	private HashMap<String, JComponent> components; 
	private HashSet<Type> emptySet;
	private HashSet<Type> wallSet; 

	private int cookies = 0;

	public Map(int dim){
		gameOver = false;
		locations = new HashMap<String, Location>();
		components = new HashMap<String, JComponent>();
		field = new HashMap<Location, HashSet<Type>>();

		emptySet = new HashSet<Type>();
		wallSet = new HashSet<Type>();
		emptySet.add(Type.EMPTY);
		wallSet.add(Type.WALL);
		this.dim = dim;
	}


	public void add(String name, Location loc, JComponent comp, Type type) {
		locations.put(name, loc);
		components.put(name, comp);
		if (!field.containsKey(loc)) field.put(loc, new HashSet<Type>());
		field.get(loc).add(type);
	}

	public int getCookies() {
		return cookies;
	}
	
	public boolean isGameOver() {
		return gameOver;
	}
		
	public boolean move(String name, Location loc, Type type) {
		//update locations, components, and field
		//use the setLocation method for the component to move it to the new location
		return false;
	}
	
	//For the given location argument, returns what is currently at the location (Empty, Pacman, Cookie, Ghost, Wall).
	public HashSet<Type> getLoc(Location loc) {
		//wallSet and emptySet will help you write this method
		return null;
	}

	/*The method controls ghosts attacking pacman. If the ghost was able 
	to successfully attack pacman and update the display to do so return true, otherwise return false */
	public boolean attack(String Name) {
		return false;
	}

	/*The method controls Pacman eating a cookie. When the function is able to successfully 
	update display to eat a cookie it returns the Cookie component that has been eaten, 
	otherwise it returns null.*/
	public JComponent eatCookie(String name) {
		//update locations, components, field, and cookies
        //the id for a cookie at (10, 1) is tok_x10_y1
        Location pacman = locations.get("pacman");
        HashSet <Type> loc = field.get(pacman);

        for (Type ele : loc) {
            String cookie = "tok_x" + pacman.x + "_y" + pacman.y;
            if (ele == Type.COOKIE) {
                locations.remove(cookie, pacman);
				cookies++;
				JComponent val = components.get(cookie); //get cookie from components to return component
				components.remove(cookie); //remove cookie from compoents
                return val;
            }
        }

        return null;
		
	}
}
