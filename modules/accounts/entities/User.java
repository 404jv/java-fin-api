package modules.accounts.entities;

import java.util.ArrayList;
import java.util.UUID;

public class User {
  private String id;
  private String name;
  private String password;
  private String cpf;
  private ArrayList<Statment> statments;

  public User() {
    this.id = UUID.randomUUID().toString();
  }

  public User(
    String name,
    String password,
    String cpf
  ) {
    this.id = UUID.randomUUID().toString();
    this.name = name;
    this.password = password;
    this.cpf = cpf;
    this.statments = new ArrayList<Statment>();
  }

  public String getId() {
    return id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public Statment[] getStatments() {
    return (Statment[]) statments.toArray();
  }
}
