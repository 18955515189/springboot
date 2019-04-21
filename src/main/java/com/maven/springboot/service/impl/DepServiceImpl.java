package com.maven.springboot.service.impl;

import com.maven.springboot.dao.DepDao;
import com.maven.springboot.pojo.Dep;
import com.maven.springboot.service.DepService;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

/**
 * Created by david on 2019/4/13.
 */
@Service
public class DepServiceImpl implements DepService{

    @Resource
    private DepDao depDao;

    @Override
    @Cacheable(value = "DepCache",key="'dep.findAll'")
    public List<Dep> findAll() {
        return depDao.findAll();
    }

    @Override
    @CacheEvict(value = "DepCache",key="'dep.findAll'")
    public void delete(Long id) {
        depDao.delete(id);
    }

}
