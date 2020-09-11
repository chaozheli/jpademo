package com.offcn.dao;

import com.offcn.dto.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * @Author ChaoZhe Li
 * @Date 2020/9/10 21:12
 * @Version 1.0
 */
public interface PersonRepository extends JpaRepository<Person,Long> {

    /**
     * 查询指定用户
     */
    public Person findByNameIs(String name);

    /**
     * 按姓名模糊查询
     * @param name
     * @return
     */
    @Query("select p from Person p where p.name like %:name%")
    public List<Person> getNamesLike(@Param("name")String name);
}
