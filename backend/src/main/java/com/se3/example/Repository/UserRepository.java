package com.se3.example.Repository;

import com.se3.example.Dao.UserDao;
import org.springframework.data.repository.CrudRepository;

/**
 * @Date 15:10 2021/3/9
 * @Param
 * @return
 **/
public interface UserRepository extends CrudRepository<UserDao,Integer> {

}
