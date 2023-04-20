package org.example;

import org.example.dao.StudentDao;
import org.example.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        ApplicationContext context = new AnnotationConfigApplicationContext(JDBCConfig.class);
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
//        Student ss = new Student();
//        ss.setId(7);
//        ss.setName("Ousmane Dembelle");
//        ss.setCity("Medina");
//
//        int r = studentDao.insert(ss);
//        System.out.println("record inserted" + r);


//        Student ss1 = new Student();
//        ss1.setId(7);
//        ss1.setName("Antoine Griezman");
//        ss1.setCity("Monaco");
//
//        int r = studentDao.update(ss1);
//        System.out.println("record updated"+r);


//        Student student = studentDao.getStudent(1);
//        System.out.println(student);


        List<Student> ss2 = studentDao.getAllStudent();
        for (Student s: ss2) {
            System.out.println(s);
        }
    }
}
