import java.text.DecimalFormat;
import java.util.Scanner;

public class Exersize2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of dozens toys purchased : ");
		float x = scanner.nextFloat();
		System.out.println("Enter the prize per dozen :");
		float y = scanner.nextFloat();
		System.out.println("Enter the selling price of 1 toy");
		float z = scanner.nextFloat();
		float priceOfOnetoy = y/12;
		float profit = z - priceOfOnetoy;
		float percentprofit = profit/priceOfOnetoy *100;
		DecimalFormat decimalFormat = new DecimalFormat("#.##");
		System.out.println("Sams profit percentage is "+ decimalFormat.format(percentprofit) + " percent");
		
	}

}
