import java.util.ArrayList;
/**
 * Write a description of class Inventory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Inventory
{
    private ArrayList<Item> inv;
    
    public Inventory() {
        inv = new ArrayList<Item>();
    }
    
    /**
     * Adds items to a room
     */
    public void addItem(Item item) {
        inv.add(item);
    }
    
    public int size() {
        return inv.size();
    }
    
    
    
    /**
     * Gets the index of an item
     */
    public Item getItem(String searchName) {
        int foundIndex = -1;
        for(int index = 0; index < inv.size(); index++) {
            if(inv.get(index).getName(inv.toString()).equals(searchName)) {
                foundIndex = index;
            }
            break;
        }
        if(foundIndex==-1){
            return null;
        }
        else {
            return inv.get(foundIndex);
        }
    }
    
    public String getInfo() {
        String description = "";
        if(inv.size() > 0) {
            for(Item item : inv) {
                description = item.getItemDescription().toString();
            }
        }
        return description;
    }
    
    /**
     * Removes items from a room
     */    
    public void removeItem(int i) {
        inv.remove(i);
    }
}
