package hello.hellospring.domain;

import javax.persistence.*;

// jpa가 관리하는 entity
@Entity
public class Member {

    // IDENTITY 전략 : DB가 알아서 자동으로 생성해주는것
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
