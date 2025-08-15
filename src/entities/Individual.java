package entities;

public class Individual extends TaxPayer{


    private double healthExpenditure;

    public Individual(String name, double anualIncome, double healthExpenditure) {
        super(anualIncome, name);
        this.healthExpenditure = healthExpenditure;
    }

    public double getHealthExpenditure() {
        return healthExpenditure;
    }

    public void setHealthExpenditure(double healthExpenditure) {
        this.healthExpenditure = healthExpenditure;
    }

    public double tax (){

        if( getAnualIncome() < 20000){
            return getAnualIncome() + getAnualIncome() * 0.15;
        }

        return getAnualIncome() * 0.25 - getHealthExpenditure() * 0.5;

    }


}
