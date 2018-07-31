public class Person {
    private String name;

    public String getName(){
        return name;
    }

    public Person(String userName){
        name = userName;
    }

    public void sayHello(){
        System.out.println();
    }

    public void setName(String newName){
        name = newName;
    }
}
