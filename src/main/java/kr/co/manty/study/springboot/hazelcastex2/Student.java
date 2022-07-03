package kr.co.manty.study.springboot.hazelcastex2;

import lombok.Data;

import java.io.Serializable;

@Data
public class Student implements Serializable {
    private final Long id;
    private final String name;
}
