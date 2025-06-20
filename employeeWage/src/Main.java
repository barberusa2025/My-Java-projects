import java.text.NumberFormat;

public class Main {
    public static void main(String[] args) {
        var employee = new Employee(50_000, 20);
        Employee.printNumberOfEmployees();
        int wage = employee.calculateWage();

        // This will format wage into currency
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        System.out.println(currency.format(wage));


    }
}
