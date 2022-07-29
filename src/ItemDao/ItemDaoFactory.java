package ItemDao;
public class ItemDaoFactory {
    public ItemDao newobject(){
    return new ItemDaoImp();
    }
}
