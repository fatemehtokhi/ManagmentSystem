package com.example.dao;
import com.example.model.Student;

public class StudentDao implements StudentDaoInterface{

    @Override
    public boolean insertStudent(Student s) {
        try {
            
        } catch (Exception e) {
            // TODO: handle exception
        }
        return false;
    }

    @Override
    public boolean delete(int roll) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'delete'");
    }

    @Override
    public boolean update(int roll, String update, int ch, Student s) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'update'");
    }

    @Override
    public void showAllStudent() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showAllStudent'");
    }

    @Override
    public boolean showStudentById(int roll) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'showStudentById'");
    }

    
}
