package ItemDao;

import Item.ItemDto;
import java.util.ArrayList;

public interface ItemDao {
     public boolean add(ItemDto item);
    public boolean delete_Item (int barcood,String Catagory);
    public boolean delete_Catagory(String name);    
    public boolean edit_Item(int barcood ,ItemDto newitem); 
    public boolean edit_Catagory(String name ,String newname); 
    public ArrayList printall();
    public ArrayList print(String name);
    public double Bill(int quntity,String name,int barcood);
    
}
