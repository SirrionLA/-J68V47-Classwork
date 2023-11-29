import java.util.*;

public class l2e2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("What is the first number? ");
        int a = input.nextInt();
        System.out.print("What is the second number? ");
        int b = input.nextInt();

        System.out.println(a+"+"+b+"="+(a+b));
        System.out.println(a+"-"+b+"="+(a-b));
        System.out.println(a+"*"+b+"="+(a*b));
        System.out.println(a+"/"+b+"="+((float)a/(float)b));
        System.out.println(a+"%"+b+"="+(a%b));
        System.out.println(a+"^"+b+"="+Math.pow(a, b));


    }
}
