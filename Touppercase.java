import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter a word: ");
        String s=sc.nextLine();
        String st=s.toUpperCase();
        System.out.println("The word in Upper case :" + st);
    }
}
