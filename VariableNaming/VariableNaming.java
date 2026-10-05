// 問2.以下の不適切な変数名を修正してください。
public class VariableNaming {

  public void calculateNumbers() {
    /*
     * パターン1：camelCase記法
     */
    int firstNumber = 10;
    int secondNumber = 20;

    /*
     * パターン2：aやxだと検索しずらいので変更
     */
    int thirdNumber = 5;
    int fourthNumber = 3;

    /*
     * パターン3：予約語なので変更
     */
    int fifthNumber = 100;

    int total_result = firstNumber + secondNumber;
    int sum = thirdNumber + fourthNumber + fifthNumber;

    System.out.println(total_result);
    System.out.println(sum);
  }
}
