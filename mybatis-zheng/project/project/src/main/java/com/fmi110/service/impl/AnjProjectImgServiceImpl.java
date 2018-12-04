package com.fmi110..service.impl;

import com.fmi110.common.annotation.BaseService;
import com.fmi110.common.base.BaseServiceImpl;
import com.fmi110..dao.mapper.AnjProjectImgMapper;
import com.fmi110..dao.model.AnjProjectImg;
import com.fmi110..dao.model.AnjProjectImgExample;
import com.fmi110..service.AnjProjectImgService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
* AnjProjectImgService实现
* Created by fmi110 on 2018/12/4.
*/
@Service
@Transactional
@BaseService
public class AnjProjectImgServiceImpl extends BaseServiceImpl<AnjProjectImgMapper, AnjProjectImg, AnjProjectImgExample> implements AnjProjectImgService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AnjProjectImgServiceImpl.class);

    @Autowired
    AnjProjectImgMapper anjProjectImgMapper;

}