import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number");
        int a = sc.nextInt();
        System.out.println("Enter second number");
        int b = sc.nextInt();
        if(a>0 && b>0){
            System.out.println("SUM = "+ (a+b));
        }else{
            System.out.println(-1);
        }
    }
}
