package com.neo.dao.idao;

import com.neo.beans.Student;

import java.util.List;

public interface IStudentsDAO extends IDAO<Student>{
    List<Student> findByRating(RatingComparingConstant ratingComparingConstant, double... rating);
    List<Student> findByLastName(String lastName);
    Student login(String studentEmail);
}
