package Task4;

public class EmployeeTask {
    public static void main(String[] args) {
        PaymentCalculator paymentCalculator = new PaymentCalculator();
        Employee employee = new Employee( "Mirosław", "Long" , 5000 );
        Employee employee1 = new Employee( "WIesław", "Short" , 1000 );
        double v = paymentCalculator.nettoYearPayment( employee );
        System.out.println(v);
        double v1 = paymentCalculator.bruttoYearPaymant( employee1 );
        System.out.println(v1);
    }
}
