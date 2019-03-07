package Questions.question4;

class Student{
    private String name;
    private int rollno;
    private int age;
    private int phonenumber;
    private String city;
    private String address;

    public Student(StudentBuilder studentBuilder){
        this.name=studentBuilder.getName();
        this.rollno=studentBuilder.getRollno();
        this.age=studentBuilder.getAge();
        this.phonenumber=studentBuilder.getPhonenumber();
        this.city=studentBuilder.getCity();
        this.address=studentBuilder.getAddress();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollno=" + rollno +
                ", age=" + age +
                ", phonenumber=" + phonenumber +
                ", city='" + city + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}

class StudentBuilder{
    private String name;
    private int rollno;
    private int age;
    private int phonenumber;
    private String city;
    private String address;

    public String getName() {
        return name;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public int getRollno() {
        return rollno;
    }

    public StudentBuilder setRollno(int rollno) {
        this.rollno = rollno;
        return this;
    }

    public int getAge() {
        return age;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public int getPhonenumber() {
        return phonenumber;
    }

    public StudentBuilder setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
        return this;
    }


    public String getCity() {
        return city;
    }

    public StudentBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public String getAddress() {
        return address;
    }

    public StudentBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public Student build(){
        return new Student(this);
    }
}

public class BuilderPatternExample {
    public static void main(String[] args) {
        Student student=new StudentBuilder()
                .setName("Shivam")
                .setRollno(1)
                .setAge(12)
                .setCity("agra")
                .setPhonenumber(123456789)
                .setAddress("xyz")
                .build();
        System.out.println(student);

        Student student1=new StudentBuilder()
                .setName("Satyam")
                .setRollno(2)
                .setAge(34)
                .setCity("lucknow")
                .setPhonenumber(987654321)
                .setAddress("abc")
                .build();
        System.out.println(student1);

    }
}
