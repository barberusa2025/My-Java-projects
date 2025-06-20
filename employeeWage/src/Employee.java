public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public static int numberOfEmployees;

    // This is overloading the constructor
    public Employee(int baseSalary){
       this(baseSalary, 0);
    }

    // This is the constructor
    public Employee(int baseSalary, int hourlyRate){
        setBaseSalary(baseSalary);
        setHourlyRate(hourlyRate);
        numberOfEmployees++;
    }

    public static void printNumberOfEmployees(){

        System.out.println("Number of employees: " + numberOfEmployees);
    }

    // Calculate Wage formula and result
    public int calculateWage(int extraHours){
        return baseSalary + (extraHours * getHourlyRate());
    }

    // Method overloading
    // This is created in case of having extraHours = 0
    public int calculateWage(){
        return baseSalary;
    }

    // set and get BaseSalary
    private void setBaseSalary(int baseSalary){
        if (baseSalary <=0)
            throw new IllegalArgumentException("Base Salary cannot be 0 or negative");
        this.baseSalary = baseSalary;
    }

    private int getBaseSalary(){
        return baseSalary;
    }

    // set and get HourlyRate
    private int getHourlyRate() {
        return hourlyRate;
    }

    private void setHourlyRate(int hourlyRate) {
        if (hourlyRate <0)
            throw new IllegalArgumentException("Hourly Rate cannot be 0 or negative");
        this.hourlyRate = hourlyRate;
    }

}
