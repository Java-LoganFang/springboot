package com.example.cache.controller;

import com.example.cache.Bean.sp_type;
import com.example.cache.mapper.sp_tpeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    sp_tpeMapper sp_tpeMapper;

    /**
     *
     * @param id
     * @return
     * CacheManager管理多个Cache组件的，对缓存的真正的CRUD操作在Cache组件中，每一个缓存都有自己的名字
     * 几个属性：
     *      cacheNames/vale:指定缓存组件的名字；
     *      key:缓存数据使用的key；可以用它来指定。默认是使用方法参数的值  1-方法的返回值
     *              编写SpEl： #id;参数的id的值   #a0   #p0   #root.args[0]
     *      keyGenerator: key的生成器；可以自己指定key的生成器的组件id
     *              key/keyGenerator: 二选一使用
     *      cacheManager：指定缓存缓存器；或者cacheResolver指定获取解析器
     *      condition：指定符合条件的情况下才缓存
     *      unless：否定缓存；当unless指定的条件为true，方法的返回值就不会被缓存；可以获取到结果进行判断
     *              unless = "#result==null"  当为空的时候就不缓存
     *      sync： 异步缓存
     */

    @Cacheable(cacheNames = {"emp"})
    @GetMapping("/emp/{id}")
    public sp_type getType(@PathVariable("id") Integer id){
        System.out.println("查询员工");
        System.out.println(sp_tpeMapper.getTypeByid(id));
        return  sp_tpeMapper.getTypeByid(id);
    }
}