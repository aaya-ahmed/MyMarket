package employee.Dao;

import Item.ItemDto;
import employee.EmployeeDto;
import java.util.ArrayList;

public class EmployeeImpDao implements EmployeeDao{
ArrayList <EmployeeDto> EmployeeList =new ArrayList();
        String return_value="null";
    @Override
    public String add(EmployeeDto employee) {  
        EmployeeList.add(employee);
   return "done";
    }
   
    

    @Override
    public String  delete(int id) {
for(EmployeeDto m :EmployeeList){
if(m.getId()==id){
EmployeeList.remove(m);
return_value="done";
}
else{return_value="he/she is not found";}
   }
return return_value;}

    @Override
    public void edit(EmployeeDto employee, int id) {
for(EmployeeDto m :EmployeeList){
if(m.getId()==id){
EmployeeList.remove(m);
EmployeeList.add(employee);
}
    }
    }

    @Override
    public EmployeeDto print(int id) {
        EmployeeDto employeeinfo=null;
for(EmployeeDto EmployeeSearch :EmployeeList){
if(EmployeeSearch.getId()==id){
employeeinfo=EmployeeSearch;}
    }
return employeeinfo;
    }
  public ArrayList printall(){
  return EmployeeList; 
  }  

    @Override
    public boolean login(int id, String password, String job) {
boolean search =false;
for(EmployeeDto EmployeeSearch :EmployeeList){
if(EmployeeSearch.getId()== id&&
       EmployeeSearch.getPassword().equals(password)&&
        EmployeeSearch.getJob().equals(job)){
search=true;
}
}
    return search;} 
    
    public EmployeeDto profile(int id, String job) {
        EmployeeDto emp=new  EmployeeDto();
    for(EmployeeDto EmployeeSearch :EmployeeList){
    if(id==EmployeeSearch.getId()&&job.equals(EmployeeSearch.getJob())){
    emp.setAge(EmployeeSearch.getAge());
    emp.setGender(EmployeeSearch.getGender());
    emp.setId(EmployeeSearch.getId());
    emp.setJob(EmployeeSearch.getJob());
    emp.setName(EmployeeSearch.getName());
    emp.setPassword(EmployeeSearch.getPassword());
    }
    }
    return emp;
    }
    
}