import java.util.Scanner;

/**
 * @Author 毛嘉辉
 * @date 2021 09 22 13 02
 */
public class cj {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double s = sc.nextDouble();
    switch ((int) s / 10) {
      case 10:
      case 9:
        System.out.println("A");
        break;
      case 8:
        System.out.println("B");
        break;
      case 6:
      case 7:
        System.out.println("C");
        break;
      default:
        System.out.println("D");
    }
    if (s >= 90) {
      System.out.println("A");
    } else if (s >= 80 && s < 90) {
      System.out.println("B");
    } else if (s >= 60 && s < 80) {
      System.out.println("C");
    } else {
      System.out.println("D");
    }

  }
}
