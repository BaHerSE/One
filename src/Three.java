import java.util.Scanner;

/**
 * @Author 毛嘉辉
 * @date 2021 09 22 08 04
 */
public class Three {

  public static void main(String[] args) {
    System.out.println("请输入性别，身高(m)，体重(kg)");
    Scanner sc = new Scanner(System.in);
    String sex = sc.nextLine();
    double height = sc.nextDouble();
    double weight = sc.nextDouble();

    double bmi = weight / Math.pow(height, 2);
    sc.close();
    if (sex.equals("男")) {
      if (bmi <= 20) {
        System.out.println("体重过轻");
      } else if (bmi > 20 && bmi <= 25) {
        System.out.println("体重正常");
      } else if (bmi > 25 && bmi <= 30) {
        System.out.println("超重");
      } else if (bmi > 30 && bmi < 35) {
        System.out.println("肥胖");
      } else if (bmi >= 35) {
        System.out.println("过度肥胖");
      }
    } else if (sex.equals("女")) {
      if (bmi <= 19) {
        System.out.println("体重过轻");
      } else if (bmi > 19 && bmi <= 24) {
        System.out.println("体重正常");
      } else if (bmi > 24 && bmi <= 29) {
        System.out.println("超重");
      } else if (bmi > 39 && bmi < 34) {
        System.out.println("肥胖");
      } else if (bmi >= 34) {
        System.out.println("过度肥胖");
      }
    } else {
      System.out.println("性别错误");
    }

  }
}
