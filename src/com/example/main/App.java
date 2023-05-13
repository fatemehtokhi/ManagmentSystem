package com.example.main;

import java.util.Scanner;

import com.example.dao.StudentDao;
import com.example.dao.StudentDaoInterface;
import com.example.model.Student;

public class App {
    public static void main(String[] args) throws Exception {
        StudentDaoInterface dao = new StudentDao() {
            
        };
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Student Managment application");
        while (true){
            System.out.println("\n1.Add Student " + "\n2.Show All Students" + "\n3.Get Student based on roll number " + "\n5.Delete Student" + "\n6.Exit");
            System.out.println("Enter choice");
            int ch = sc.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter Student name");
                    String name =sc.next();
                    System.out.println("Enter Student clg name");
                    String clgName = sc.next();
                    System.out.println("Enter city");
                    String city = sc.next();
                    System.out.println("Enter Percentage ");
                    Double percentage = sc.nextDouble();
                    Student st  = new Student (name,clgName,city,percentage);
                    boolean ans = dao.insertStudent(st);
                    if (ans) {
                        System.out.println("Record inserted successfully");
                    } else {
                        System.out.println("Something went wrong, please try again");
                        
                        
                    }
                     
                    

                    break;
                case 2:
                    System.out.println("show all Students");
                    break;
                case 3:
                    System.out.println("Get students based on rollnumber");
                    break;
                case 4:
                    System.out.println("Delete Student");
                    break;
                case 5:
                    System.out.println("update Student");
                    break;
                case 6:
                    System.out.println("thank you for using this application");
                    System.exit(0);
                    default:
                    System.out.println("please enter vali number");

                    
            }
        }
    }
}
