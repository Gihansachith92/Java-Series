package Exception_Handling;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b,c;
        try{
            System.out.println("enter 1st number : ");
            a = sc.nextInt();
            System.out.println("enter 2nd number : ");
            b=sc.nextInt();
            c=a/b;
            System.out.println("answer is : " + c);
        }
        catch (ArithmeticException e){
            System.out.println("can't divide by zero");
        }
        catch (InputMismatchException e){
            System.out.println("please enter integer value");
        }
        catch (Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("bye");
        }
    }
}
