import java.io.InputStreamReader;
import java.util.Scanner;

public class Lab1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y, z;
        System.out.println("Точка 1:");
        x = Integer.parseInt(scanner.next());
        y = Integer.parseInt(scanner.next());
        z = Integer.parseInt(scanner.next());
        Point3d point1 = new Point3d(x, y, z);
        System.out.println("Точка 2:");
        x = Integer.parseInt(scanner.next());
        y = Integer.parseInt(scanner.next());
        z = Integer.parseInt(scanner.next());
        Point3d point2 = new Point3d(x, y, z);
        System.out.println("Точка 3:");
        x = Integer.parseInt(scanner.next());
        y = Integer.parseInt(scanner.next());
        z = Integer.parseInt(scanner.next());
        Point3d point3 = new Point3d(x, y, z);
        System.out.println("S = " + computeArea(point1, point2, point3));
    }

    //Метод рассчитывает Площадь по формуле Герона
    public static double computeArea(Point3d p1, Point3d p2, Point3d p3) {
        if (p1.isEqual(p2) || p2.isEqual(p3) || p3.isEqual(p1)) {
            System.out.println("Одна из точек равна другой");
            return 0;
        } else {
            double a = p1.distanceTo(p2), b = p2.distanceTo(p3), c = p3.distanceTo(p1), polyP = (a + b + c) / 2;
            return Math.sqrt(polyP * (polyP - a) * (polyP - b) * (polyP - c));
        }
    }
}
