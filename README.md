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
### Ghost - move()
### Ghost - is_pacman_in_range()
### Ghost - attack()

### Map - move(String name, Location loc, Type type)
### Map - getLoc(Location Loc)
### Map - attack(String name)
### Map - eatCookie(String Name)
