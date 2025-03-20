public class User_Information {
    private double rate;
    private double balance;
    private double principal;

    public void setRate(double rate){
        this.rate = rate;
    }

    public double getRate(){
        return rate;
    }

    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public double getPrincipal() {
        return principal;
    }

    public double getDailyInterest(){
        double dailyInterest = (rate / 365) * principal;
        return dailyInterest;
    }

    public double getRateConvert(){
        double rateConvert = rate / 100;
        return rateConvert;
    }

    public double getMonthlyInterest(){
        double monthlyInterest = (getRateConvert() / 12) * principal;
        return monthlyInterest; 
    }

    public double getPayment() {
        double minimumPayment = (principal * getRateConvert()) / 12;
        return minimumPayment;
    }

    @Override
    public String toString(){
        return "This is your rate: " + getRate() + "% this is your monthly payment: $"
                + String.format("%.02f", getPayment()) + " this is the remaining balance: $" + getBalance() +
                " and this is the principal: $" + getPrincipal() + ". And this is your monthly interest: $" + String.format("%.02f", getMonthlyInterest());
    }
}
