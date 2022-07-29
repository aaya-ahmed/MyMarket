
package Item;
public class ItemDto {
    String Name,Catagory;
    int Barcood;
    double Quntity,Price;

    public String getCatagory() {
        return Catagory;
    }

    public void setCatagory(String Catagory) {
        this.Catagory = Catagory;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getBarcood() {
        return Barcood;
    }

    public void setBarcood(int Barcood) {
        this.Barcood = Barcood;
    }

    public double getQuntity() {
        return Quntity;
    }

    public void setQuntity(double Quntity) {
        this.Quntity = Quntity;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }
    
}
