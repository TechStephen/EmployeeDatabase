public class employee {

    private String name;
    private int age;
    private double salary;
    private int id;

    // Default Constructor
    public employee(){

    }
    
    // Constructor to create employee
    public employee(String name, int age, double salary, int id){
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.id = id;
    }

    // function to return name
    public String getName(){    
        return name;
    }

    // function to return age
    public int getAge(){
        return age;
    }

    // function to return salary
    public double getSalary(){
        return salary;
    }

    // function to return id
    public int getID(){
        return id;
    }

    // function to print all information about employee
    public void printAll(){
        System.out.println("Name: " + name + " Age: " + age + " Salary: " + salary + " ID: " + id + "\n");
    }
}