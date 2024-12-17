package com.crayler.cloud.config;

import org.springframework.context.annotation.Configuration;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.io.File;

@Configuration
public class DatabaseConfig {
    public DatabaseConfig() {
        initializeDatabase();
    }

    private void initializeDatabase() {
        try {
            // Ensure the database file is created
            String url = "jdbc:sqlite:cloud.db";
            File dbFile = new File("cloud.db");
            
            if (!dbFile.exists()) {
                try (Connection conn = DriverManager.getConnection(url);
                     Statement stmt = conn.createStatement()) {
                    
                    // Create users table
                    stmt.execute("CREATE TABLE IF NOT EXISTS users (" +
                            "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                            "username TEXT NOT NULL UNIQUE," +
                            "email TEXT NOT NULL UNIQUE," +
                            "created_at DATETIME DEFAULT CURRENT_TIMESTAMP)");
                    
                    // Insert initial data
                    stmt.execute("INSERT OR IGNORE INTO users (username, email) VALUES " +
                            "('admin', 'admin@example.com')," +
                            "('user', 'user@example.com')");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}