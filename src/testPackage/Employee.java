package testPackage;

public class Employee extends Object{
    private String name;
    private int age;

    public void setName(String name){
        this.name = name;
    }

    public Employee(String name, int age){
        this.name = name;
    }

    @Override
    public String toString(){
        return name;
    }

    @Override
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        Employee x = (Employee) obj;
        if(this.name.equals(x.name) || this.age == x.age){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return age;
    }
}
