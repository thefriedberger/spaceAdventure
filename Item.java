import java.util.HashMap;
/**
 * Write a description of class Items here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Item
{
    private String description;
    private double weight;
    public Item(String description, double weight) {
        this.description = description;
        this.weight = weight;
    }
    
    public String getItemDescription() {
        return "There is " + description + " and it weighs " + weight + " lbs" + ".\n";
    }
}
