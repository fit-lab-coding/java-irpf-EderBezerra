package fit.core;

public class IrpfCalculator {

    public static double calculateBaseSalary(double totalSalary) {
         var inss = totalSalary*0.11;
      
        return totalSalary-inss;
    }

    public static double calculateExemption() {
        return 1;
    }

    public static double calculateDiscount(double baseSalary) {
        return 1;
    }

    public static double calculateTaxLayer(double baseSalary) {
        return 1;
    }

    public static double calculateIrpf(double totalSalary) {
        return 1;
    }


    
}
