// 問1.以下の不適切なメソッド名を修正してください。
public class AssignmentTask {

  /*
   * パターン1：userMessageだと何をしているか明確に分かりづらく、指す範囲が広いから変更。
              Helloなので挨拶の処理がわかるgreetUserへ
   */
  public void greetUser(User user) {
    System.out.println("Hello, " + user.getName());
  }

  /*
   * パターン2：元の名前は長く読みづらいので、詳細に書くのではなく目的がわかる簡潔な名前に変更
   */
  public void printGreeting(User user) {
    System.out.println("Hello, " + user.getName());
  }

  /*
   * パターン3：processだと何を処理するかわからないので変更
   */
  public void printUserName(User user) {
    System.out.println(user.getName());
  }

  /*
   * パターン4：userNameだけだと何をするかわからないので変更
   */
  public String getUserName(User user) {
    return user.getName();
  }

  /*
   * パターン5: camelCase記法へ変更
   */
  public void printUserInfo(User user) {
    System.out.println(user.getName());
  }

  /*
   * パターン6：newは予約語なので変更
   */
  public User createUser(String name) {
    return new User(name);
  }

  /*
   * パターン7：メソッド名が命題を表すように命名する
   */
  public boolean isActive(User user) {
    return user.isActive();
  }

}