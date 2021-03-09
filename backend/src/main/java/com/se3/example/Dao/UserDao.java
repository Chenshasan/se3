package com.se3.example.Dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

/**
 * @ClassName UserDao
 * @Description TODO
 * @Author 李甘霖
 * @Date 2021/3/915:00
 **/
@Entity
@Table(name="t_user")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDao {
    @Id
    private Integer id;
    @Column(name="user_name",length = 20)
    private String userName;
    @Column(name="password",length = 20)
    private String password;
    @Column(name="sex")
    private Integer sex;
    @Column(name="last_login_time")
    private Date lastLoginTime;
}