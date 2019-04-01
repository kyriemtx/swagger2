/**
 * FileName:$[NAME]
 * Author: kyrietxma
 * Date: $[DATE]$[TIME]
 */


package com.kyrie.mybatis.service;

import com.kyrie.mybatis.dao.StudentMapper;
import com.kyrie.mybatis.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Author: txma
 * @Date: 2019/3/31 22:12
 * @Version: 1.0
 */
public interface StudentService {
    Student geetStudentById(int id);
}
