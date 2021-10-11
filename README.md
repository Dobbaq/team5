# Project 2: PacMan

By: Myckell Ronquillo, Ryan Gorinson, Evan Nadelbach, Joseph Zietowski

*Insert image of your code playing PacMan*

## Table of Contents
*Need to figure out*
[How to play](#how-to-play)  
[Functions](#Functions)  


## How to play
*Insert section on how to run the code from command line*
```
\\Insert code block
```

## Functions

### Pacman - get_valid_moves()
- **Description**: This functions returns all the possible valid moves that PacMan can take given his current location
- **Test**: The test places PacMan in a location where the only 3 possible moves
### Pacman - move()
- **Description**: This function randomly chooses a valid move from get_valid_moves() function and moves PacMan to that valid move
- **Test**: The test checks to see if PacMan moved to a new location by checking the map that there is a type PacMan in the new location that he moved to
### Pacman - is_ghost_in_range()
- **Description**: This function checks to see if there are any ghosts adjacent to PacMan's current location
- **Test**: The test first checks to see if a ghost is next to PacMan and returns false and a ghost is then added next to PacMan and is_ghost_in_range() function is called again and returns True since there is a ghost next to PacMan
### Pacman - consume()

### Ghost - get_valid_moves()
- **Description**: This method retrieves all of the possible moves that a ghost can make. Ghosts can move up, down, left, and right, and can also move diagonally. Because of this, ghosts can move in a maximum of 8 possible directions. As long as the location is not a wall, it can move there.
- **Test**: The test places a ghost in location (1, 1) and ensures that it only has two valid locations it can move to (based on map.txt).
### Ghost - move()
- **Description**: This method moves a ghost to one of the valid locations returned by get_valid_moves. It does this using a random number generator and will return true if there is at least one valid location the ghost can move to.
- **Test**: The test ensures that there is a valid move for a ghost at position (1, 1) to move to, and checks that it did indeed move to one of those locations. There are a total of two positions it could move to (based on map.txt).
### Ghost - is_pacman_in_range()
- **Description**: This method checks to see if Pac-Man is in one of the eight directions (up, down, left, right, and diagonal) from a ghost in a given location. If Pac-Man is in at least one of those locations, this method returns true, and otherwise it returns false.
- **Test**: This test checks to see if there is a Pac-Man in a given location based on a ghost at location (1, 1). The first assertion checks that Pac-Man is not in range (which is correct since a Pac-Man was not added anywhere), then the second assertion checks that Pac-Man is in range when added at location (1, 2).
### Ghost - attack()

### Map - move(String name, Location loc, Type type)
### Map - getLoc(Location Loc)
### Map - attack(String name)
### Map - eatCookie(String Name)
