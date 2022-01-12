package Classes.Homework1;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    public Employee(String name,int salary,int workHours,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHours=workHours;
        this.hireYear=hireYear;
    }
    public double tax(){
        if(this.salary<1000){
            return 0;
        }else
        return this.salary*0.03;

    }
    public double bonus(){
        if(this.workHours>40){
            return (workHours-40)*30;
        }else
        return 0;
    }
    public double raiseSalary(){
        if((2021-this.hireYear)<10){
            return this.salary*0.05;
        }
        else if((2021-this.hireYear)>=10 && (2021-this.hireYear)<20){
            return this.salary*0.10;
        }
        else 
            return this.salary*0.15;
        }

    public void info(){
        System.out.println("Name: "+this.name);
        System.out.println("Salary: "+this.salary);
        System.out.println("Work Hour: "+this.workHours);
        System.out.println("Starting Year: "+this.hireYear);
        System.out.println("Tax: "+this.tax());
        System.out.println("Bonus: "+this.bonus());
        System.out.println("Raise Salary: "+raiseSalary());
        System.out.println("Salary with taxes and bonuses: " +(this.salary+this.bonus()-this.tax()));
        System.out.println("Total Salary: "+(salary+raiseSalary()));
    }    

    }





