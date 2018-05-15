package com.neo.dao.idao;

import com.neo.beans.Question;
import com.neo.exceptions.DAOException;

import java.util.List;

public interface IQuestionsDAO extends IDAO<Question> {
    //get all questions ids for generationg new test
    List<Integer> getAllQuestionsId() throws DAOException;

}
