import java.util.Scanner;
public class Principal{
    public static void main(String[] args) {
        Scanner entry = new Scanner(System.in);
        System.out.println("Insert first number");
        int a = entry.nextInt();
        System.out.println("Insert second number");
        int b = entry.nextInt();
        
        int c = a*b;
        System.out.println("The answer is : "+c);
    }    
}
   
