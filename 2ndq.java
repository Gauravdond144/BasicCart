import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius");
         try{
        float radius = sc.nextInt();
        if(radius >0){
        float area = (float) 3.142f*radius*radius;
        float circumference = (float) 2*3.142f*radius;
        System.out.format("Double Number: %.4f\n", area);
        System.out.format("Double Number: %.4f", circumference);  
        }else{
            System.out.println(-1);
        }
        } catch(Exception e){
            System.out.println(-1);
        }
        
    }
}
