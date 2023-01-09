package strategy;

public class PaymentContext
{
 private PaymentStrategy paymentStrategy;

 public void setPaymentStrategy(PaymentStrategy strategy)
 {
  this.paymentStrategy = strategy;
 }

 public PaymentStrategy getPaymentStrategy()
 {
  return paymentStrategy;
 }

 public void pay(String amount)
 {
  paymentStrategy.pay(amount);
 }

}