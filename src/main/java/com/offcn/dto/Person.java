package com.offcn.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

/**
 * @Author ChaoZhe Li
 * @Date 2020/9/10 17:04
 * @Version 1.0
 */
@Entity
@Table(name = "t_person")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    @Id
    @GeneratedValue
    private Long id;
    @Column(name = "name",nullable = true,length = 20)
    private String name;
    @Column(name = "password",nullable = false,length = 18)
    private String password;
}
