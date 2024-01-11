package services;

public interface OnlinePaymentService {
	
	public static Double paymentFee(double amount) {
		return amount += amount * 0.01;
	}
	
	public static Double Interest(double amount, Integer months) {
		return amount += amount * 0.02 * months;
	}

}
