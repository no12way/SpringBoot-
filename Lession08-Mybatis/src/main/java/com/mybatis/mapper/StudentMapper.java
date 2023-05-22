package com.mybatis.mapper;


import com.mybatis.pojo.Student;
import org.apache.ibatis.annotations.*;

@Mapper
public interface StudentMapper {

    @Results({
            //主键加字段 如id=true
            @Result(id = true,column = "sid", property = "stuId"),
            @Result(column = "sname", property = "stuName"),
            @Result(column = "cid", property = "claId"),
            @Result(column = "cid",property = "clazz" ,
            one = @One(select = "com.mybatis.mapper.ClazzMapper.selectByCid"))
    }
    )
    @Select(" select sid,sname,cid from t_student where sname = #{sName}")
    Student selectByName(String sName);
}
