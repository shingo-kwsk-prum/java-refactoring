// 問3.以下のクラスを適切に分割してください。

// ユーザー管理

import java.util.ArrayList;
import java.util.List;

public class UserService {

  private final UserMapper userMapper;

  // コンストラクタ
  public UserService(UserMapper userMapper) {
    this.userMapper = userMapper;
  }

  // ユーザー一覧取得
  public List<User> getActiveUsers() {
    List<User> users = userMapper.findAll();
    List<User> result = new ArrayList<>();

    for (User user : users) {
      if (!user.isDeleted()) {
        result.add(user);
      }
    }
    return result;
  }

  // ユーザー退会
  public void deactivateUser(Long userId) {
    User user = userMapper.findById(userId);
    if (user == null) {
      throw new IllegalArgumentException("存在しません");
    }

    user.setDeleted(true);
    userMapper.update(user);
  }

  // メール存在チェック
  public boolean existsByEmail(String email) {
    return userMapper.findByEmail(email) != null;
  }
}

