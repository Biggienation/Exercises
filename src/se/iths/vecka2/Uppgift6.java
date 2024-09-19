package vecka2;

import java.time.LocalDate;

public class Uppgift6 {
    public static void main(String[] args) {
        LocalDate start = LocalDate.of(2004,2,4);
        LocalDate end = LocalDate.of(2014,5,5);
        Employee allan = new Employee("allan",3500, start);
        System.out.println(allan.getStartDate());
        allan.employtmentTime();
        allan.employmentTime(end);
        allan.employmentTime("2004-05-06");
        System.out.println("Days: " + allan.emloymentTimeDays(LocalDate.parse("2013-09-10")));
        System.out.println(allan.getSalary()); // should print 3500
        allan.setSalary(4000);
        System.out.println(allan.getSalary());

    }
}
