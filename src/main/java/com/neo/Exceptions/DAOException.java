package com.neo.Exceptions;

import java.sql.SQLException;

public class DAOException extends SQLException{
    public DAOException(String reason, Throwable cause) {
        super(reason, cause);
    }
}
