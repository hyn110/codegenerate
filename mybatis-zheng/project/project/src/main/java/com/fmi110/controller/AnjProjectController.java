package com.fmi110..controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * AnjProjectcontroller
 * Created by fmi110 on 2018/12/4.
 */
@Controller
@RequestMapping("/AnjProject")
@Api(value = "AnjProject控制器", description = "AnjProject管理")
public class AnjProjectController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AnjProjectController.class);



}