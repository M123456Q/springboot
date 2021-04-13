package cn.com.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author MQ
 * @date Person年04月13日  20:12
 */
@Component  //使Springboot容器可以自动的扫描组件
@ConfigurationProperties(prefix = "person") //将配置文件中以person开头的属性注入到该类中
public class Person {
    private int id;
    private String name ;
    private List hobby;
    private String[] family;
    private Pet pet;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getHobby() {
        return hobby;
    }

    public void setHobby(List hobby) {
        this.hobby = hobby;
    }

    public String[] getFamily() {
        return family;
    }

    public void setFamily(String[] family) {
        this.family = family;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
