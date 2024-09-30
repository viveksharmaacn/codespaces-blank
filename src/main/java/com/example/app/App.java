package com.example.app;

import java.util.Scanner;

import com.example.dao.UserMapper;
import com.example.model.User;

public class App {

    public static void main(String[] args) {
        // Instantiate the UserMapper implementation
        UserMapper userMapper = new UserMapper.InMemoryUserMapper();
        // Get user details from CLI
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter email ID: ");
        String email = scanner.nextLine();

        System.out.print("Enter age: ");
        int age = scanner.nextInt();

        // Add a new user with the provided details
        User newUser = new User(3, username, email, age);
        userMapper.addUser(newUser);

        // Print all users
        System.out.println("All users:");
        userMapper.getAllUsers().forEach(System.out::println);

        // Get user by ID
        System.out.println("User with ID 1:");
        System.out.println(userMapper.getUserById(1));
    }
}

