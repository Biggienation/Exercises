package vecka2;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;
import java.time.temporal.ChronoUnit;

public class Employee {
    private String name;
    private double salary;
    private final LocalDate startDate;

    public Employee(String name, double salary, LocalDate startDate) {
        if (name.isBlank())
            throw new IllegalArgumentException("Name cannot be blank");
        this.name = name;
        this.salary = salary;
        this.startDate = startDate;
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

    public LocalDate getStartDate() {
        return startDate;
    }

    public void employtmentTime (){
        LocalDate now = LocalDate.now();
        employmentTime(now);

    }

    public  void employmentTime (LocalDate endDate){
        Period period = Period.between(startDate,endDate);
        System.out.println("Years: " + period.getYears());
        System.out.println("Months: " + period.getMonths());
        System.out.println("Days: " + period.getDays());
    }

    public void employmentTime (String endDate){
        try {
            employmentTime(LocalDate.parse(endDate));
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date: " + endDate);
        }
    }

    public int emloymentTimeDays (LocalDate endDate){
        return (int) startDate.until(endDate, ChronoUnit.DAYS );

    }

// sout should bhe handled in another class like a console class instead of the class that handles the calculations
}
