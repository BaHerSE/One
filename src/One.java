import java.util.Iterator;
import java.util.Scanner;

/**
 * @Author 毛嘉辉
 * @date 2021 09 15 08 04
 */
public class One {

  public static void main(String[] args) {
    //输入姓名
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    st(name);

  }

  public static void st(String name) {
    System.out.println("* * * * * * * * * * * * * * * * *");
    System.out.println("* " + "   welcome to java ，" + name + "    *");
    System.out.println("* * * * * * * * * * * * * * * * *");
  }
}
