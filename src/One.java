import java.util.Iterator;
import java.util.Scanner;

/**
 * @Author 毛嘉辉
 * @date 2021 09 15 08 04
 */
public class One {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 输入姓名
    /*String name = sc.nextLine();
     st(name);*/

    // 温度
    /*int num = sc.nextInt();
    temperature(num);*/

    //周长
    double bj = sc.nextDouble();
    circleLong(bj);
    circleLong(bj);

    //面积
    circlemj(bj);
  }

  public static void st(String name) {
    System.out.println("* * * * * * * * * * * * * * * * *");
    System.out.println("* " + "   welcome to java ，" + name + "    *");
    System.out.println("* * * * * * * * * * * * * * * * *");
  }

  public static void temperature(int F) {
    int c = (F - 32) * 5 / 9;
    System.out.println(c);
  }

  public static void circleLong(double bj) {
    double zc = 2 * bj * 3.14;
    System.out.println(zc);
  }

  public static void circlemj(double bj) {
    double mj = 3.14 * bj * bj;
    System.out.println(mj);
  }
}
