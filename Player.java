import java.util.ArrayList;
/**
 * class Inventory
 * Keeps track of the items added and removed in the players inventory
 * 
 * @author Tyler Friedberg and Ben Fasinski
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
    public void addItem(String itemName, Item item) {
        items.addItem(itemName, item);
    }
    
    public Item getItem(String searchName) {
        return items.getItem(searchName);        
    }
    
    /**
     * Removes an item from the player's inventory
     */
    public void removeItem(String i) {
        items.removeItem(i);
    }
    /**
     * displays current items of a players inventory if any.
     */
    public String getContents() {
        String itemName = items.getInfo();
        if(items.size() < 1) {
            itemName = " There are no items.";
        }
        return "Inventory:" + itemName.toString();
    }
}
