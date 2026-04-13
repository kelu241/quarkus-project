package luciano.quarkusssocial.rest.dto;

public class CreateUserRequests {
  private String name;

  private Integer age;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public CreateUserRequests() {

  }

  public CreateUserRequests(Integer age) {
    this.age = age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public Integer getAge() {
    return age;
  }

}
