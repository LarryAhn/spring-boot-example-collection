package com.geekswise;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Ahn
 */
@Entity(name = "MEMBER")
public class MemberEntity {

    @Id
    @GenericGenerator(name = "uuidGenerator", strategy = "com.geekswise.UUIDGenerator")
    @GeneratedValue(generator = "uuidGenerator")
    private String id;

    private String name;

    MemberEntity() {
    }

    MemberEntity(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MemberEntity{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
