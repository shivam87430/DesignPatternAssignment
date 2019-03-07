package Questions.question8;

import java.util.Scanner;

class Admin{
    private String password;

    public Admin(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

interface AdminAccessing{
    void getAccess();
}

class Student implements AdminAccessing{
    String name;
    Admin admin;

    public Student(String name, Admin admin) {
        this.name = name;
        this.admin = admin;
    }

    @Override
    public void getAccess() {
        System.out.println("student name is : "+name);
    }
}

class StudentProxy extends Student{

    public StudentProxy(String name, Admin admin) {
        super(name, admin);
    }

    public void getAccess() {
        System.out.println("Admin Enter Password");
        Scanner scanner=new Scanner(System.in);
        String password=scanner.next();
        if(!admin.getPassword().equals(password)){
            System.out.println("you can not access to Student");
        }else{
            System.out.println("you can access to Student");
            super.getAccess();
        }
    }
}
public class ProxyDesignPattern {
    public static void main(String[] args) {
        Student student=new Student("shivam",new Admin("Shivam"));
        StudentProxy studentProxy=new StudentProxy("Shivam",new Admin("shivam"));
        studentProxy.getAccess();
    }


}
