package com.yourname.Dao;

import com.yourname.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;

/**
 * Created by 3792274 on 2017/5/14.
 */
@Repository
@Qualifier("MongoData")
public class MongoStudentDaoImpl implements  StudentDao {
    @Override
    public Collection<Student> getAllStudents() {
        return null;
    }

    @Override
    public Student getStudentById(int id) {
        return null;
    }

    @Override
    public void delStudentById(int id) {

    }

    @Override
    public void upDataStudent(Student student) {

    }

    @Override
    public void insertStudent(Student student) {

    }
}
