public class Member {
    private String name;
    private int age;
    private float sal;
    void setData(String name,int age,float sal)
    {
        this.name = name;
        this.age = age;
        this.sal = sal;
    }
    void display()
    {
        System.out.println("Members Name: " +name);
        System.out.println("Members Age: " +age);
        System.out.println("Members Salary: "+sal);
    }
}