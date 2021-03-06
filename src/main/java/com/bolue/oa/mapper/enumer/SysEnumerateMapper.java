package com.bolue.oa.mapper.enumer;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.bolue.oa.entity.enumer.SysEnumerate;
import com.bolue.oa.entity.enumer.SysEnumerateKey;

@Mapper
public interface SysEnumerateMapper {
    int deleteByPrimaryKey(SysEnumerateKey key);

    int insert(SysEnumerate record);

    int insertSelective(SysEnumerate record);

    SysEnumerate selectByPrimaryKey(SysEnumerateKey key);

    int updateByPrimaryKeySelective(SysEnumerate record);

    int updateByPrimaryKey(SysEnumerate record);
    
    /**
     * 根据枚举类型编号获取枚举类型集合
     * @param enumCode
     * @return
     */
    List<SysEnumerate> selectEnumsByEnumCode(@Param("enumCode")String enumCode);

    /**
     * 检索枚举类型集合根据检索条件
     * @param data
     * @return
     */
	List<SysEnumerate> selectEnuInfosByForm(@Param("data")SysEnumerate data);
}