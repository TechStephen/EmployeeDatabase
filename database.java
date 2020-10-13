import java.util.*;
import java.util.Scanner;

public class database extends employee {

    boolean going = true;
    employee[] employees;

    // default constructor
    public database(){
        employees = new employee[10];
        employee e = new employee();
        run();
    }

    // runs database program
    public void run(){
        while(going == true){
            System.out.println("------Welcome to User Database-------");
            System.out.println("Would you like to do?: ");
            System.out.println("1.) Look Through Database");
            System.out.println("2.) Add User to Database");
            System.out.println("3.) Remove user from Database");
            System.out.println("4.) Return all Database Information");

            Scanner sc = new Scanner(System.in);
            int answer = sc.nextInt();

            if(answer == 1){
                if(employees[0] == null){
                    System.out.println("Database it empty.");
                } else {
                System.out.println("What would you like to look through?: ");
                System.out.println("1.) User Names");
                System.out.println("2.) User Ages ");
                System.out.println("3.) User Salaries");
                System.out.println("4.) User ID's");
                System.out.println("5.) Specified User");
                int response = sc.nextInt();
                if(response == 1){
                    printUserNames();
                    System.out.println("Enter specified entry(0,1,2...): ");
                    int ans = sc.nextInt();
                    printName(ans);
                } else if(response == 2){
                    printUserAges();
                    System.out.println("Enter specified entry(0,1,2...): ");
                    int ans = sc.nextInt();
                    printAge(ans);
                } else if(response == 3){
                    printSalaries();
                    System.out.println("Enter specified entry(0,1,2...): ");
                    int ans = sc.nextInt();
                    printSalary(ans);
                } else if(response == 4){
                    printIDs();
                    System.out.println("Enter specified entry(0,1,2...): ");
                    int ans = sc.nextInt();
                    printID(ans);
                } else if(response == 5){
                    printUserNames();
                    System.out.println("Enter specified entry(0,1,2...): ");
                    int ans = sc.nextInt();
                    printUserInfo(ans);
                } else {
                    System.out.println("Invalid Entry.");
                }
                }
            } else if (answer == 2){
                System.out.println("Insert user name: ");
                Scanner scc = new Scanner(System.in);
                String userName = scc.nextLine();
                
                System.out.println("Insert user age: ");
                int userAge = scc.nextInt();
                
                System.out.println("Insert user salary: ");
                double userSalary = scc.nextDouble();
                
                System.out.println("Insert user ID: ");
                int userID = scc.nextInt();
                addToDb(userName,userAge,userSalary,userID);
            } else if (answer == 3){
                if(employees[0] == null){
                    System.out.println("Database is empty.");
                } else {
                    printEmployees();
                    System.out.println("Which entry would you like to remove from Database?: ");
                    int response = sc.nextInt();
                    if(employees[response] == null){
                        System.out.println("Specified entry is empty.");
                    } else {
                        removeFromDb(response);
                    }
                }
            } else if (answer == 4){
                if(employees[0] == null){
                    System.out.println("Database is empty.");
                } else {
                    printEmployees();
                }
            } else {
                System.out.println("Error, invalid entry");
            }
        }    
    }

    // adds employee to database with specified parameters
    public void addToDb(String name, int age, double salary, int id){
        employee e = new employee(name,age,salary,id);
        addToDbArray(e);
        System.out.println("Added to Database.");
    }

    // removes specified num from database
    public void removeFromDb(int num){
        if(employees[num] != null){
            employees[num] = null;
        }
    }

    // adds new employee to database array 'employees'
    public void addToDbArray(employee e){
        int cnt = 0;
        for(int i = 0; i < employees.length; i++){
            if(employees[i] == null && cnt == 0){
                employees[i] = e;
                cnt++;
            }
        }
    }

    // prints specified index name
    public void printName(int num){
        System.out.println(employees[num].getName());
    }

    // prints specified index age
    public void printAge(int num){
        System.out.println(employees[num].getAge());
    }

    // prints specified index salary
    public void printSalary(int num){
        System.out.println(employees[num].getSalary());
    }


    // prints specified index id
    public void printID(int num){
        System.out.println(employees[num].getID());
    }

    // prints specified index user info
    public void printUserInfo(int num){
        employees[num].printAll();
    }

    // prints all user names
    public void printUserNames(){
        for(int i = 0; i < employees.length; i++){
            if(employees[i] != null){
                System.out.println(employees[i].getName());
            }
        }
    }

    // prints all user ages
    public void printUserAges(){
        for(int i = 0; i < employees.length; i++){
            if(employees[i] != null){
                System.out.println(employees[i].getAge());
            }
        }
    }

    // prints all user salaries
    public void printSalaries(){
        for(int i = 0; i < employees.length; i++){
            if(employees[i] != null){
                System.out.println(employees[i].getSalary());
            }
        }
    }


    // prints all user id's
    public void printIDs(){
        for(int i = 0; i < employees.length; i++){
            if(employees[i] != null){
                System.out.println(employees[i].getID());
            }
        }
    }


    // prints all employees and their information
    public void printEmployees(){
        for(int i = 0; i < employees.length; i++){
            if(employees[i] != null){
                employees[i].printAll();
            }
        }
    }
}