import java.util.Scanner;
class RectangleDiagonal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double l, b, d;
        System.out.println("Enter length and breadth of rectangle");
        l = sc.nextDouble();
        b = sc.nextDouble();
        d = Math.sqrt(l * l + b * b);
        System.out.println("diagonal = \t" + d);
        sc.close();
    }
}