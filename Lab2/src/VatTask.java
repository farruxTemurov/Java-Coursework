import java.math.BigDecimal;
import java.math.RoundingMode;

public class VatTask {
    public static void runTask() {

        BigDecimal productCost = new BigDecimal("9.99");
        BigDecimal vatRate = new BigDecimal("0.05");
        int totalUnits = 10000;

        BigDecimal singleUnitVat = productCost.multiply(vatRate).setScale(2, RoundingMode.HALF_EVEN);

        BigDecimal totalNetSales = BigDecimal.ZERO;
        BigDecimal totalVatAmount = BigDecimal.ZERO;
        BigDecimal totalGrossValue = BigDecimal.ZERO;

        for (int i = 0; i < totalUnits; i++) {
            BigDecimal transactionNet = productCost;
            BigDecimal transactionVat = transactionNet.multiply(vatRate).setScale(2, RoundingMode.HALF_EVEN);
            BigDecimal transactionGross = transactionNet.add(transactionVat);

            totalNetSales = totalNetSales.add(transactionNet);
            totalVatAmount = totalVatAmount.add(transactionVat);
            totalGrossValue = totalGrossValue.add(transactionGross);
        }

        System.out.println("Single Unit VAT: " + singleUnitVat);
        System.out.println("----------------------------------------");
        System.out.println("Total Net Sales Value: " + totalNetSales);
        System.out.println("Total VAT Amount: " + totalVatAmount);
        System.out.println("Total Gross Value: " + totalGrossValue);

        System.out.println("=====================================\n");
    }
}
