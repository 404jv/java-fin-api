package modules.accounts.repositories;

import java.util.ArrayList;

import modules.accounts.entities.User;

public class UsersRepository {
  private ArrayList<User> repository;
  private static UsersRepository INSTANCE;

  private UsersRepository() {
    this.repository = new ArrayList<User>();
  }

  public static UsersRepository getInstance() {
    if (UsersRepository.INSTANCE == null) {
      UsersRepository.INSTANCE = new UsersRepository();
    }

    return INSTANCE;
  }

  public void create(String name, String password, String cpf) {
    User user = new User(name, password, cpf);

    this.repository.add(user);
  }
}
