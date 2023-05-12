package com.spring.jdbc;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import com.spring.jdbc.dao.StudentDao;
import com.spring.jdbc.entitis.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("My Program Started......");
//        
//        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/config.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(JdbcConfig.class);
        
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        
//        Student student = new Student();
//        student.setId(666);
//        student.setName("Habibullah Jadran");
//        student.setCity("Jarmany");
//        
//        int result = studentDao.change(student);
//        
//        System.out.println("student added: " + result + " " + student);
        
//        int result = studentDao.delete(1);
//        
//        System.out.println("student added: " + result);
        
//        Student student = studentDao.getStudent(11);
//        System.out.println(student);
        List<Student> students = studentDao.getAllStudents();
        
        for (Student s : students) {
        	System.out.println(s);
        }
    }
}
