package salesreport;

import java.util.Scanner;

public class SalesReport{

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        String[] productNames = {
            "Cozy Nights Monarch",
            "Restonic Barbados",
            "Sealy Phuket"
        };

        int[][] sales = new int[3][3];

        for (int i = 0; i < productNames.length; i++) {

            for (int j = 0; j < 3; j++) {

                System.out.print("Enter number of sales for month "
                        + (j + 1) + " for " + productNames[i] + ": ");

                sales[i][j] = input.nextInt();
            }

            System.out.println();
        }

        Product product = new Product(productNames, sales);

        PrintProduct report = new PrintProduct(product);

        System.out.println("\nPRODUCT SALES REPORT - 2026");
        System.out.println("*************************************");

        report.PrintTotalProductSales();
        report.PrintAverageProductSales();
        report.PrintMostPopularProduct();

        input.close();
    }
}