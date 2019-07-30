package com.itunion.cloud.dao;

import com.itunion.cloud.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @Auther: Lin
 * @Date: 2019-07-19 17:11
 * @Description: 用户Dao
 */
@Repository
public interface UserRepository extends JpaRepository<User,Long> {
}
