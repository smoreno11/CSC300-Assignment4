public class SavingsAccount extends BankAccount{
  private double annualInterestRatePercent;
  private double rate;
  private double totalInterestEarned;
  private double interest;

  SavingsAccount(){
    super("SavingsAccount", "none","none");
  }

  SavingsAccount(String name, String accountNumber, double initialDeposit, double annualInterestRatePercent){
    super("SavingsAccount", "none","none");
    setInvestmentValue(initialDeposit);
    setAnnualInterestRatePercent(annualInterestRatePercent);
  }

  public double getAnnualInterestRatePercent(){
    return annualInterestRatePercent;
  }

  public void setAnnualInterestRatePercent(double annualInterestRatePercent){
    this.annualInterestRatePercent = annualInterestRatePercent;
    this.rate = annualInterestRatePercent / 12.0 / 100.0;
  }

  public double getTotalInterestEarned(){
    return totalInterestEarned;
  }

  public void setTotalInterestEarned(double totalInterestEarned){
    this.totalInterestEarned = totalInterestEarned;
  }

  public void makeDeposit(double deposit){
    setInvestmentValue(getInvestmentValue() + deposit);
  }

  public boolean makeWithdrawal(double withdrawal){
    if(getInvestmentValue() >= withdrawal){
      setInvestmentValue(getInvestmentValue() - withdrawal);
      return true;
    }
    else{
      System.out.println("Insufficient funds. Cannor withdrawal");
      return false;
    }
  }

  public void calcValue(){
    interest = getInvestmentValue() * rate;
    totalInterestEarned = totalInterestEarned + interest;
    setInvestmentValue(getInvestmentValue() + interest);
  }

  public void print(){
    super.print();
    System.out.print(" Current Value " + annualInterestRatePercent
                    + " Total  Interest Earned: " + totalInterestEarned);
  }

  

}
