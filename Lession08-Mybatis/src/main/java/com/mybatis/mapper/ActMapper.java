package com.mybatis.mapper;

import com.mybatis.pojo.Act;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
//以指示 MyBatis 生成实现该接口的代理类
public interface ActMapper {
    //结果映射可以用@results,@result注解实现
    //@results,@result配合resultMap可以实现复用
    //insert #{}占位符除了@param意外,#{}中的值要对应pojo类的属性名
    //mybatis新版本后,多个简单类型中#{}放入形参名就可以使用代替@param
    @Select("select id,actno,balance from t_act")
    List<Act> selectAll();
    @Select("select count(*) from t_act")
    Integer numCount();
    @Select("select id,actno,balance from t_act where actno = #{no}")
    Act selectByNo(@Param("no") String actno);
}
