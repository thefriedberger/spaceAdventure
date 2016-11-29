import java.util.ArrayList;
/**
 * Write a description of class Inventory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player
{
    private Inventory items;
    
    public Player() {
        items = new Inventory();
    }
    
    /**
     * Adds an item to the player's inventory
     */
    public void addItem(Item item) {
        items.addItem(item);
    }
    
    public Item getItem(String searchName) {
        return items.getItem(searchName);        
    }
    
    /**
     * Removes an item from the player's inventory
     */
    public void removeItem(int i) {
        items.removeItem(i);
    }
    
    //public void 
}
