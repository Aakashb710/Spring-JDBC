package org.example.dao;

import org.example.entity.Student;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.List;

public class StudentDaoImpl implements StudentDao
{
    private JdbcTemplate template;


    public JdbcTemplate getTemplate() {
        return template;
    }

    public void setTemplate(JdbcTemplate template) {
        this.template = template;
    }

    public int insert(Student student) {
        String query = "insert into student_details (id,name,city) values (?,?,?)";
        int r = this.template.update(query,student.getId(),student.getName(),student.getCity());
        return r;
    }

    public int update(Student student) {
        String query = "update student_details set name=?, city=? where id=?";
        int r = this.template.update(query,student.getName(),student.getCity(),student.getId());
        return r;
    }

    @Override
    public Student getStudent(int id) {

        String query = "select * from student_details where id=?";
        RowMapper<Student> rowMapper = new RowMapperImpl();
        Student ss = this.template.queryForObject(query,rowMapper,id);
        return ss;
    }

    @Override
    public List<Student> getAllStudent() {
        String query = "select * from student_details";
        List<Student> ll = this.template.query(query,new RowMapperImpl());
        return ll;
    }


}
