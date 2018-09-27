package pkgQuizTwo;

public class QuizTwo {
	
	private double CarCost;
	private double DownPayment;
	private double LengthOfLoan;
	private double InterestRate;
	
	public QuizTwo(double CarCost, double DownPayment, double LengthOfLoan, double InterestRate)
	{
		this.CarCost = CarCost;
		this.DownPayment = DownPayment;
		this.LengthOfLoan = LengthOfLoan;
		this.InterestRate = InterestRate;
	}
	
	public double monthlyPayment()
	{
		double ratePerMonth = InterestRate/12.0;
		double principleAmount = CarCost-DownPayment;
		double principleAmountRate = ratePerMonth*principleAmount;
		double monthlyCarPayment = principleAmountRate/(1-Math.pow(1+ratePerMonth, -1*LengthOfLoan));
		monthlyCarPayment = Math.round(monthlyCarPayment*100.0)/100.0;
		return monthlyCarPayment;
	}
	
	public double totalOnInterest()
	{
		double ratePerMonth = InterestRate/12.0;
		double principleAmount = CarCost-DownPayment;
		double principleAmountRate = ratePerMonth*principleAmount;
		double monthlyCarPayment = principleAmountRate/(1-Math.pow(1+ratePerMonth, -1*LengthOfLoan));
		double totalInterest = (monthlyCarPayment*LengthOfLoan) - principleAmount;
		totalInterest = Math.round(totalInterest*100.0)/100.0;
		return totalInterest;
	}
}
