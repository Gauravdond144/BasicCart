import java.util.Scanner;

public class Excercise3 {
public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter price of first item :");
	float item1 = scanner.nextFloat();
	System.out.println("Enter price of second item :");
	float item2 = scanner.nextFloat();
	System.out.println("Enter discount percentage :");
	float percentagedisc = scanner.nextFloat();
	float total = item1+item2;
	System.out.println("Total amount : "+total);
	float discount = (total/100) * percentagedisc;
	System.out.println("Discounted amount :"+ (total-discount));
	System.out.println("Saved amount : " + discount);
	
	
	
}
}
