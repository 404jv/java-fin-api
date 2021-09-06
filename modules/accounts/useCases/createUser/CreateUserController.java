package modules.accounts.useCases.createUser;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CreateUserController {
  public void execute() {

    // String name = System.console().readLine();
    // System.out.println(name);
  
    BufferedReader reader = new BufferedReader(
      new InputStreamReader(System.in)
    );
    
    try {
      String name = reader.readLine();
      System.out.println(name);
    } catch (Exception e) {
      //TODO: handle exception
    }

  }
}
