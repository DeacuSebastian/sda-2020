package lab3;
import java.util.*;

public class PaymentMethod {
	String type ;

	public String getType() {
		return type;
	}
	
	public PaymentMethod(String t) {
		this.type = t ;
	}
	
	void getPaymentMethod() 
    { 
	   System.out.println();	
       System.out.println("Cash sau card ?:"+getType());
    }

	public static void main(String[] args) {		
		Adress ad = new Adress("Codrul Cosminului","Brasov",55);
		ad.getFullAdress();
	
		Customer ct1 = new Customer("Deacu" , "Sebastian-Andrei" , 21);
		ct1.getCompleteName();
		
		Customer ct2 = new Customer("Soare" , "Anda" , 21 , ad);
		ct2.getCustomer();
		
		ct2.getAdress().getFullAdress();
		
		PaymentMethod pm = new PaymentMethod("Card");
		pm.getPaymentMethod();
		
		Customer ct3 = new Customer("Dumitru" , "Liviu" , 22 , ad ,pm);
		ct3.getCustomerWithPayment();

	}

}