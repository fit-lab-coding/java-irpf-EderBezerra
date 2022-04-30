package fit;
import fit.core.IrpfCalculator;


/**
 * Hello wor
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Cálculo IRRF" );
        var totalSalary = 3000.00;
        var actualBaseSalary = IrpfCalculator.calculateBaseSalary(totalSalary);
        var actualDiscountValue = IrpfCalculator.calculateDiscount(actualBaseSalary);
        var actualTaxLayex = IrpfCalculator.calculateTaxLayer(actualBaseSalary);
        var actualIrpfValue = IrpfCalculator.calculateIrpf(totalSalary);
       
        System.out.println("Salário: "+totalSalary);
        System.out.println("Salário base: "+actualBaseSalary);
        
        System.out.println("Calcular desconto: ");
        System.out.println("Valor do desconto: "+actualDiscountValue);


        System.out.println( "Percentual de desconto" );
        System.out.println("Percentual: "+actualTaxLayex+"%");

        System.out.println("Calcular IRPF");
        System.out.println("Valor do IRPF: "+actualIrpfValue);
       




    }
}
