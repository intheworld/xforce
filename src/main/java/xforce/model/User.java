package xforce.model;

import org.springframework.data.annotation.Id;

public class User {

    @Id
    private String id;

    private String username;
    private Integer age;

    public User(String username, Integer age) {
        this.setUsername(username);
        this.setAge(age);
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
