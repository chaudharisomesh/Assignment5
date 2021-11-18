package Learning.Assignment5;

public class EmployeeAndEmoloyeeDetails {

    int emp_id,salary;
    String name,Address,department,Email;

    public int getEmp_id(String s) {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    @Override
    public String toString() {
       return "Employee [employee id : "+emp_id +" ,Salary :"+salary+", Name :" +name+", Address: "+Address+", Deparment :"+department+ ", Email:"+Email+"]";
    }

    public static void main(String[] args) {
        EmployeeAndEmoloyeeDetails emp=new EmployeeAndEmoloyeeDetails();
        emp.setEmp_id(777);
        emp.setName("Somesh Chaudhari");
        emp.setDepartment("Full Stack Developer");
        emp.setSalary(1300);
        emp.setAddress("Mumbai , Maharastra");
        emp.setEmail("chaudahrisomesh127@gmail.com");
        System.out.println(emp);

        int salary=emp.getSalary();
        int increment=0;
        if ((salary>=1000) && (salary<=1500)){
            System.out.println("Old Salary :"+salary);
            increment+=(salary*2)/100;
            salary=salary+increment;
            emp.setSalary(salary);
            System.out.println("\n salary is increased \n");
            System.out.println(emp);
        }
        else if ((salary>=1500)&&(salary<=20000)){
            System.out.println("Old Salary :"+salary);
            increment+=(salary*5)/100;
            salary=salary+increment;
            emp.setSalary(salary);
            System.out.println("\n salary is increased \n");
            System.out.println(emp);
        }
        else {
            System.out.println("\n Salary is not incresemented\n");
            System.out.println(emp);
        }

    }


}
