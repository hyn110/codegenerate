package com.fmi110..api;

import com.fmi110.common.base.BaseServiceMock;
import com.fmi110..dao.mapper.AnjProjectMapper;
import com.fmi110..dao.model.AnjProject;
import com.fmi110..dao.model.AnjProjectExample;

/**
* 降级实现AnjProjectService接口
* Created by fmi110 on 2018/12/4.
*/
public class AnjProjectServiceMock extends BaseServiceMock<AnjProjectMapper, AnjProject, AnjProjectExample> implements AnjProjectService {

}
