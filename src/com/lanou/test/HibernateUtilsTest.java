package com.lanou.test;

import com.lanou.domain.Student;
import com.lanou.utils.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

import java.util.List;

/**
 * Created by dllo on 17/10/17.
 */
public class HibernateUtilsTest {

    @Test
    public void findAll(){
        // 通过工具类获得一个session对象
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        // 查询学生表中的所有数据
        List<Student> students = session.createQuery("from Student ").list();
        // 遍历查询结果
        for (Student stu : students) {
            System.out.println(stu);
        }
        transaction.commit(); // 提交本次事物
        HibernateUtil.closeSession(); // 关闭当前session对象

    }
}
