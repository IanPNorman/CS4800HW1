package HW1;

public class Driver {
	    public static void main(String[] args) {
	    	SalariedEmployee salariedEmployee1 = new SalariedEmployee("Joe", "Jones", "111-11-1111", 2500);
	        SalariedEmployee salariedEmployee2 = new SalariedEmployee("Renwa", "Chanel", "555-55-5555", 170);

	        HourlyEmployee hourlyEmployee1 = new HourlyEmployee("Stephanie", "Smith", "222-22-2222", 25, 32);
	        HourlyEmployee hourlyEmployee2 = new HourlyEmployee("Mary", "Quinn", "333-33-3333", 19, 47);

	        CommissionEmployee commissionEmployee1 = new CommissionEmployee("Nicole", "Dior", "444-44-4444", 0.15, 50000);
	        CommissionEmployee commissionEmployee2 = new CommissionEmployee("Mahnaz", "Vaziri", "777-77-7777", 0.22, 40000);

	        BaseEmployee basePlusCommissionEmployee = new BaseEmployee("Mike", "Davenport", "666-66-6666", 95000);

	    }
	}