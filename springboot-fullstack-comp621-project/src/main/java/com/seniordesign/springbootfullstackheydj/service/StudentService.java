package com.seniordesign.springbootfullstackheydj.service;

import com.seniordesign.springbootfullstackheydj.dao.StudentDao;
import com.seniordesign.springbootfullstackheydj.entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class StudentService {

    @Autowired
    private StudentDao studentDao;

    public Collection<Student> getAllStudents(){
        return studentDao.getAllStudents();
    }
    public  Student getStudentById(int id){
        return this.studentDao.getStudentById(id);
    }

    public void removeStudentById(int id) {
        this.studentDao.removeStudentById(id);
    }
    public void updateStudent(Student student) {

        this.studentDao.updateStudent(student);

    }
    public void addStudent(int id, Student student) {
        this.studentDao.addStudent(id,student);
    }
}
