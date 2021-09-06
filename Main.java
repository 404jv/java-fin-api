import modules.accounts.useCases.createUser.CreateUserController;

public class Main {
  public static void main(String[] args) {
    CreateUserController createUserController = new CreateUserController();
  
    createUserController.execute();
  }
}
