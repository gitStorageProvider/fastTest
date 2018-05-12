//package com.kuriata.interjacentProject.MySQLdao;
//
//import com.kuriata.interjacentProject.idao.ICompleteTestsDAO;
//import com.kuriata.interjacentProject.models.CompleteTest;
//import com.kuriata.interjacentProject.models.Test;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
//import java.util.ArrayList;
//import java.util.List;
//
//public class CompleteTestsDAO implements ICompleteTestsDAO {
//    public static final String TESTS_TABLE_NAME = "completedTests";
//    public static final String SQL_SELECT_ALL_TESTS = "SELECT * FROM "+ TESTS_TABLE_NAME;
//    public static final String  SQL_SELECT_TEST_BY_ID = "SELECT * FROM "+ TESTS_TABLE_NAME + "WHERE id = ?";
//
//    @Override
//    public List<Test> findAll() {
//        List<Test> tests = new ArrayList<>();
//        try (/*Connection cn = ConnectionPool.getConnection();*/ Statement st = /*cn.createStatement()*/ wrappedConnector.getStatement()) {
//            ResultSet rs = st.executeQuery(SQL_SELECT_ALL_TESTS);
//            while (rs.next()) {
//                tests.add(new CompleteTest(rs.getInt("id"),
//                        rs.getInt("student_id"),
//                        rs.getDate("time"),
//                        rs.getDouble("score"),
//                        rs.getInt("q1_id"),
//                        rs.getBoolean("q1_answ1"),
//                        rs.getBoolean("q1_answ2"),
//                        rs.getBoolean("q1_answ3"),
//                        rs.getBoolean("q1_answ4"),
//
//                        rs.getInt("q2_id"),
//                        rs.getBoolean("q2_answ1"),
//                        rs.getBoolean("q2_answ2"),
//                        rs.getBoolean("q2_answ3"),
//                        rs.getBoolean("q2_answ4"),
//
//                        rs.getInt("q3_id"),
//                        rs.getBoolean("q3_answ1"),
//                        rs.getBoolean("q3_answ2"),
//                        rs.getBoolean("q3_answ3"),
//                        rs.getBoolean("q3_answ4"),
//
//                        rs.getInt("q4_id"),
//                        rs.getBoolean("q4_answ1"),
//                        rs.getBoolean("q4_answ2"),
//                        rs.getBoolean("q4_answ3"),
//                        rs.getBoolean("q4_answ4"),
//
//                        rs.getInt("q5_id"),
//                        rs.getBoolean("q5_answ1"),
//                        rs.getBoolean("q5_answ2"),
//                        rs.getBoolean("q5_answ3"),
//                        rs.getBoolean("q5_answ4"),
//
//                        rs.getInt("q6_id"),
//                        rs.getBoolean("q6_answ1"),
//                        rs.getBoolean("q6_answ2"),
//                        rs.getBoolean("q6_answ3"),
//                        rs.getBoolean("q6_answ4"),
//
//                        rs.getInt("q7_id"),
//                        rs.getBoolean("q7_answ1"),
//                        rs.getBoolean("q7_answ2"),
//                        rs.getBoolean("q7_answ3"),
//                        rs.getBoolean("q7_answ4"),
//
//                        rs.getInt("q8_id"),
//                        rs.getBoolean("q8_answ1"),
//                        rs.getBoolean("q8_answ2"),
//                        rs.getBoolean("q8_answ3"),
//                        rs.getBoolean("q8_answ4"),
//
//                        rs.getInt("q9_id"),
//                        rs.getBoolean("q9_answ1"),
//                        rs.getBoolean("q9_answ2"),
//                        rs.getBoolean("q9_answ3"),
//                        rs.getBoolean("q9_answ4"),
//
//                        rs.getInt("q10_id"),
//                        rs.getBoolean("q10_answ1"),
//                        rs.getBoolean("q10_answ2"),
//                        rs.getBoolean("q10_answ3"),
//                        rs.getBoolean("q10_answ4"),
//
//                        rs.getInt("q11_id"),
//                        rs.getBoolean("q11_answ1"),
//                        rs.getBoolean("q11_answ2"),
//                        rs.getBoolean("q11_answ3"),
//                        rs.getBoolean("q11_answ4"),
//
//                        rs.getInt("q12_id"),
//                        rs.getBoolean("q12_answ1"),
//                        rs.getBoolean("q12_answ2"),
//                        rs.getBoolean("q12_answ3"),
//                        rs.getBoolean("q12_answ4"),
//
//                        rs.getInt("q13_id"),
//                        rs.getBoolean("q13_answ1"),
//                        rs.getBoolean("q13_answ2"),
//                        rs.getBoolean("q13_answ3"),
//                        rs.getBoolean("q13_answ4"),
//
//                        rs.getInt("q14_id"),
//                        rs.getBoolean("q14_answ1"),
//                        rs.getBoolean("q14_answ2"),
//                        rs.getBoolean("q14_answ3"),
//                        rs.getBoolean("q14_answ4"),
//
//                        rs.getInt("q15_id"),
//                        rs.getBoolean("q15_answ1"),
//                        rs.getBoolean("q15_answ2"),
//                        rs.getBoolean("q15_answ3"),
//                        rs.getBoolean("q15_answ4"),
//
//                        rs.getInt("q16_id"),
//                        rs.getBoolean("q16_answ1"),
//                        rs.getBoolean("q16_answ2"),
//                        rs.getBoolean("q16_answ3"),
//                        rs.getBoolean("q16_answ4"),
//
//                        rs.getInt("q17_id"),
//                        rs.getBoolean("q17_answ1"),
//                        rs.getBoolean("q17_answ2"),
//                        rs.getBoolean("q17_answ3"),
//                        rs.getBoolean("q17_answ4"),
//
//                        rs.getInt("q18_id"),
//                        rs.getBoolean("q18_answ1"),
//                        rs.getBoolean("q18_answ2"),
//                        rs.getBoolean("q18_answ3"),
//                        rs.getBoolean("q18_answ4"),
//
//                        rs.getInt("q19_id"),
//                        rs.getBoolean("q19_answ1"),
//                        rs.getBoolean("q19_answ2"),
//                        rs.getBoolean("q19_answ3"),
//                        rs.getBoolean("q19_answ4"),
//
//                        rs.getInt("q20_id"),
//                        rs.getBoolean("q20_answ1"),
//                        rs.getBoolean("q20_answ2"),
//                        rs.getBoolean("q20_answ3"),
//                        rs.getBoolean("q20_answ4"));
//            }
//        } catch (SQLException e) {
//            //ToDo: change next line to logging via log4j
//            //e.printStackTrace();
//            System.err.println("SQL exception (request or table failed): " + e);
//        } finally {
//            //super.closeStatement(st);
//            //close needed returning connection to pool
//        }
//        return tests;
//    }
//
//    @Override
//    //ToDo: realize method
//        public Test findById(int id) {
//        return null;
//    }
//
//    @Override
//    //ToDo: realize method
//    public void deleteById(int id) {
//
//    }
//}
