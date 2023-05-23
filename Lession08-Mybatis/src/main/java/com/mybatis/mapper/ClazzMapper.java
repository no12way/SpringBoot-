package com.mybatis.mapper;


import com.mybatis.pojo.Clazz;
import com.mybatis.pojo.Student;
import org.apache.ibatis.annotations.*;

@Mapper
public interface ClazzMapper {

    @Results( id = "re", value = {
            //主键加字段 如id=true
            @Result(id = true ,column = "cid", property = "claId"),//表示cid是主键
            @Result(column = "cname", property = "claName"),
    }
    )
    @Select("select cid,cname from t_clazz where cid = #{cid}")
    Clazz selectByCid(Integer cid);



    @Insert("insert into t_clazz values(#{claId},#{claName})")
    int save(Clazz clazz);

}
