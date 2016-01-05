
public class MainImplementation 
{
	
	public static void main(String args[])
		
		{
			
	Item item = new Item();
	
	int price = item.getPrice();
	
	
	
	
	EComsite flipkart = new DebitCard();
	EComsite flipkart1 = new CreditCard();
	EComsite flipkart2 = new COD();
	EComsite flipkart3 = new NetBanking();
	
	
	flipkart.choosePaymentMethod();
	flipkart.makePayment(price);
	
	System.out.println();
	
	flipkart1.choosePaymentMethod();
	flipkart1.makePayment(price);
	
	System.out.println();
	
	flipkart2.choosePaymentMethod();
	flipkart2.makePayment(price);
	
	System.out.println();
	
	flipkart3.choosePaymentMethod();
	flipkart3.makePayment(price);
	
}}
