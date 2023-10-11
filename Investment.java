abstract class Investment {
  private String name;
  private String type;
  protected double investmentValue;


  Investment()
  {
    name = "none";
    type = "none";
  }

  Investment(String name)
  {
    //this.type = type;
    this.name = name;
  }

  public void print()
  {
    System.out.print("Investment: Stock Name: " + name);
  }

  public void setName(String tempName){
    name = tempName;
  }

  public String getName(){
    return name;
  }

  public void setType(String tempType){
    type = tempType;
  }

  public String getType(){
    return type;
  }

  public void setInvestmentValue(double investmentValue) {
    this.investmentValue = investmentValue;
}

  public double getInvestmentValue(){
    return investmentValue;
  }

}