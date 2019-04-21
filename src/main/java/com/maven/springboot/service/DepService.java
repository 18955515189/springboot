package com.maven.springboot.service;

import com.maven.springboot.pojo.Dep;
import java.util.List;

/**
 * Created by Administrator on 2019/4/13.
 */
public interface DepService {

    public List<Dep> findAll();

    public void delete(Long id);
}
