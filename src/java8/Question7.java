package java8;


/*
Create an Employee Class with instance variables (String) name,
 (Integer)age, (String)city and get the instance of the Class using constructor reference
 */
interface Emp{
    Employe getDetail(String name , int age , String city);
}
class Employe{
    private String name;
    private int age;
    private String city;

    public Employe(String name , int age , String city){
        this.name = name;
        this.age = age;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
public class Question7 {

    public static void main(String[] args) {
        Emp ee = Employe::new;
        Employe r= ee.getDetail("someh" , 23 , "Bihar");
        System.out.println("Your name is "+r.getName());
        System.out.println("your age is "+r.getAge());
        System.out.println("Your city is "+r.getCity());
    }
}