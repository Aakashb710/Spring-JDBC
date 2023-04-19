package org.example;

import org.example.dao.StudentDaoImpl;
import org.example.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("web.xml");
        StudentDaoImpl studentDao = (StudentDaoImpl) context.getBean("dao");


        //Creating student object
//        Student s1 = new Student();
//        s1.setId(11);
//        s1.setName("Shah Rukh Khan");
//        s1.setCity("Mumbai");
//
//        int i = studentDao.createStudent(s1);
//        System.out.println("Record inserted "+i);

        //Updating student object

//        Student s2 = new Student();
//        s2.setId(11);
//        s2.setName("Demon Slayers");
//        s2.setCity("Anime");
//
//        int i = studentDao.updateStudent(s2);
//        System.out.println("Record updated "+i);


    }
}
