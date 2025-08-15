package entities;

public class Company extends TaxPayer{


    private int employees;

    public Company( String name, double anualIncome, int employees) {
        super(name, anualIncome);
        this.employees = employees;
    }

    public int getEmployees() {
        return employees;
    }

    public void setEmployees(int employees) {
        this.employees = employees;
    }

    public double tax(){

        if(getEmployees() > 10){
            return getAnualIncome() * 0.14;
        }

        return getAnualIncome() * 0.16;
    }

}
