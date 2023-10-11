public class CheckingAccount extends BankAccount{
  private double annualInterestRatePercent;
  private double rate;
  private double totalInterestEarned;
  private double miminumCheckFreeBalance;
  private double checkCharge;
  private double totalCheckChargers;
  private double interest;

  CheckingAccount(){
    super("Checking Account", "none", "none");
  }

  CheckingAccount(String name, String accountNumber, double initialDeposit,
  double annualInterestRatePercentage, double minimumCheckFreeBalance, double checkCharge){
    super("CheckingAccount",name,accountNumber);
    setInvestmentValue(initialDeposit);
    setAnnualInterestRatePercentage(annualInterestRatePercentage);
    setMinimumCheckFreeBalance(minimumCheckFreeBalance);
    setCheckCharge(checkCharge);
  }

  public void setAnnualInterestRatePercentage(double annualInterestRatePercent){
    this.annualInterestRatePercent = annualInterestRatePercent;
    this.rate = annualInterestRatePercent / 12.0 / 100.0;
  }

  public double getAnnualInterestRatePercentage(){
    return annualInterestRatePercent;
  }

  public void setTotalInterestEarned(double totalInterestEarned){
    this.totalInterestEarned = totalInterestEarned;
  }

  public double getTotalInterestEarned(){
    return totalInterestEarned;
  }
//minimumCheckFreeBalance, checkCharge and totalCheckCharges 
  public void setMinimumCheckFreeBalance(double miminumCheckFreeBalance){
    this.miminumCheckFreeBalance = miminumCheckFreeBalance;
  }

  public double getMinimumCheckFreeBalance(){
    return miminumCheckFreeBalance;
  }

  public void setCheckCharge(double checkCharge){
    this.checkCharge = checkCharge;
  }

  public double getCheckCharge(){
    return checkCharge;
  }

  public void setTotalCheckCharges(double totalCheckChargers){
    this.totalCheckChargers = totalCheckChargers;
  }

  public double getTotalCheckChargers(){
    return totalCheckChargers;
  }

  public void makeDeposit(double deposit){
    setInvestmentValue(getInvestmentValue() + deposit);
  }

  public void writeCheck(double checkValue){
    if(getInvestmentValue() < checkValue){
      System.out.println("Insufficient funds. Can't write a check");
    }
    else{
      if(getInvestmentValue() >= miminumCheckFreeBalance){
        setInvestmentValue(getInvestmentValue() - checkValue);
      }
      else{
          setInvestmentValue(getInvestmentValue()- checkValue - checkCharge);
          totalCheckChargers = totalCheckChargers + checkCharge;
        }
    }
  }

  public void calcValue(){
    if(getInvestmentValue() >= miminumCheckFreeBalance){
      interest = getInvestmentValue() * rate;
      totalInterestEarned = totalInterestEarned + interest;
      setInvestmentValue(getInvestmentValue() + interest);
    }
  }

  public void print(){
    super.print();
    System.out.println("Annual Interest Rate: " + annualInterestRatePercent
    + ", Minimum Check-Free Balance: " + miminumCheckFreeBalance
    + ", Check Charge: " + checkCharge
    + ", Total Check Charges: " + totalCheckChargers
    + ", Total Interest Earned: " + totalInterestEarned);

  }

}
