package com.maven.springboot.controller;

import com.maven.springboot.pojo.Dep;
import com.maven.springboot.service.DepService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * 单位查询demo
 * Created by david on 2019/4/13.
 */



@Controller
@ResponseBody
@RequestMapping("/dep")
public class DepController {

    @Resource
    private DepService depService;


    @RequestMapping("/list")
    public List<Dep> list(){
        return depService.findAll();
    }


    @RequestMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        depService.delete(id);
    }
}
