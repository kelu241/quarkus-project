
package luciano.quarkusssocial.rest.model;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Users")
public class User extends PanacheEntity {

  public User() {
  }

  /*
   * @Id
   * 
   * @GeneratedValue(strategy = GenerationType.IDENTITY)
   * private Long Id;
   */
  @Column(name = "name")
  private String name;
  @Column(name = "age")
  private Integer age;

  public User(String name, Integer age) {
    this.name = name;
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

}
