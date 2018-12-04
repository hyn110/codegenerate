package com.fmi110..dao.mapper;

import com.fmi110..dao.model.AnjProject;
import com.fmi110..dao.model.AnjProjectExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AnjProjectMapper {
    long countByExample(AnjProjectExample example);

    int deleteByExample(AnjProjectExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AnjProject record);

    int insertSelective(AnjProject record);

    List<AnjProject> selectByExample(AnjProjectExample example);

    AnjProject selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AnjProject record, @Param("example") AnjProjectExample example);

    int updateByExample(@Param("record") AnjProject record, @Param("example") AnjProjectExample example);

    int updateByPrimaryKeySelective(AnjProject record);

    int updateByPrimaryKey(AnjProject record);
}