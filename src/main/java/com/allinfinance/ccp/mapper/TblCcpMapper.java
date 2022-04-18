package com.allinfinance.ccp.mapper;

import com.allinfinance.ccp.model.TblCcp;
import com.allinfinance.ccp.model.TblCcpExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface TblCcpMapper {
    long countByExample(TblCcpExample example);

    int deleteByPrimaryKey(String id);

    int insert(TblCcp record);

    int insertSelective(TblCcp record);

    List<TblCcp> selectByExample(TblCcpExample example);

    TblCcp selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") TblCcp record, @Param("example") TblCcpExample example);

    int updateByExample(@Param("record") TblCcp record, @Param("example") TblCcpExample example);

    int updateByPrimaryKeySelective(TblCcp record);

    int updateByPrimaryKey(TblCcp record);
}