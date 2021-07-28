public class CreditPaymentService {
    public static int calculate(int amount, double percent, int duration) {
        double monthPercent = percent / 100 / 12;
        int monthFee = (int) (amount * (monthPercent + monthPercent / (Math.pow(monthPercent + 1, duration * 12) - 1)));

        return monthFee;
    }
}
