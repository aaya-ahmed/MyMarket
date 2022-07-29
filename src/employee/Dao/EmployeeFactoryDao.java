package employee.Dao;
public class EmployeeFactoryDao {
 public EmployeeDao returnobject(){
 return new EmployeeImpDao();
 }   
}
