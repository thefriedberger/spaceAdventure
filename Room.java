import java.util.Set;
import java.util.HashMap;
import java.util.Iterator;
import java.util.ArrayList;
/**
 * Class Room - a room in an adventure game.
 *
 * This class is part of the "World of Zuul" application. 
 * "World of Zuul" is a very simple, text based adventure game.  
 *
 * A "Room" represents one location in the scenery of the game.  It is 
 * connected to other rooms via exits.  For each existing exit, the room 
 * stores a reference to the neighboring room.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2016.02.29
 */

public class Room 
{
    private String description;
    private String lookDescription;
    private HashMap<String, Room> exits;        // stores exits of this room.
    private Inventory items;
    
    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(String description, String lookDescription) 
    {
        this.description = description;
        this.lookDescription = lookDescription;
        exits = new HashMap<String, Room>();
        items = new Inventory();
    }

    /**
     * Define an exit from this room.
     * @param direction The direction of the exit.
     * @param neighbor  The room to which the exit leads.
     */
    public void setExit(String direction, Room neighbor) 
    {
        exits.put(direction, neighbor);
    }
    
    /**
     * Adds items to a room
     */
    public void addItem(String itemName, Item item) {
        items.addItem(itemName, item);
    }    
    
    /**
     * Gets the index of an item
     */
    public Item getItem(String searchName) {
        return items.getItem(searchName);
    }
    
    /**
     * Removes items from a room
     */    
    public void removeItem(String i) {
        items.removeItem(i);
    }
    
    /**
     * @return The short description of the room
     * (the one that was defined in the constructor).
     */
    public String getShortDescription()
    {
        return description;
    }

    /**
     * Return a description of the room in the form:
     *     You are in the kitchen.
     *     The item(s) that are in the room.
     *     Exits: north west
     * @return A long description of this room
     */
    public String getLongDescription()
    {
        String longDescription = "You are " + description + ".\n";
        if(items.size() > 0) {
            longDescription += "There is a(n) " + items.getInfo().toString() + ".\n";
        }
        return longDescription + getExitString();
    }
    
    /**
     * Return a string describing the room's exits, for example
     * "Exits: north west".
     * @return Details of the room's exits.
     */
    private String getExitString()
    {
        String returnString = "Exits:";
        Set<String> keys = exits.keySet();
        for(String exit : keys) {
            returnString += " " + exit;
        }
        return returnString;
    }

    /**
     * Return the room that is reached if we go from this room in direction
     * "direction". If there is no room in that direction, return null.
     * @param direction The exit's direction.
     * @return The room in the given direction.
     */
    public Room getExit(String direction) 
    {
        return exits.get(direction);
    }
    
    /**
     * Returns a longer description that describes room in more detail
     */
    public String getLookDescription() {
        return lookDescription;
    }
}

