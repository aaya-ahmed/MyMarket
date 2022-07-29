package employee.Bao;

import employee.EmployeeDto;
import java.util.ArrayList;

public interface EmployeeBao {
public String add(EmployeeDto employee);
public String delete(int id);
public void edit(EmployeeDto employee,int id);
public EmployeeDto print(int id);
public ArrayList printall();
public EmployeeDto profile(int id, String job) ;
public boolean login(int id,String password ,String job);
}
