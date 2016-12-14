import java.util.HashMap;
/**
 * Creates item object
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Item
{
    private String itemName;
    private String description;
    private double weight;
    
    public Item(String itemName, String description, double weight) {
        this.itemName = itemName;
        this.description = description;
        this.weight = weight;
    }
    
    /**
     * Returns name of the item
     */
    public String getName(String itemName) {
        return itemName;
    }
    
    /**
     * Returns a string that has an items description and weight
     */
    public String getItemDescription() {
        return "There is " + description + ".\n";
    }
}
