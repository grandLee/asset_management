package com.zhcs.asset_management.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@RequestMapping(value = "/project")
@RestController
public class ProjectController extends BaseController {

    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public String getProject(@PathVariable String id)
    {
        return id;
    }

    @RequestMapping(value="/add",method=RequestMethod.POST)
    public void addProject(HttpServletRequest request, HttpServletResponse response)
    {
        try {
            String content= request.getReader().readLine();
            PrintWriter writer = response.getWriter();
            writer.write(content);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
