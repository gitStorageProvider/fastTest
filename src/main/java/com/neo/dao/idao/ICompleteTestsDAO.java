package com.neo.dao.idao;

import com.neo.beans.CompleteTest;
import com.neo.beans.Student;

import java.util.List;

public interface ICompleteTestsDAO extends IDAO<CompleteTest> {
    int getCompleteTestsCount();
    List<CompleteTest> findAllPaginated(int pageNumber, int perPage);
    void deleteAllCompletedTestsByStudent(Student student);
}
