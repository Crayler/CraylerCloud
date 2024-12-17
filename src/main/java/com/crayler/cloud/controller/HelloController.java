package com.crayler.cloud.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

@Controller
public class HelloController {
    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @GetMapping("/hello")
    public String hello(Model model) {
        try {
            // Load SQLite JDBC driver
            Class.forName("org.sqlite.JDBC");
            
            // Connect to the SQLite database
            String url = "jdbc:sqlite:cloud.db";
            List<String> usernames = new ArrayList<>();
            
            try (Connection conn = DriverManager.getConnection(url);
                 Statement stmt = conn.createStatement();
                 ResultSet rs = stmt.executeQuery("SELECT username FROM users")) {
                
                while (rs.next()) {
                    usernames.add(rs.getString("username"));
                }
            }
            
            model.addAttribute("message", "Hello, Thymeleaf!");
            model.addAttribute("users", usernames);
        } catch (Exception e) {
            model.addAttribute("message", "Error: " + e.getMessage());
        }
        
        return "hello";
    }
}