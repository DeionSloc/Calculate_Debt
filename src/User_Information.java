public class User_Information {
    private double rate;
    private double currentAmount;
    private double payment;
    private double principal;

//    public User_Information(double rate, double currentAmount, double payment, double initialAmount){
//        this.currentAmount = currentAmount;
//        this.payment = payment;
//        this.initialAmount = initialAmount;
//        this.rate = rate;
//    }

    public void setRate(double rate){
        this.rate = rate;
    }

    public double getRate(){
        return rate;
    }

    public void setCurrentAmount(double currentAmount){
        this.currentAmount = currentAmount;
    }

    public double getCurrentAmount() {
        return currentAmount;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public double getPrincipal() {
        return principal;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public double getPayment() {
        return payment;
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

    @Override
    public String toString(){
        return "This is your rate: " + getRate() + " this is your monthly payment: "
                + getPayment() + " this is the remaining balance: " + getCurrentAmount() +
                " and this is the principal: " + getPrincipal() + ". And this is your monthly interest: " + String.format("%.02f", getMonthlyInterest());
    }
}
