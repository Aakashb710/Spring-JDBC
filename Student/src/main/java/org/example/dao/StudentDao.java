package org.example.dao;

import org.example.entity.Student;

import java.util.List;

public interface StudentDao
{
    public int insert(Student student);
    public int update(Student student);

    public Student getStudent(int id);
    public List<Student> getAllStudent();
}
