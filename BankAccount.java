public class BankAccount extends Investment {
  private String bankName;
  private String accountNumber;

  BankAccount(){
    accountNumber = "none";
  }

  BankAccount(String name, String bankName, String accountNumber){
    super(name);
    setAccountNumber(accountNumber);
  }

  public String getBankName(){
    return bankName;
  }

  public void setBankName(String bankName){
    this.bankName = bankName;
  }

  public String getAccountNumber(){
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber){
    this.accountNumber = accountNumber;
  }

  public void print(){
    super.print();
    System.out.println("Account Number: " + accountNumber);

  }

}
