package com.geekswise;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by Ahn on 2017. 4. 6..
 */
@Data
@Entity(name = "MEMBER")
public class MemberEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

}
