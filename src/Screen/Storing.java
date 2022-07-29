package Screen;

import Item.ItemDto;
import ItemBao.ItemBao;
import ItemBao.ItemBaoFactory;
import employee.Bao.EmployeeBao;
import employee.Bao.EmployeeFactory;
import employee.EmployeeDto;
import java.sql.Array;
public class Storing {
    static EmployeeBao  user(){
     EmployeeBao employee=new EmployeeFactory().returnobject();
      EmployeeDto Emp=new EmployeeDto();
    
        Emp.setName("asmaa");
        Emp.setPassword("123456");
        Emp.setAge(12);
        Emp.setGender("female");
        Emp.setId(3000);
        Emp.setJob("employee");
        employee.add(Emp);
      EmployeeDto Emp1=new EmployeeDto();
        Emp1.setName("samy");
        Emp1.setPassword("12345");
        Emp1.setAge(12);
        Emp1.setGender("male");
        Emp1.setId(1000);
        Emp1.setJob("employee");
        employee.add(Emp1);
      EmployeeDto Emp2=new EmployeeDto();
        Emp2.setName("aya");
        Emp2.setPassword("1234");
        Emp2.setAge(12);
        Emp2.setGender("female");
        Emp2.setId(2000);
        Emp2.setJob("employeer");
        employee.add(Emp2);
   
return employee;}    


static  ItemBao items (){
    ItemBao item=new ItemBaoFactory().newobject();
     ItemDto it=new ItemDto();
     it.setCatagory("food");
     it.setName("burger");
     it.setBarcood(1000);
     it.setQuntity(20);
     it.setPrice(120.5);
     ItemDto it1=new ItemDto();
     it1.setCatagory("food");
     it1.setName("cpsiy");
     it1.setBarcood(3000);
     it1.setQuntity(100);
     it1.setPrice(5);
ItemDto it2=new ItemDto();
     it2.setCatagory("clean");
     it2.setName("percil");
     it2.setBarcood(4000);
     it2.setQuntity(80);
     it2.setPrice(120.5);
ItemDto it3=new ItemDto();
     it3.setCatagory("clean");
     it3.setName("soap");
     it3.setBarcood(5000);
     it3.setQuntity(50);
     it3.setPrice(120.5);
     item.add(it);
     item.add(it1);
     item.add(it2);
     item.add(it3);
return item;
     
     
     
}


}
