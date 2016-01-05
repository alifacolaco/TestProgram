
public class CreditCard implements EComsite{
	
	public void choosePaymentMethod()
	{
		System.out.println("Choose Payment Method -- Credit Card");
	}
	
	public void makePayment(int price)
	{
		System.out.println("Payment made by Crebit Card: Rs."+price);
	}

}
