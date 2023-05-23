package com.mybatis.service.impl;

import com.mybatis.mapper.ClazzMapper;
import com.mybatis.pojo.Clazz;
import com.mybatis.service.ClazzService;
import org.apache.ibatis.javassist.NotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

@Service

public class ClazzServiceImpl implements ClazzService {
    @Autowired
    ClazzMapper clazzMapper;
    //事务只对运行时异常做回滚,其他类的异常要rollbackfor指定才可以回滚,但是如果try catch捕获了异常,也是不会回滚的
    //此时要手动抛出异常 throw new FileNotFoundException这种异常
    @Transactional(rollbackFor = FileNotFoundException.class)
    @Override
    public int insert(Clazz clazz) throws FileNotFoundException {
        int save = clazzMapper.save(clazz);
        try{
        FileInputStream fis=new FileInputStream("E:\\code\\test.txt");}
        catch (FileNotFoundException e){
            e.printStackTrace();
            throw new FileNotFoundException("文件未找到");
        }
        return save;
    }
}
