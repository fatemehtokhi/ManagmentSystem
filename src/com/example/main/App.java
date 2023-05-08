package com.example.main;

import java.util.Scanner;

import com.example.dao.StudentDao;
import com.example.model.Student;

public class App {
    public static void main(String[] args) throws Exception {
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
                    System.out.println("Thank you for registeration");
                    System.exit(ch);

                default:

                    
            }
        }
    }
}
