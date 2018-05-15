package com.neo.dao.idao;

import com.neo.beans.Question;

public interface IQuestionsDAO extends IDAO<Question>{
    //get all questions ids for generationg new test
    List<Integer> getAllQuestionsId ();
}
