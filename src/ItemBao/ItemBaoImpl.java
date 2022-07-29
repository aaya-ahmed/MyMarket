package ItemBao;

import Item.ItemDto;
import ItemDao.ItemDao;
import ItemDao.ItemDaoFactory;
import java.util.ArrayList;

public class ItemBaoImpl implements ItemBao{
private ItemDao items =new ItemDaoFactory().newobject();

    @Override
    public boolean add(ItemDto item) {
        return items.add(item);
    }

    @Override
    public boolean delete_Item(int barcood,String Catagory) {
        return items.delete_Item(barcood,Catagory);
    }

    @Override
  public boolean edit_Item(int barcood ,ItemDto newitem) {
      return items.edit_Item(barcood, newitem);
    }

  @Override
    public boolean delete_Catagory(String name) {
        return items.delete_Catagory(name);
    }

    @Override
    public boolean edit_Catagory(String name, String newname) {
        return items.edit_Catagory(name, newname);
    }
    
    @Override
    public ArrayList printall() {
        return items.printall();
    }

@Override
    public ArrayList print(String name) {
        return items.print(name);
    }

    @Override
    public double Bill(int quntity, String name, int barcood) {
        return items.Bill(quntity, name, barcood);
    }
    
}
