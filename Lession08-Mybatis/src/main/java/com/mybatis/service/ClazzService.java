package com.mybatis.service;

import com.mybatis.pojo.Clazz;
import org.springframework.stereotype.Service;

import java.io.FileNotFoundException;


public interface ClazzService {
    int insert(Clazz clazz) throws FileNotFoundException;
}
