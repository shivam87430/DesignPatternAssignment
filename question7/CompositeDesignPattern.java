package Questions.question7;

import java.util.ArrayList;
import java.util.List;

interface Employees{
    void showEmployeesDetails();
}

class Developer implements Employees{
    private String name;
    private String KnownLangauge;

    public Developer(String name, String knownLangauge) {
        this.name = name;
        KnownLangauge = knownLangauge;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKnownLangauge() {
        return KnownLangauge;
    }

    public void setKnownLangauge(String knownLangauge) {
        KnownLangauge = knownLangauge;
    }

    @Override
    public void showEmployeesDetails() {
        System.out.println("Developer{" +
                "name='" + name + '\'' +
                ", KnownLangauge='" + KnownLangauge + '\'' +
                '}');
    }

    @Override
    public String toString() {
        return "Developer{" +
                "name='" + name + '\'' +
                ", KnownLangauge='" + KnownLangauge + '\'' +
                '}';
    }
}

class Manager implements Employees{Developer developer1=new Developer("Shivam","java");
    Developer developer2=new Developer("Sanjeev","python");

    DeveloperEmployee developerEmployee=new DeveloperEmployee();

    private String name;
    private String type;

    public Manager(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}';
    }

    @Override
    public void showEmployeesDetails() {
        System.out.println("Manager{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                '}');
    }
}


class DeveloperEmployee implements Employees{
    List<Employees> employeesdeveloper=new ArrayList<>();
    @Override
    public void showEmployeesDetails() {
        System.out.println("Developers Details");
        employeesdeveloper.forEach((e)->e.showEmployeesDetails());
    }
}

class ManagerEmployee implements Employees{
    List<Employees> employeesmanager=new ArrayList<>();
    @Override
    public void showEmployeesDetails() {
        System.out.println("Manager Details");
        employeesmanager.forEach((e)->e.showEmployeesDetails());
    }
}

public class CompositeDesignPattern {
    public static void main(String[] args) {
        Developer developer1=new Developer("Shivam","java");
        Developer developer2=new Developer("Sanjeev","python");

        Manager manager1=new Manager("Arzoo","H.R");
        Manager manager2=new Manager("Raghav","Senior Manager");

        DeveloperEmployee developerEmployee=new DeveloperEmployee();
        developerEmployee.employeesdeveloper.add(developer1);
        developerEmployee.employeesdeveloper.add(developer2);
        developerEmployee.showEmployeesDetails();

        ManagerEmployee managerEmployee=new ManagerEmployee();
        managerEmployee.employeesmanager.add(manager1);
        managerEmployee.employeesmanager.add(manager2);
        managerEmployee.showEmployeesDetails();

    }

}
