-- Create Department Table
CREATE TABLE department (
                            department_id INT PRIMARY KEY AUTO_INCREMENT,
                            capacity INT NOT NULL,
                            name VARCHAR(255)
);

-- Create Domain Table
CREATE TABLE domain (
                        domain_id INT PRIMARY KEY AUTO_INCREMENT,
                        batch VARCHAR(255),
                        capacity INT NOT NULL,
                        program VARCHAR(255),
                        qualification VARCHAR(255)
);

-- Create Employee Table
CREATE TABLE employee (
                          employee_id INT PRIMARY KEY AUTO_INCREMENT,
                          email VARCHAR(255) UNIQUE NOT NULL,
                          password VARCHAR(255),
                          title VARCHAR(255),
                          username VARCHAR(255),
                          department INT
);

-- Create Organization Table
CREATE TABLE organization (
                              id INT PRIMARY KEY AUTO_INCREMENT,
                              address VARCHAR(255),
                              name VARCHAR(255)
);

-- Create Placement Table
CREATE TABLE placement (
                           id INT PRIMARY KEY AUTO_INCREMENT,
                           description VARCHAR(255),
                           intake INT,
                           minimum_grade FLOAT,
                           organization VARCHAR(255),
                           profile VARCHAR(255)
);

-- Create PlacementFilter Table
CREATE TABLE placement_filter (
                                  id INT PRIMARY KEY AUTO_INCREMENT,
                                  domain INT,
                                  placement_id INT,
                                  specialization INT
);

-- Create Specialization Table
CREATE TABLE specialization (
                                specialization_id INT PRIMARY KEY AUTO_INCREMENT,
                                code VARCHAR(255),
                                credits_required INT NOT NULL,
                                description VARCHAR(255),
                                name VARCHAR(255),
                                year VARCHAR(255)
);
