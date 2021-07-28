public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int amount = 1_000_000;
        double percent = 9.99;
        System.out.println(service.calculate(amount, percent, 1));
        System.out.println(service.calculate(amount, percent, 2));
        System.out.println(service.calculate(amount, percent, 3));
    }

}
