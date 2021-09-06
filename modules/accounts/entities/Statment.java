package modules.accounts.entities;

import java.time.LocalDateTime;
import java.util.UUID;

public class Statment {
  private String id;
  private String description;
  private double amount;
  private String type;
  private LocalDateTime created_at;

  public Statment() {
    this.id = UUID.randomUUID().toString();
  }

  public Statment(
    String id,
    String description, 
    double amount, 
    String type
  ) {
    this.id = UUID.randomUUID().toString();
    this.description = description;
    this.amount = amount;
    this.type = type;
    this.created_at = LocalDateTime.now();
  }

  public String getId() {
    return id;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public double getAmount() {
    return amount;
  }

  public void setAmount(double amount) {
    this.amount = amount;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public LocalDateTime getCreated_at() {
    return created_at;
  }
}
