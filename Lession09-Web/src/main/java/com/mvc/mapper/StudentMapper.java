package com.mvc.mapper;

import com.mvc.pojo.Student;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentMapper {

    @Results({
            //主键加字段 如id=true
            @Result(id = true,column = "sid", property = "stuId"),
            @Result(column = "sname", property = "stuName"),
            @Result(column = "cid", property = "claId"),
            @Result(column = "cid", property = "clazz",
                    one=@One(
                select = "com.mvc.mapper.ClazzMapper.selectByCid"
            )//其实就是把查到的cid字段给select语句赋值,返回实体类class
            )
    }
    )
    @Select(" select sid,sname,cid from t_student where sname = #{sName}")
    Student selectByName(String sName);

    @Results({
            //主键加字段 如id=true
            @Result(id = true,column = "sid", property = "stuId"),
            @Result(column = "sname", property = "stuName"),
            @Result(column = "cid", property = "claId"),
    }
    )
    @Select(" select sid,sname,cid from t_student where cid = #{cid}")
    List<Student> selectById(Integer cid);
}
