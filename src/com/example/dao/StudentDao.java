package com.example.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;

import com.example.db.DBconnection;
import com.example.model.Student;

public class StudentDao implements StudentDaoInterface{

    @Override
    public boolean insertStudent(Student s) {
        boolean flag =false;
        try {
            
            Connection con = DBconnection.creatConnection();
            String query = "insert into student_detals(sname,clgname,city,percentage) value (?,?,?,?)";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, s.getName());
            pst.setString(2, s.getClgName());
            pst.setString(3, s.getCity());
            pst.setDouble(4, s.getPercentage());
            pst.executeUpdate();


        } catch (Exception e) {
            e.printStackTrace();
        }
    
        return flag;
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
