package employee;

import javax.swing.JOptionPane;

public class EmployeeDto {
private String name , password,job ,gender ;
private int age,id;
  
    public void setGender(String gender) {
        if(gender.equals("")){
     JOptionPane.showMessageDialog(null,"please,choose the gender");
        }
        else{
        this.gender = gender;}
    }
  public String getGender() {
        return gender;
    }

   public void setName(String name) {
       if(name.equals("")){
   JOptionPane.showMessageDialog(null,"please, enter name");
       }
       else{
        this.name = name;}
   }
  
  public String getName() {
        return name;
    }

   

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        if(password.equals("")){
  JOptionPane.showMessageDialog(null,"please,enter the password");
        }
        else{
        this.password = password;}
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        if(job.equals("")){
 JOptionPane.showMessageDialog(null,"please,choose the job");
        }
        else{
        this.job = job;}
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>0){
        this.age = age;}
        else if (age<=0){
        JOptionPane.showMessageDialog(null,"age should be greater than zero,please");
        }
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id>0){
          this.id = id;}
        else if (id<=0){
        JOptionPane.showMessageDialog(null,"id should be greater than zero,please");
        }
     
    }

    @Override
    public String toString() {
        return "EmployeeDto{" + "name=" + name + ", password=" + password + ", job=" + job + ", gender=" + gender + ", age=" + age + ", code=" + id + '}';
    }

}
