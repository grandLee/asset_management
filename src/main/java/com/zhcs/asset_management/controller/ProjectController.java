package com.zhcs.asset_management.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping(value = "/project")
@RestController
public class ProjectController extends BaseController {

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public String getProject(@PathVariable String id)
    {
        return id;
    }
}
