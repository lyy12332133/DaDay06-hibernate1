package com.lanou.dao;

import com.lanou.domain.Student;

/**
 * Created by dllo on 17/10/17.
 */
public interface StudentDao extends BaseDao<Student>{

    /**
     * 学生登录查询
     * @param name 用户名
     * @param pwd 密码
     * @return 成功返回true, 失败false
     */
    boolean login(String name,String pwd);
}
