/**
 * FileName:$[NAME]
 * Author: kyrietxma
 * Date: $[DATE]$[TIME]
 */


package com.kyrie.mybatis.controller;

import com.kyrie.mybatis.entity.Student;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: txma
 * @Date: 2019/3/31 22:06
 * @Version: 1.0
 */

@RestController
@RequestMapping(value = "/student")
@Api(description = "学生管理")
public class StudentController {

    private  int flag;
    ArrayList<Student> students = new ArrayList<>();
    @ApiOperation(value = "获取学生列表", notes = "获取所有学生信息")
    @RequestMapping(value = "/get", method = RequestMethod.GET)
    public List<Student> hello() {
        students.add(new Student("逻辑", "123456"));
        students.add(new Student("叶文杰", "123456"));
        for(Student attribute : students) {
            System.out.println(attribute);
        }

        return students;
    }

    @ApiOperation(value = "新增学生",notes = "新增学生信息")
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public  int  addStudent(Student student){
        return flag;
    }
    @ApiOperation(value = "获取学生详细信息",notes ="根据用户输入的id来查询学生的详细信息")
    @ApiImplicitParam(name = "id",value = "学生id",required = true)
    @RequestMapping(value = "user/{id}",method = RequestMethod.GET)
    public  Student getStudent(int id){
        Student student = new Student(1,"kyrie","111111");
        return  student;
    }
    @ApiOperation(value = "删除学生信息",notes = "根据id删除学生信息")
    @ApiImplicitParam(name = "id",value = "学生id",required = true)
    @RequestMapping(value = "user{/id}",method = RequestMethod.DELETE)
    public int delStudent(int id){
        return  1;
    }
 }
