package com.allinfinance.ccp.service.impl;

import com.allinfinance.ccp.mapper.TblCcpMapper;
import com.allinfinance.ccp.model.TblCcp;
import com.allinfinance.ccp.model.TblCcpExample;
import com.allinfinance.ccp.service.TblCcpService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TblCcpServiceImpl implements TblCcpService{

    @Autowired
    private TblCcpMapper tblCcpMapper;

    @Override
    public long countByExample(TblCcpExample example){
        return tblCcpMapper.countByExample(example);
    }
    @Override
    public int deleteByPrimaryKey(String id){
        return tblCcpMapper.deleteByPrimaryKey(id);
    }
    @Override
    public int insert(TblCcp record) {
        return tblCcpMapper.insert(record);
    }
    @Override
    public int insertSelective(TblCcp record) {
        return tblCcpMapper.insertSelective(record);
    }
    @Override
    public List<TblCcp> selectByExample(TblCcpExample example) {
        return tblCcpMapper.selectByExample(example);
    }
    @Override
    public TblCcp selectByPrimaryKey(String id) {
        return tblCcpMapper.selectByPrimaryKey(id);
    }
    @Override
    public int updateByExampleSelective(@Param("record") TblCcp record, @Param("example") TblCcpExample example) {
        return tblCcpMapper.updateByExampleSelective(record, example);
    }
    @Override
    public int updateByExample(@Param("record") TblCcp record, @Param("example") TblCcpExample example) {
        return tblCcpMapper.updateByExample(record, example);
    }
    @Override
    public int updateByPrimaryKeySelective(TblCcp record) {
        return tblCcpMapper.updateByPrimaryKeySelective(record);
    }
    @Override
    public int updateByPrimaryKey(TblCcp record) {
        return tblCcpMapper.updateByPrimaryKey(record);
    }
}
