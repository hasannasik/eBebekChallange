package eBebek;

public class Employee {
    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        setName(name);
        setSalary(salary);
        setWorkHours(workHours);
        setHireYear(hireYear);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getWorkHours() {
        return workHours;
    }

    public void setWorkHours(int workHours) {
        this.workHours = workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public void setHireYear(int hireYear) {
        this.hireYear = hireYear;
    }

    public double tax() {
        double tax = 0;
        if (getSalary() < 1000) {
            System.out.println("You don't pay taxes because of your salary");
            return tax;
        } else {
            return tax = getSalary() * 0.03;
        }


    }

    public double bonus() {
        double overtimeBonus = 0;
        if (getWorkHours() > 40) {
            return overtimeBonus = (getWorkHours() - 40) * 30;

        } else {
            return overtimeBonus;
        }

    }
    public double raiseSalary(int hireYear)
    {
        double raiseSsalary=0;
        if (2021-getHireYear()<10) {
            raiseSsalary=(getSalary()-tax()+bonus())*0.05;
        }
        else if (9<2021-getHireYear() && 2021-getHireYear()<20) {
            raiseSsalary = (getSalary() - tax() + bonus()) * 0.1;
        }
        else {
            raiseSsalary = (getSalary() -tax() + bonus()) * 0.15;
        }
        return raiseSsalary;
    }

    @Override
    public String toString() {
        return  "**Employee Information**"+"\n" +
                "Name=" + name + "\n" +
                "Salary=" + getSalary() +" TL \n"+
                "Work hours of week=" + getWorkHours() +" hours \n"+
                "Hire year=" + getHireYear() +" years \n"+
                "Tax =" + tax() + " TL \n"+
                "Overtime Bonus=" +bonus() +" TL \n"+
                "Salary raise ="+ raiseSalary(hireYear)+ " TL \n" +
                "Salary after taxes and bonuses="+(getSalary()+bonus()-tax())+" TL \n"+
                "Total salary=" +(getSalary()+bonus()+raiseSalary(hireYear)-tax()) +" TL \n"
                ;
    }


}

