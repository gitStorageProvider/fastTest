package com.neo.dao.mysqldao;

import com.kuriata.interjacentProject.idao.IAnswersDAO;
import com.kuriata.interjacentProject.models.Answer;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AnswersDAO implements IAnswersDAO {
    public static final String ANSWERS_TABLE_NAME = "answers";
    public static final String SQL_SELECT_ANSWER_BY_ID = "SELECT * FROM " + ANSWERS_TABLE_NAME + " WHERE id = ?";
    public static final String SQL_INSERT_ANSWER = "INSERT INTO " + ANSWERS_TABLE_NAME + "(item_1, item_2, item_3, item_4) VALUES (?, ?, ?, ?)";

    private WrappedConnector wrappedConnector;

    public AnswersDAO(WrappedConnector wrappedConnector){
        this.wrappedConnector = wrappedConnector;
    }


    public Answer getAnswer(int id) {
        try (final PreparedStatement pSt = this.wrappedConnector.prepareStatement(SQL_SELECT_ANSWER_BY_ID)) {
            pSt.setInt(1, id);
            try (final ResultSet rs = pSt.executeQuery()) {
                while (rs.next()) {
                    return new Answer(rs.getInt("id"),
                            rs.getBoolean("item_1"),
                            rs.getBoolean("item_2"),
                            rs.getBoolean("item_3"),
                            rs.getBoolean("item_4"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        throw new IllegalStateException(String.format("Answer %s does not exists", id));
    }

    public int createAnswer(Answer answer) {
        try (final PreparedStatement pSt = wrappedConnector.prepareStatement(SQL_INSERT_ANSWER)) {
            pSt.setBoolean(1, answer.isItem1());
            pSt.setBoolean(2, answer.isItem2());
            pSt.setBoolean(3, answer.isItem3());
            pSt.setBoolean(4, answer.isItem4());
            pSt.executeUpdate();
            try (ResultSet generatedKeys = pSt.getGeneratedKeys()) {
                if (generatedKeys.next())
                    return generatedKeys.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        throw new IllegalStateException("Could not add answer to DB");
    }
}
