public class Task {
  public static void main(String[] args) {

    String str1 = "HelloWorld";
    String str2 = "Hello";
    String br = System.getProperty("line.separator"); //環境依存の無い改行コードの取得

    System.out.println(str1 + br);

    for (int i = 0; i < 15; i++) {
      if (i < 10) {
        System.out.println(str1);
      } else {
        System.out.println(str2);
      }
    }
  }
}
