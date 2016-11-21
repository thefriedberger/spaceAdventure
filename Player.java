import java.util.ArrayList;
/**
 * Write a description of class Inventory here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player
{
    private ArrayList<Item> inventory;
    
    public Player() {
        inventory = new ArrayList<Item>();
    }
    
    public void addItem(Item item) {
        inventory.add(item);
    }
    
    public void useItem(){
        
    }
}
