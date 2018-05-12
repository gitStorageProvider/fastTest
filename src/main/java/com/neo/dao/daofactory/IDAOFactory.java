package com.neo.dao.daofactory;

import com.neo.Exceptions.DAOException;

public interface IDAOFactory {
    IAdminsDAO getAdminsDAO(WrappedConnector wrappedConnector) throws DAOException;

    IStudentsDAO getStudentsDAO(WrappedConnector wrappedConnector) throws DAOException;

    IQuestionsDAO getQuestionsDAO(WrappedConnector wrappedConnector) throws DAOException;

    IAnswersDAO getAnswersDAO(WrappedConnector wrappedConnector) throws DAOException;

    ICompleteTestsDAO getCompleteTestsDAO(WrappedConnector wrappedConnector) throws DAOException;
}
