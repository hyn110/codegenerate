package com.fmi110..dao.mapper;

import com.fmi110..dao.model.AnjProjectDetail;
import com.fmi110..dao.model.AnjProjectDetailExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AnjProjectDetailMapper {
    long countByExample(AnjProjectDetailExample example);

    int deleteByExample(AnjProjectDetailExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AnjProjectDetail record);

    int insertSelective(AnjProjectDetail record);

    List<AnjProjectDetail> selectByExampleWithBLOBs(AnjProjectDetailExample example);

    List<AnjProjectDetail> selectByExample(AnjProjectDetailExample example);

    AnjProjectDetail selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AnjProjectDetail record, @Param("example") AnjProjectDetailExample example);

    int updateByExampleWithBLOBs(@Param("record") AnjProjectDetail record, @Param("example") AnjProjectDetailExample example);

    int updateByExample(@Param("record") AnjProjectDetail record, @Param("example") AnjProjectDetailExample example);

    int updateByPrimaryKeySelective(AnjProjectDetail record);

    int updateByPrimaryKeyWithBLOBs(AnjProjectDetail record);

    int updateByPrimaryKey(AnjProjectDetail record);
}