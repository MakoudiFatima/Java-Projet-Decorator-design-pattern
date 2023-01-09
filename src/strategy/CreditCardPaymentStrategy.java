package strategy;

public class CreditCardPaymentStrategy implements PaymentStrategy
{

  public void pay( String amount )
  {
    System.out.println("Customer pays the money " + amount + "DH. using Credit Card");
  }

}