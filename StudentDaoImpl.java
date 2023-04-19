package org.example.dao;

import org.example.entity.Student;
import org.springframework.jdbc.core.JdbcTemplate;

public class StudentDaoImpl implements StudentDao
{
    private JdbcTemplate template;

    public JdbcTemplate getTemplate() {
        return template;
    }
    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public int createStudent(Student student) {
        String query = "insert into student(id,name,city) values (?,?,?)";
        int r =  template.update(query,student.getId(),student.getName(),student.getCity());
        return r;
    }

    @Override
    public int updateStudent(Student student) {
        String query = "update student set name=?, city=? where id=?";
        int r = template.update(query,student.getName(),student.getCity(),student.getId());
        return r;
    }


}
