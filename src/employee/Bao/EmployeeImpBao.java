package employee.Bao;

import employee.Dao.EmployeeDao;
import employee.Dao.EmployeeFactoryDao;
import employee.EmployeeDto;
import java.util.ArrayList;

public class EmployeeImpBao implements EmployeeBao{
private EmployeeDao employee=new EmployeeFactoryDao().returnobject();

    @Override
    public String add(EmployeeDto emp) {
return employee.add(emp);

    }

    @Override
    public String delete(int id) {
 return employee.delete(id);

    }

    @Override
    public void edit(EmployeeDto empl, int id) {
 employee.edit(empl,id);
    }

    @Override
    public EmployeeDto print(int id) {
  return employee.print(id);
    }

    @Override
    public ArrayList printall() {
return employee.printall();
    }

    @Override
    public boolean login(int id, String password, String job) {
return employee.login(id, password, job);
    }

    @Override
    public EmployeeDto profile(int id, String job) {
return employee.profile(id, job);
    }


    
  
}
