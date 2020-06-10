package com.liuyujie.springboot_jpa.dao;

import com.liuyujie.springboot_jpa.po.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {
    public List<User> findAll();

}
