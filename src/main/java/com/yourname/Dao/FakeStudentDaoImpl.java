package com.yourname.Dao;

import com.yourname.Entity.Student;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by 3792274 on 2017/5/13.
 */

@Repository
@Qualifier("fakeData")
public class FakeStudentDaoImpl implements StudentDao {
    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>(){
            {
                put(1, new Student(1,"A", "Computer Science"));
                put(2, new Student(2,"B", "Finance"));
                put(3, new Student(3,"C", "Maths"));
            }
        };
    }

    @Override
    public Collection<Student> getAllStudents() {
        return students.values();
    }

    @Override
    public Student getStudentById(int id) {
        return this.students.get(id);
    }

    @Override
    public void delStudentById(int id) {
        this.students.remove(id);
    }

    @Override
    public void upDataStudent(Student student) {
        Student stu = students.get(student.getId());
        stu.setCourse(student.getCourse());
        stu.setName(student.getName());
        students.put(stu.getId(), stu);
    }

    @Override
    public void insertStudent(Student student) {
        students.put(student.getId(), student);
    }
}
