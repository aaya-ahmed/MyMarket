package employee.Bao;
public class EmployeeFactory{
public EmployeeBao returnobject(){
return new EmployeeImpBao();
}    
}
