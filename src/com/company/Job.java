package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Job {

    ArrayList<Employer> list = new ArrayList<Employer>();

    void main() {

        list.add(new Employer("Вася", 220, true, 0));
        list.add(new Employer("Максим", 50000, false, 0));
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).isPerHour) {
                list.get(i).setSalaryPerMonth(salaryPerH(list.get(i).salary));
            } else {
                list.get(i).setSalaryPerMonth(salaryPerM(list.get(i).salary));
            }
        }
        Collections.sort(list, new Comparator<Employer>() {
            @Override
            public int compare(Employer o1, Employer o2) {
                return (int) o1.getSalaryPerMonth();
            }
        });
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).name + " " + list.get(i).salary + " " + list.get(i).salaryPerMonth + " "  );
        }
    }

    double salaryPerH(double salary) {
        salary = 20.8 * 8 * salary;
        return salary;
    }

    double salaryPerM(double salary) {
        return salary;
    }


}



