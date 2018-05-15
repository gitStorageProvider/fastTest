package com.neo.dao.mysqldao;

import com.neo.beans.Admin;
import com.neo.beans.CompleteTest;
import com.neo.dao.connection.WrappedConnection;
import com.neo.dao.idao.ICompleteTestsDAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static com.neo.dao.mysqldao.AdminsDAO.SQL_SELECT_ADMIN_BY_ID;

public class CompleteTestsDAO implements ICompleteTestsDAO {
    public static final String TESTS_TABLE_NAME = "completedTests";
    public static final String SQL_SELECT_ALL_TESTS = "SELECT * FROM " + TESTS_TABLE_NAME;
    public static final String SQL_SELECT_TEST_BY_ID = "SELECT * FROM " + TESTS_TABLE_NAME + "WHERE id = ?";
    public static final String SQL_INSERT_TEST = "INSERT INTO " + TESTS_TABLE_NAME + " VALUES (?, ?, ?)"НЕПРАВИЛЬНА КЫЛЬКЫСТЬ ПАРАМЕТРЫВ


    private WrappedConnection wrappedConnector;

    public CompleteTestsDAO(WrappedConnection wrappedConnector) {
//        Соединение с базой данных инициирует конструктор DAO, либо получает
//        его из пула. В методе остаются возможности по созданию экземпляра Statement
//        для выполнения запросов и его закрытию. В данной реализации использовался
//        класс-обертка для соединения, инкапсулирующий процесс создания соедине-
//        ния и упрощающий его использование. Такой подход при организации пула
//        соединений из экземпляров классов-оберток резко затрудняет попадание в пул
//        «диких» соединений, созданных программистом в обход пула.
        this.wrappedConnector = wrappedConnector;
    }

    @Override
    public List<CompleteTest> findAll() {
        List<CompleteTest> tests = new ArrayList<>();
        try (/*Connection cn = ConnectionPool.getConnection();*/ Statement st = /*cn.createStatement()*/ wrappedConnector.getStatement()) {
            ResultSet rs = st.executeQuery(SQL_SELECT_ALL_TESTS);
            while (rs.next()) {
                tests.add(new CompleteTest(rs.getInt("id"),
                        rs.getInt("student_id"),
                        rs.getDate("time"),
                        rs.getDouble("score"),
                        rs.getInt("q1_id"),
                        rs.getBoolean("q1_answ1"),
                        rs.getBoolean("q1_answ2"),
                        rs.getBoolean("q1_answ3"),
                        rs.getBoolean("q1_answ4"),

                        rs.getInt("q2_id"),
                        rs.getBoolean("q2_answ1"),
                        rs.getBoolean("q2_answ2"),
                        rs.getBoolean("q2_answ3"),
                        rs.getBoolean("q2_answ4"),

                        rs.getInt("q3_id"),
                        rs.getBoolean("q3_answ1"),
                        rs.getBoolean("q3_answ2"),
                        rs.getBoolean("q3_answ3"),
                        rs.getBoolean("q3_answ4"),

                        rs.getInt("q4_id"),
                        rs.getBoolean("q4_answ1"),
                        rs.getBoolean("q4_answ2"),
                        rs.getBoolean("q4_answ3"),
                        rs.getBoolean("q4_answ4"),

                        rs.getInt("q5_id"),
                        rs.getBoolean("q5_answ1"),
                        rs.getBoolean("q5_answ2"),
                        rs.getBoolean("q5_answ3"),
                        rs.getBoolean("q5_answ4"),

                        rs.getInt("q6_id"),
                        rs.getBoolean("q6_answ1"),
                        rs.getBoolean("q6_answ2"),
                        rs.getBoolean("q6_answ3"),
                        rs.getBoolean("q6_answ4"),

                        rs.getInt("q7_id"),
                        rs.getBoolean("q7_answ1"),
                        rs.getBoolean("q7_answ2"),
                        rs.getBoolean("q7_answ3"),
                        rs.getBoolean("q7_answ4"),

                        rs.getInt("q8_id"),
                        rs.getBoolean("q8_answ1"),
                        rs.getBoolean("q8_answ2"),
                        rs.getBoolean("q8_answ3"),
                        rs.getBoolean("q8_answ4"),

                        rs.getInt("q9_id"),
                        rs.getBoolean("q9_answ1"),
                        rs.getBoolean("q9_answ2"),
                        rs.getBoolean("q9_answ3"),
                        rs.getBoolean("q9_answ4"),

                        rs.getInt("q10_id"),
                        rs.getBoolean("q10_answ1"),
                        rs.getBoolean("q10_answ2"),
                        rs.getBoolean("q10_answ3"),
                        rs.getBoolean("q10_answ4")
            }
        } catch (SQLException e) {
            //ToDo: change next line to logging via log4j
            //e.printStackTrace();
            throw new DAOExeption("SQL exception (request or table failed): ", e);
        } finally {
            //super.closeStatement(st);
            //close needed returning connection to pool
        }
        return tests;
    }

    @Override
    //ToDo: realize method
    public CompleteTest findById(int id) {
        return null;
        try (final PreparedStatement pSt = this.wrappedConnector.prepareStatement(SQL_SELECT_ADMIN_BY_ID)) {
            pSt.setInt(1, id);
            try (final ResultSet rs = pSt.executeQuery()) {
                while (rs.next()) {
                    return new CompleteTest(rs.getInt("id"),
                            rs.getInt("student_id"),
                            rs.getDate("time"),
                            rs.getDouble("score"),
                            rs.getInt("q1_id"),
                            rs.getBoolean("q1_answ1"),
                            rs.getBoolean("q1_answ2"),
                            rs.getBoolean("q1_answ3"),
                            rs.getBoolean("q1_answ4"),

                            rs.getInt("q2_id"),
                            rs.getBoolean("q2_answ1"),
                            rs.getBoolean("q2_answ2"),
                            rs.getBoolean("q2_answ3"),
                            rs.getBoolean("q2_answ4"),

                            rs.getInt("q3_id"),
                            rs.getBoolean("q3_answ1"),
                            rs.getBoolean("q3_answ2"),
                            rs.getBoolean("q3_answ3"),
                            rs.getBoolean("q3_answ4"),

                            rs.getInt("q4_id"),
                            rs.getBoolean("q4_answ1"),
                            rs.getBoolean("q4_answ2"),
                            rs.getBoolean("q4_answ3"),
                            rs.getBoolean("q4_answ4"),

                            rs.getInt("q5_id"),
                            rs.getBoolean("q5_answ1"),
                            rs.getBoolean("q5_answ2"),
                            rs.getBoolean("q5_answ3"),
                            rs.getBoolean("q5_answ4"),

                            rs.getInt("q6_id"),
                            rs.getBoolean("q6_answ1"),
                            rs.getBoolean("q6_answ2"),
                            rs.getBoolean("q6_answ3"),
                            rs.getBoolean("q6_answ4"),

                            rs.getInt("q7_id"),
                            rs.getBoolean("q7_answ1"),
                            rs.getBoolean("q7_answ2"),
                            rs.getBoolean("q7_answ3"),
                            rs.getBoolean("q7_answ4"),

                            rs.getInt("q8_id"),
                            rs.getBoolean("q8_answ1"),
                            rs.getBoolean("q8_answ2"),
                            rs.getBoolean("q8_answ3"),
                            rs.getBoolean("q8_answ4"),

                            rs.getInt("q9_id"),
                            rs.getBoolean("q9_answ1"),
                            rs.getBoolean("q9_answ2"),
                            rs.getBoolean("q9_answ3"),
                            rs.getBoolean("q9_answ4"),

                            rs.getInt("q10_id"),
                            rs.getBoolean("q10_answ1"),
                            rs.getBoolean("q10_answ2"),
                            rs.getBoolean("q10_answ3"),
                            rs.getBoolean("q10_answ4"));
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        throw new IllegalStateException(String.format("Admin %s does not exists", id));
    }



    @Override
    //ToDo: realize method
    public void deleteById(int id) {

    }
}
