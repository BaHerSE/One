import java.util.Scanner;

/**
 * @Author 毛嘉辉
 * @date 2021 09 23 10 10
 */
public class ArrayDemo {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] a = new String[]{"美国队长", "绿巨人", "蜘蛛侠", "金刚狼", "迪迦奥特曼", "黑寡妇", "蝙蝠侠", "死侍", "小丑",
        "企鹅人"};
    // String s = sc.nextLine();
    // if (s.equals("s")) {
    //   for (int i = 0; i < 5; i++) {
    //     for (int j = 0; j < 10; j++) {
    //       System.out.println(a[j]);
    //     }
    //   }
    // }
    // String start = sc.nextLine();
    //
    // if (start.equals("s")) {
    //   System.out.println("输出姓名");
    //
    // } else {
    //   System.out.println("请输入s开始");
    // }

    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < i + 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    double sum = 0;
    for (float i = 1; i <= 100; i++) {
      if (i % 2 > 0) {
        sum = sum + 1 / (i);
      } else {
        sum = sum - (1 / i);
      }
    }
    System.out.println(sum);
  }
}
