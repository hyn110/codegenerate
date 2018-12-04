package com.fmi110..dao.mapper;

import com.fmi110..dao.model.AnjProjectImg;
import com.fmi110..dao.model.AnjProjectImgExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AnjProjectImgMapper {
    long countByExample(AnjProjectImgExample example);

    int deleteByExample(AnjProjectImgExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AnjProjectImg record);

    int insertSelective(AnjProjectImg record);

    List<AnjProjectImg> selectByExample(AnjProjectImgExample example);

    AnjProjectImg selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AnjProjectImg record, @Param("example") AnjProjectImgExample example);

    int updateByExample(@Param("record") AnjProjectImg record, @Param("example") AnjProjectImgExample example);

    int updateByPrimaryKeySelective(AnjProjectImg record);

    int updateByPrimaryKey(AnjProjectImg record);
}