public class Stock extends Investment{
  private double pricePerShare;
  private int numOfSharesOwned;
  private double dividendsEarnedToDate;
  private double currentDividend;
  private int additionalShares;
  private double totalValue;

  Stock(){
    super();
  }

  Stock(double pricePerShare, int numOfSharesOwned){
    super("Stock");
    setPricePerShare(pricePerShare);
    setNumberOfSharesOwned(numOfSharesOwned);
    setInvestmentValue(pricePerShare * numOfSharesOwned);
  }

  public double getPricePerShare(){
    return pricePerShare;
  }
  public void setPricePerShare(double pricePerShare){
    this.pricePerShare = pricePerShare;
  }

  public int getNumberOfSharesOwned(){
    return numOfSharesOwned;
  }

  public void setNumberOfSharesOwned(int numOfSharesOwned){
    this.numOfSharesOwned = numOfSharesOwned;
  }

  public void calcStockValue(double priceChange, double dividendPercent){
    pricePerShare += priceChange;
    currentDividend = (pricePerShare * dividendPercent)/100.0;
    dividendsEarnedToDate += currentDividend * numOfSharesOwned;
    
    if (priceChange > 0) {
      additionalShares = (int) (dividendsEarnedToDate / pricePerShare);
      numOfSharesOwned += additionalShares;
      dividendsEarnedToDate -= (additionalShares * pricePerShare);
  }
    
  totalValue = pricePerShare * numOfSharesOwned;
  setInvestmentValue(totalValue);
  }

  public void print(){
    super.print();
    System.out.println(" Price Per Share: " + pricePerShare 
                     + " Number of Shares: " + numOfSharesOwned + "\n"
                     + "Current Value: " + currentDividend 
                     + " Investment Earnings to date: " + dividendsEarnedToDate);
  }

}
