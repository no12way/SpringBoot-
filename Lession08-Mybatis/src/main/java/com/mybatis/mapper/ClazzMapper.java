package com.mybatis.mapper;


import com.mybatis.pojo.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface ClazzMapper {

    @Results({
            //主键加字段 如id=true
            @Result(id = true ,column = "cid", property = "claId"),//表示cid是主键
            @Result(column = "cname", property = "claName"),
    }
    )
    @Select("select cid,cname from t_clazz where cid = #{cid}")
    Student selectByCid(Integer cid);
}
