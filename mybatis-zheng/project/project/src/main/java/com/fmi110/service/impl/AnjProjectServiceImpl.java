package com.fmi110..service.impl;

import com.fmi110.common.annotation.BaseService;
import com.fmi110.common.base.BaseServiceImpl;
import com.fmi110..dao.mapper.AnjProjectMapper;
import com.fmi110..dao.model.AnjProject;
import com.fmi110..dao.model.AnjProjectExample;
import com.fmi110..service.AnjProjectService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* AnjProjectService实现
* Created by fmi110 on 2018/12/4.
*/
@Service
@Transactional
@BaseService
public class AnjProjectServiceImpl extends BaseServiceImpl<AnjProjectMapper, AnjProject, AnjProjectExample> implements AnjProjectService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AnjProjectServiceImpl.class);

    @Autowired
    AnjProjectMapper anjProjectMapper;

}