package com.neo.service.iservice;

public class iStudentService {
    getAllStudents();
    getAllStudentsPaginated(int pageNumber, int perPage);
    getStudentByID();
    getStudentTests(Student student);
    int generated_id addStudent(Student student);
    updateStudent(Student student);
    deleteStudent(Student student);
}
