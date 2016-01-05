
public class DebitCard implements EComsite {
	
	public void choosePaymentMethod()
	{
		System.out.println("Choose Payment Method -- Debit Card");
	}
	
	public void makePayment(int price)
	{
		System.out.println("Payment made by Debit Card: Rs."+price);
	}
}
