-- Create a simple users table
CREATE TABLE IF NOT EXISTS users (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    username TEXT NOT NULL UNIQUE,
    password TEXT NOT NULL,
    email TEXT NOT NULL UNIQUE,
    created_at DATETIME DEFAULT CURRENT_TIMESTAMP,
    deleted_at DATETIME
);

-- Insert some initial data
INSERT OR IGNORE INTO users (username, password, email) VALUES 
('admin', 'admin', 'admin@example.com'),
('user', 'user', 'user@example.com');