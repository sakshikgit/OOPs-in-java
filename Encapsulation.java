
// 


 // to understand this keyword
class Human
{
    private int age = 11;
    String name;

    public int getAge(){
        return age;

    }

    public void setAge(int a){
        age = a;
    }
}



public class Encapsulation {
    public static void main(String args[]){
        Human obj = new Human();
        // obj.age = 11;
        obj.getAge();
        obj.setAge(22);
        obj.name = "sahil";

    }
}
