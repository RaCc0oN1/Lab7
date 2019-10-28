package com.company;

public class Employer {
    String name;
    int salary;
    boolean isPerHour;
   double salaryPerMonth;

    Employer(String name, int salary,boolean isPerHour, double salaryPerMonth) {
        this.name = name;
        this.salary = salary;
      this.isPerHour = isPerHour;
        this.salaryPerMonth = salaryPerMonth;
    }

    void setSalaryPerMonth(double salaryFromMethod){
        this.salaryPerMonth = salaryFromMethod;
    }

    Double getSalaryPerMonth(){
        return salaryPerMonth;
    }
}
