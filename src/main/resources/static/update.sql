/* 
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/SQLTemplate.sql to edit this template
 */
/**
 * Author:  YadavK
 * Created: 24-Nov-2025
 */
DROP DATABASE IF EXISTS question;
CREATE DATABASE question;

CREATE TABLE questions (
    id SERIAL PRIMARY KEY,
    category VARCHAR(255),
    difficulty_level VARCHAR(100),
    option1 VARCHAR(500),
    option2 VARCHAR(500),
    option3 VARCHAR(500),
    option4 VARCHAR(500),
    question_title TEXT,
    right_answer VARCHAR(500)
);

