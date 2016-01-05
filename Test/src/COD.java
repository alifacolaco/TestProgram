
public class COD implements EComsite {

	@Override
	public void choosePaymentMethod() {
		// TODO Auto-generated method stub
		System.out.println("Choose Payment Method -- COD");
	}

	@Override
	public void makePayment(int price) {
		// TODO Auto-generated method stub
		System.out.println("Payment made by COD: Rs."+price);
	}

}
