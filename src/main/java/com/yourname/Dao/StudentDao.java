package com.yourname.Dao;

import com.yourname.Entity.Student;

import java.util.Collection;

/**
 * Created by 3792274 on 2017/5/14.
 */
public interface StudentDao {
    Collection<Student> getAllStudents();

    Student getStudentById(int id);

    void delStudentById(int id);

    void upDataStudent(Student student);

    void insertStudent(Student student);
}
