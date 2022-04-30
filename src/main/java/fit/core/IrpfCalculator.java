package fit.core;

public class IrpfCalculator {

    public static double calculateBaseSalary(double totalSalary) {
         var inss = totalSalary*0.11;
         return totalSalary-inss;
    }

    public static double calculateExemption() {
        return 1903.98;
      
    }

    public static double calculateDiscount(double baseSalary) {
          
        return baseSalary - 1903.98;       
    }

    public static double calculateTaxLayer(double baseSalary) {
              
        if(baseSalary >= 1903.99 && baseSalary <= 2826.65 )
        {  return 0.075;   }
          else if(baseSalary >= 2826.66 && baseSalary <= 3751.05 )
        {  return 0.15;   }
          else if(baseSalary >= 3751.06 && baseSalary <= 4664.68 )
        {  return 0.225;  }
        else if(baseSalary >= 4664.68 )
        {  return 0.275; }
        else 
        { return 0;}   
        
    
    }

    public static double calculateIrpf(double totalSalary) {
           
        var salary =  totalSalary-(totalSalary*0.11);
        
        var vlr_isencao = salary -  1903.98;

        if(salary >= 1903.99 && salary <= 2826.65 )
        {  return vlr_isencao * 0.075;   }
          else if(salary >= 2826.66 && salary <= 3751.05 )
        {  return vlr_isencao * 0.15;   }
          else if(salary >= 3751.06 && salary <= 4664.68 )
        {  return vlr_isencao * 0.225;  }
        else if(salary >= 4664.68 )
        {  return vlr_isencao * 0.275; }
        else 
        { return 0;}   


        
    }


    
}
