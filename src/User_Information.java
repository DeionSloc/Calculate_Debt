public class User_Information {
    private double rate;
    private double balance;
    private double principal;
    private int years;
    private double extra;

    public void setExtra(double extra){
        this.extra = extra;
    }

    public double getExtra(){
        return extra;
    }

    public void setYears(int years){
        this.years = years;
    }

    public int getYears(){
        return years;
    }

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

    public double getMinimumPayment() {
        double monthlyInterest = rate / 1200;
        double minimumPayment = principal * monthlyInterest /
        (1 - 1 / Math.pow(1 + monthlyInterest, years * 12));
        return minimumPayment; 
    }

    public double getTotalPayment(){
        double totalPayment = getMinimumPayment() * 12 * years;
        return totalPayment;
    }

    public double getExtraPayment(){
        double extraPayment = balance - (getMinimumPayment() + extra);
        return extraPayment;
    }

    @Override
    public String toString(){
        return "This is your rate: " + getRate() + "% this is your monthly payment: $"
                + String.format("%.02f", getMinimumPayment()) + " this is the remaining balance: $" + getBalance() +
                " and this is the principal: $" + getPrincipal() + " this is the total amount you will pay over the life of the loan: $" + String.format("%.02f", getTotalPayment());
    }
}
