public class Bond extends Investment{
  
  private double pricePerBond;
  private double annualReturnPercentage;
  private double rate;
  private double cashEarnedToDate;
  private int numBondsOwned;
  private double totalValue;

  Bond(){
    super();
  }

  Bond(double pricePerBond, int numBondsOwned, double annualReturnPercentage){
    super("Bond");
    setPricePerBond(pricePerBond);
    setNumBondsOwned(numBondsOwned);
    setAnnualReturnPercentage(annualReturnPercentage);
    //This is probably wrong.
    setInvestmentValue(pricePerBond);
  }
  
  public double getPricePerBond(){
    return pricePerBond;
  }

  public void setPricePerBond(double pricePerBond){
    this.pricePerBond = pricePerBond;
  }

  public int getNumBondsOwned(){
    return numBondsOwned;
  }

  public void setNumBondsOwned(int numBondsOwned){
    this.numBondsOwned = numBondsOwned;
  }

  public double getAnnualReturnPercentage(){
    return annualReturnPercentage;
  }

  public void setAnnualReturnPercentage(double annualReturnPercentage){
    this.annualReturnPercentage = annualReturnPercentage;
    annualReturnPercentage = (rate/12)/100; 
  }

  public void calcBondValues(){
    cashEarnedToDate = cashEarnedToDate + pricePerBond;
    investmentValue = pricePerBond * numBondsOwned + cashEarnedToDate;
  }

  public void setInvestmentValue(double investmentValue){
    this.investmentValue = investmentValue;
  }

  public void print(){
    super.print();
    System.out.println("Price Per Share: " + pricePerBond + " Number of Shares: " + numBondsOwned +
                       "\n Current Value: " + totalValue + " Invest Earnings to date: " );

  }
}
