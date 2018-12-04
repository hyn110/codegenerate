package com.fmi110..service.impl;

import com.fmi110.common.annotation.BaseService;
import com.fmi110.common.base.BaseServiceImpl;
import com.fmi110..dao.mapper.AnjProjectDetailMapper;
import com.fmi110..dao.model.AnjProjectDetail;
import com.fmi110..dao.model.AnjProjectDetailExample;
import com.fmi110..service.AnjProjectDetailService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* AnjProjectDetailService实现
* Created by fmi110 on 2018/12/4.
*/
@Service
@Transactional
@BaseService
public class AnjProjectDetailServiceImpl extends BaseServiceImpl<AnjProjectDetailMapper, AnjProjectDetail, AnjProjectDetailExample> implements AnjProjectDetailService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AnjProjectDetailServiceImpl.class);

    @Autowired
    AnjProjectDetailMapper anjProjectDetailMapper;

}