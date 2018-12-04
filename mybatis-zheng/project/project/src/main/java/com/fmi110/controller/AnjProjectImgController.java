package com.fmi110..controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * AnjProjectImgcontroller
 * Created by fmi110 on 2018/12/4.
 */
@Controller
@RequestMapping("/AnjProjectImg")
@Api(value = "AnjProjectImg控制器", description = "AnjProjectImg管理")
public class AnjProjectImgController extends BaseController {

    private static final Logger LOGGER = LoggerFactory.getLogger(AnjProjectImgController.class);



}