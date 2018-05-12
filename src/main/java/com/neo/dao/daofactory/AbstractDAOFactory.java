package com.neo.dao.daofactory;

public abstract class AbstractDAOFactory {
    private static SupportedDatabases currentDatabase = SupportedDatabases.MYSQL;

    public static IDAOFactory getDAOFactory() throws DAOException {
        IDAOFactory factory = null;
        try {
            switch (currentDatabase) {
                case MYSQL:
                    factory = MySQLDAOFactory.getInstance();
                case ORALCE:
                    throw new UnsupportedOperationException("Oracle DAOFactory not supported by AbstractDAOFactory.");
            }
        } catch (Exception e) {
            throw new DAOException("Excepthion in AbstractDAOFactory while creationg new factory.");
        }
        return factory;
    }

    private static synchronized void setDatabase(SupportedDatabases currentDatabase){
        AbstractDAOFactory.currentDatabase = currentDatabase;
    }
}
