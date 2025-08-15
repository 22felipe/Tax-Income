package entities;

public class Company extends TaxPayer{

    private int employees;

    public Company(double anualIncome, String name, int employees) {
        super(anualIncome, name);
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
