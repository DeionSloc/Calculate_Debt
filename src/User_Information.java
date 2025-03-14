public class User_Information {
    private double rate;
    private double currentAmount;
    private double payment;
    private double initialAmount;

    public User_Information(double rate, double currentAmount, double payment, double initialAmount){
        this.currentAmount = currentAmount;
        this.payment = payment;
        this.initialAmount = initialAmount;
        this.rate = rate;
    }

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

    public void setInitialAmount(double initialAmount) {
        this.initialAmount = initialAmount;
    }

    public double getInitialAmount() {
        return initialAmount;
    }

    public void setPayment(double payment) {
        this.payment = payment;
    }

    public double getPayment() {
        return payment;
    }

    public String toString(){
        return "This is the user's rate: " + getRate() + " this is the user's monthly payment: "
                + getPayment() + " this is the user's current amount: " + getCurrentAmount() +
                " and this is the user's initial amount: " + getInitialAmount();
    }
}
