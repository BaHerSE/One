import java.util.Scanner;

/**
 * @Author 毛嘉辉
 * @date 2021 09 23 18 20
 */
public class cai {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int ran = (int) (Math.random() * 100) + 1;
    int num = 0;
    while (true) {
      num++;
      int n = sc.nextInt();
      if (ran > n) {
        System.out.println("猜小了");
      } else if (ran < n) {
        System.out.println("猜大了");
      } else {
        System.out.println("猜对了,猜了"+num);
        break;
      }
    }
  }
}
