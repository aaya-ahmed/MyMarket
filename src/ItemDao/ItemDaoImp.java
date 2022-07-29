package ItemDao;

import Item.ItemDto;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
import sun.security.util.PropertyExpander;

public class ItemDaoImp implements ItemDao{
ArrayList <ItemDto> items =new ArrayList();
boolean OperationDone=true;
@Override
    public boolean add(ItemDto item) {
        try{
       items.add(item);
        return true;}
        catch(Exception e){
        return false;
        }
    }

@Override
    public boolean delete_Item(int barcood,String Catagory) {
        try{
            for(int i=items.size()-1;i>=0;i--){
                if(items.get(i).getBarcood()==barcood && (items.get(i).getCatagory().equals(Catagory))){
                    items.remove(i);
                }
            }
            return true;
        }
    catch(Exception e){
            return false;
    }
    }
    
@Override
    public boolean delete_Catagory(String name) {
        try{
            for(int i=items.size()-1;i>=0;i--){
                if((items.get(i).getCatagory()).equals(name)){
                    items.remove(i);
                }
            }
            return true;
        }
        catch(Exception e){
            return false;
        }
    }
    
@Override
    public boolean edit_Item(int Barcood, ItemDto newitem) {
        try{
    for(ItemDto it3:items){
        if(it3.getBarcood()==Barcood){
            items.add(newitem);
            System.err.println("");
            items.remove(it3);
        }
    }
    return true;
        }
    catch (Exception e){
    return false;
    }
        
    }

@Override
    public boolean edit_Catagory(String name, String newname) {
        try{
            for(ItemDto it4:items){
                if(it4.getCatagory().equals(name)){
                    it4.setCatagory(newname);
                }
            }
            return true;
        }
        catch (Exception e){
            return false;
        }
    }

@Override
    public ArrayList printall() {
return items;
    }

@Override
    public ArrayList print(String name) {
        ArrayList <ItemDto> SpecificCatagory=new ArrayList ();
for(ItemDto it5:items){
    if(it5.getCatagory().equals(name)){
    SpecificCatagory.add(it5);}
}
    return SpecificCatagory;
    }
    
      public double Bill(int quntity,String name,int barcood) {
          double price=0;
for(ItemDto it5:items){
    if(it5.getBarcood()==barcood&&it5.getCatagory().equals(name)){
it5.setQuntity(it5.getQuntity()-quntity);
price=it5.getPrice()*quntity;
    }}
      return price;
      }
}
