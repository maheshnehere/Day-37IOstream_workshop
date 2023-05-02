package com.bridgelabz;
import java.io.*;
import java.util.Scanner;
public class Workshop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee Details.");
        System.out.println("Enter First Name = ");
        String firstName = sc.next();
        System.out.println("Enter Last Name = ");
        String lastName = sc.next();
        System.out.println("Enter city Name = ");
        String city = sc.next();
        System.out.println("Enter State Name = ");
        String state = sc.next();
        System.out.println("Enter Email = ");
        String email = sc.next();
        System.out.println("Enter Phone Number= ");
        String phoneNumber = sc.next();

        //Writing File.
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("E:\\Student.json"));
            writer.write("FirstName, LastName, City, State, Email, PhoneNumber");
            writer.write("\n" + firstName + " , " + lastName + " , " + city + " , " + state + " , " + email + " , " + phoneNumber);
            writer.close();

            File file = new File("E:\\Employee.json");
            if (file.exists()) {
                System.out.println("File Created Successfully");
            }else {
                throw new EmployeeCustomException("Some Exception Occur.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        //Reading File.

        try {
            BufferedReader reader = new BufferedReader(new FileReader("E:\\Student.json"));
            String line;
            while ((line = reader.readLine()) != null){
                System.out.println(line);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}