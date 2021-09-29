/**
 * @Author 毛嘉辉
 * @date 2021 09 22 13 10
 */
public class ForWhile {

  public static void main(String[] args) {
    int num = 0;
    for (int j = 0; j <= 100; j++) {
      num = num + j;
    }
    System.out.println(num);

    int i = 1;
    int number = 0;
    while (i <= 100) {
      number = i + number;
      i++;
    }
    System.out.println(number);
  }

}
