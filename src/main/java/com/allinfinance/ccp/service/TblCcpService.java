package com.allinfinance.ccp.service;

import com.allinfinance.ccp.model.TblCcp;
import com.allinfinance.ccp.model.TblCcpExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TblCcpService {
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
