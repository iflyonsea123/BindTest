// IStudentManager.aidl
package com.okeyen.bindtest;

// Declare any non-default types here with import statements

interface IStudentManager {
    List<Student> getStudentList();
    void addStudent(in Student student);
}
