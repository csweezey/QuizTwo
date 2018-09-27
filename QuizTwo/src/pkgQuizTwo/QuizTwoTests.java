package pkgQuizTwo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class QuizTwoTests {

	@Test
	public void monthlyPaymentTest() 
	{
		double CarCost=35000;
		double DownPayment=0;
		double LengthOfLoan=60.0;
		double InterestRate=.10;
		QuizTwo monthlypay = new QuizTwo(CarCost, DownPayment, LengthOfLoan, InterestRate);
		assertEquals(743.65, monthlypay.monthlyPayment(), 0);
	}
	
	@Test
	public void monthlyPaymentTest2() 
	{
		double CarCost=48000;
		double DownPayment=2000;
		double LengthOfLoan=72;
		double InterestRate=.045;
		QuizTwo monthpay = new QuizTwo(CarCost, DownPayment, LengthOfLoan, InterestRate);
		assertEquals(730.21, monthpay.monthlyPayment(), 0);
	}
	
	@Test
	public void monthlyPaymentTest3()
	{
		double CarCost=70000;
		double DownPayment=13000;
		double LengthOfLoan=36;
		double InterestRate=.0875;
		QuizTwo monthpayment = new QuizTwo(CarCost, DownPayment, LengthOfLoan, InterestRate);
		assertEquals(1805.96, monthpayment.monthlyPayment(), 0);		
	}
	
	@Test
	public void totalOnInteretTest()
	{
		double CarCost=35000;
		double DownPayment=0;
		double LengthOfLoan=60.0;
		double InterestRate=.10;
		QuizTwo interestTotal = new QuizTwo(CarCost, DownPayment, LengthOfLoan, InterestRate);
		assertEquals(9618.79, interestTotal.totalOnInterest(), 0);
	}
	
	@Test
	public void totalOnInterestTest2()
	{
		double CarCost=48000;
		double DownPayment=2000;
		double LengthOfLoan=72;
		double InterestRate=.045;
		QuizTwo totalintrst = new QuizTwo(CarCost, DownPayment, LengthOfLoan, InterestRate);
		assertEquals(6574.79, totalintrst.totalOnInterest(), 0);
	}
	
	@Test
	public void totalOnInterestTest3()
	{
		double CarCost=70000;
		double DownPayment=13000;
		double LengthOfLoan=36;
		double InterestRate=.0875;
		QuizTwo totalIntrst = new QuizTwo(CarCost, DownPayment, LengthOfLoan, InterestRate);
		assertEquals(8014.56, totalIntrst.totalOnInterest(), 0);
	}
}
