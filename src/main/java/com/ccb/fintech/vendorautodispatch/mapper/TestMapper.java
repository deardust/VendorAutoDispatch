package com.ccb.fintech.vendorautodispatch.mapper;

import com.ccb.fintech.vendorautodispatch.entity.Test;
import org.apache.ibatis.annotations.*;
import java.util.List;

@Mapper
public interface TestMapper {
    // 查询所有Test记录
    @Select("SELECT * FROM test")
    List<Test> findAll();

    // 根据id查询Test记录
    @Select("SELECT * FROM test WHERE id = #{id}")
    Test findById(@Param("id") Long id);

    // 插入Test记录，注意要排除id字段，因为id是自增的，数据库会自动生成
    @Insert("INSERT INTO test (name) VALUES (#{name})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    void insert(Test test);

    // 更新Test记录
    @Update("UPDATE test SET name = #{name} WHERE id = #{id}")
    void update(Test test);

    // 根据id删除Test记录
    @Delete("DELETE FROM test WHERE id = #{id}")
    void deleteById(@Param("id") Long id);
}
