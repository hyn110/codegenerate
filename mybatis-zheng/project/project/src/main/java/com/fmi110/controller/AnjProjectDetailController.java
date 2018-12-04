package com.fmi110..controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * AnjProjectDetailcontroller
 * Created by fmi110 on 2018/12/4.
 */
@Controller
@RequestMapping("/AnjProjectDetail")
@Api(value = "AnjProjectDetail控制器", description = "AnjProjectDetail管理")
public class AnjProjectDetailController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AnjProjectDetailController.class);



}