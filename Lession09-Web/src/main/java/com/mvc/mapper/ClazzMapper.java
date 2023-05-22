package com.mvc.mapper;

import com.mvc.pojo.Clazz;
import com.mvc.pojo.Student;
import org.apache.ibatis.annotations.*;

@Mapper
public interface ClazzMapper {

    @Results({
            //主键加字段 如id=true
            @Result(id = true ,column = "cid", property = "claId"),//表示cid是主键
            @Result(column = "cname", property = "claName"),
    }
    )
    @Select("select cid,cname from t_clazz where cid = #{cid}")
    Clazz selectByCid(Integer cid);

    @Results({
            //主键加字段 如id=true
            @Result(id = true ,column = "cid", property = "claId"),//表示cid是主键
            @Result(column = "cname", property = "claName"),
            @Result(column = "cid" ,property = "students",
                    many=@Many(select = "com.mvc.mapper.StudentMapper.selectById")
            )
    }
    )
    @Select("select cid,cname from t_clazz where cid = #{cid}")
    Clazz selectByid(Integer cid);
}
