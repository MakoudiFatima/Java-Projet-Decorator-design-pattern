package strategy;

public class DebitCardPaymentStrategy implements PaymentStrategy
{

  public void pay(String amount)
  {
    System.out.println("Customer pays the money " +amount+ "DH. using Debit Card");
  }

}