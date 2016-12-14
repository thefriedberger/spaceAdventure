import java.util.HashMap;
import java.util.Set;
/**
 * class Inventory
 * Creates the inventory and adds and removes items from rooms
 * 
 * @author Tyler Friedberg and Ben Fasinski
 */
public class Inventory
{
    private HashMap<String, Item> inv;
    
    public Inventory() {
        inv = new HashMap<String, Item>();
    }
    
    /**
     * Adds items to a room
     */
    public void addItem(String itemName, Item item) {
        inv.put(itemName, item);
    }
    
    public int size() {
        return inv.size();
    }
    
    /**
     * Gets the index of an item
     */
    public Item getItem(String searchName) {
        boolean foundItem = false;
        Item item = null;
        for(int i = 0; i < inv.size(); i++) {
            item = inv.get(searchName);
        }
        return item;        
    }
    /**
     * gets the item description
     */
    public String getInfo() {
        String description = "";
        Set<String> items = inv.keySet();
        for(String item : items) {
            description += " " + item;
        }
        return description;
    }
    
    /**
     * Removes items from a room
     */    
    public void removeItem(String i) {
        inv.remove(i);
    }
}
