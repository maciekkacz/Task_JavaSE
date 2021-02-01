package Task4;

public class PaymentCalculator {
    private static final double MONTHLY_SOCIAL_SECURITY = 0.0976;
    private static final double MONTHLY_DISABILITY_INSURANCE = 0.0150;
    private static final double MONTHLY_MEDICAL_INSURANCE = 0.0245;

    public  double nettoYearPayment(Employee employee){
        double salary = employee.getSalary() * 12;

        return salary;
    }

    public double bruttoYearPaymant(Employee employee) {
        double salary = employee.getSalary();
        double v = salary * MONTHLY_MEDICAL_INSURANCE;
        double v1 = salary * MONTHLY_DISABILITY_INSURANCE;
        double v2 = salary * MONTHLY_SOCIAL_SECURITY;
        double vx = salary - v - v1 -v2;
        double vxx = vx * 12;
        return vxx;
    }


}
