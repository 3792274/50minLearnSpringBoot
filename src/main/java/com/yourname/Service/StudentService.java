package com.yourname.Service;

import com.yourname.Dao.FakeStudentDaoImpl;
import com.yourname.Dao.StudentDao;
import com.yourname.Entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

/**
 * Created by 3792274 on 2017/5/13.
 */
@Service
public class StudentService{

    @Autowired
    @Qualifier("fakeData")
    private StudentDao studentDao;

    public Collection<Student> getAllStudents() {
        return this.studentDao.getAllStudents();
    }

    public Student getStudentById(int id) {
        return this.studentDao.getStudentById(id);
    }

    public void delStudentById(int id) {
        this.studentDao.delStudentById(id);
    }

    public void upDataStudent(Student student) {
        this.studentDao.upDataStudent(student);
    }

    public void insertStudent(Student student) {
        this.studentDao.insertStudent(student);
    }
}
