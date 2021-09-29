import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @Author 毛嘉辉
 * @date 2021 09 20 10 02
 */
public class Triangle {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();
    double[] sjx = new double[]{a, b, c};
    Arrays.sort(sjx);
    if (a + b > c && a + c > b && c + b > a
        && Math.pow(sjx[0], 2) + Math.pow(sjx[1], 2) == Math.pow(sjx[2], 2)) {
      System.out.println("直角三角形三条边为" + a + "," + b + "," + c + "," + "面积是" + sjx[0] * sjx[1] * 0.5);
    } else {
      System.out.println("不是直角三角形");
    }
  }
}
