package com.neo.dao.daofactory;

import com.neo.idao;

public class MySQLDAOFactory implements AbstractDAOFactory {
    @Override
    public IAdminsDAO createAdminsDAO(WrappedConnector wrappedConnector) {
        return new AdminsDAO(wrappedConnector);
    }

    @Override
    public IStudentsDAO createStudentsDAO(WrappedConnector wrappedConnector) {
        return new StudentsDAO(wrappedConnector);
    }

    @Override
    public IQuestionsDAO createQuestionsDAO(WrappedConnector wrappedConnector) {
        return new QuestionsDAO(wrappedConnector);
    }

    @Override
    public IAnswersDAO createAnswersDAO(WrappedConnector wrappedConnector) {
        return new AnswersDAO(wrappedConnector);
    }

    @Override
    public ICompleteTestsDAO createCompleteTestsDAO(WrappedConnector wrappedConnector) {
        return null;
    }
}
