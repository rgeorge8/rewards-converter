public class RewardValue {
    private double miles;
    private double cash;


    public RewardValue(int miles){
        this.miles = miles;
        this.cash = (miles*0.0035);
    }

    public RewardValue(double cash){
        this.cash = cash;
        this.miles = (cash/0.0035);
    }

    public double getMilesValue() {
        return miles;
    }

    public double getCashValue(){
        return cash;
    }

}
