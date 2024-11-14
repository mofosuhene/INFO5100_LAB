show databases;

create database medicaldb;
USE medicaldb;

CREATE TABLE patient (
    id INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(100),
    gender VARCHAR(10),
    patient_type VARCHAR(50)
);

INSERT INTO patient(name, gender, patient_type)
VALUE('Marcia', 'FEMALE', 'Appointment');

SELECT * FROM patient;
