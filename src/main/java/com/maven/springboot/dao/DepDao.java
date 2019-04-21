package com.maven.springboot.dao;

import com.maven.springboot.pojo.Dep;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2019/4/13.
 */
@Component
public interface DepDao extends JpaRepository<Dep,Long>{
}
