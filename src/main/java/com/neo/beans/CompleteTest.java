package com.neo.beans;

import java.sql.Date;

public class CompleteTest extends BaseEntity {
//    private int id;     <--inherited
    private Date date;
    private double score;
    private boolean q1_id, q1_answ1,q1_answ2, q1_answ3, q1_answ4,
            q2_id, q2_answ1,q2_answ2, q2_answ3, q2_answ4,
            q3_id, q3_answ1,q3_answ2, q3_answ3, q3_answ4,
            q4_id, q4_answ1,q4_answ2, q4_answ3, q4_answ4,
            q5_id, q5_answ1,q5_answ2, q5_answ3, q5_answ4,
            q6_id, q6_answ1,q6_answ2, q6_answ3, q6_answ4,
            q7_id, q7_answ1,q7_answ2, q7_answ3, q7_answ4,
            q8_id, q8_answ1,q8_answ2, q8_answ3, q8_answ4,
            q9_id, q9_answ1,q9_answ2, q9_answ3, q9_answ4,
            q10_id, q10_answ1,q10_answ2, q10_answ3, q10_answ4,
            q11_id, q11_answ1,q11_answ2, q11_answ3, q11_answ4,
            q12_id, q12_answ1,q12_answ2, q12_answ3, q12_answ4,
            q13_id, q13_answ1,q13_answ2, q13_answ3, q13_answ4,
            q14_id, q14_answ1,q14_answ2, q14_answ3, q14_answ4,
            q15_id, q15_answ1,q15_answ2, q15_answ3, q15_answ4,
            q16_id, q16_answ1,q16_answ2, q16_answ3, q16_answ4,
            q17_id, q17_answ1,q17_answ2, q17_answ3, q17_answ4,
            q18_id, q18_answ1,q18_answ2, q18_answ3, q18_answ4,
            q19_id, q19_answ1,q19_answ2, q19_answ3, q19_answ4,
            q20_id, q20_answ1,q20_answ2, q20_answ3, q20_answ4;

    public CompleteTest(){}
    public CompleteTest( int id, Date date, double score,
                         boolean q1_id, boolean q1_answ1, boolean q1_answ2, boolean q1_answ3, boolean q1_answ4,
                         boolean q2_id, boolean q2_answ1, boolean q2_answ2, boolean q2_answ3, boolean q2_answ4,
                         boolean q3_id, boolean q3_answ1, boolean q3_answ2, boolean q3_answ3, boolean q3_answ4,
                         boolean q4_id, boolean q4_answ1, boolean q4_answ2, boolean q4_answ3, boolean q4_answ4,
                         boolean q5_id, boolean q5_answ1, boolean q5_answ2, boolean q5_answ3, boolean q5_answ4,
                         boolean q6_id, boolean q6_answ1, boolean q6_answ2, boolean q6_answ3, boolean q6_answ4,
                         boolean q7_id, boolean q7_answ1, boolean q7_answ2, boolean q7_answ3, boolean q7_answ4,
                         boolean  q8_id, boolean q8_answ1,boolean q8_answ2, boolean q8_answ3, boolean q8_answ4,
                         boolean q9_id, boolean q9_answ1, boolean q9_answ2, boolean q9_answ3, boolean q9_answ4,
                         boolean q10_id, boolean q10_answ1, boolean q10_answ2, boolean q10_answ3, boolean q10_answ4,
                         boolean q11_id, boolean q11_answ1, boolean q11_answ2, boolean q11_answ3, boolean q11_answ4,
                         boolean  q12_id, boolean q12_answ1, boolean q12_answ2, boolean q12_answ3, boolean q12_answ4,
                         boolean  q13_id, boolean q13_answ1, boolean q13_answ2, boolean q13_answ3, boolean q13_answ4,
                         boolean  q14_id, boolean q14_answ1, boolean q14_answ2, boolean q14_answ3, boolean q14_answ4,
                         boolean  q15_id, boolean q15_answ1, boolean q15_answ2, boolean q15_answ3, boolean q15_answ4,
                         boolean  q16_id, boolean q16_answ1, boolean q16_answ2, boolean q16_answ3, boolean q16_answ4,
                         boolean  q17_id, boolean q17_answ1, boolean q17_answ2, boolean q17_answ3, boolean q17_answ4,
                         boolean  q18_id, boolean q18_answ1, boolean q18_answ2, boolean q18_answ3, boolean q18_answ4,
                         boolean  q19_id, boolean q19_answ1, boolean q19_answ2, boolean q19_answ3, boolean q19_answ4,
                         boolean  q20_id, boolean q20_answ1, boolean q20_answ2, boolean q20_answ3, boolean q20_answ4){
        this.setId(id); this.date = date; this.score = score;
        this.q1_id = q1_id; this.q1_answ1 = q1_answ1; this.q1_answ2 = q1_answ2; this.q1_answ3 = q1_answ3; this.q1_answ4 = q1_answ4;
        this.q2_id = q2_id; this.q2_answ1 = q2_answ1; this.q2_answ2 = q2_answ2; this.q2_answ3 = q2_answ3; this.q2_answ4 = q2_answ4;
        this.q3_id = q3_id; this.q3_answ1 = q3_answ1; this.q3_answ2 = q3_answ2; this.q3_answ3 = q3_answ3; this.q3_answ4 = q3_answ4;
        this.q4_id = q4_id; this.q4_answ1 = q4_answ1; this.q4_answ2 = q4_answ2; this.q4_answ3 = q4_answ3; this.q4_answ4 = q4_answ4;
        this.q5_id = q5_id; this.q5_answ1 = q5_answ1; this.q5_answ2 = q5_answ2; this.q5_answ3 = q5_answ3; this.q5_answ4 = q5_answ4;
        this.q6_id = q6_id; this.q6_answ1 = q6_answ1; this.q6_answ2 = q6_answ2; this.q6_answ3 = q6_answ3; this.q6_answ4 = q6_answ4;
        this.q7_id = q7_id; this.q7_answ1 = q7_answ1; this.q7_answ2 = q7_answ2; this.q7_answ3 = q7_answ3; this.q7_answ4 = q7_answ4;
        this.q8_id = q8_id; this.q8_answ1 = q8_answ1; this.q8_answ2 = q8_answ2; this.q8_answ3 = q8_answ3; this.q8_answ4 = q8_answ4;
        this.q9_id = q9_id; this.q9_answ1 = q9_answ1; this.q9_answ2 = q9_answ2; this.q9_answ3 = q9_answ3; this.q9_answ4 = q9_answ4;
        this.q10_id = q10_id; this.q10_answ1 = q10_answ1; this.q10_answ2 = q10_answ2; this.q10_answ3 = q10_answ3; this.q10_answ4 = q10_answ4;
        this.q11_id = q11_id; this.q11_answ1 = q11_answ1; this.q11_answ2 = q11_answ2; this.q11_answ3 = q11_answ3; this.q11_answ4 = q11_answ4;
        this.q12_id = q12_id; this.q12_answ1 = q12_answ1; this.q12_answ2 = q12_answ2; this.q12_answ3 = q12_answ3; this.q12_answ4 = q12_answ4;
        this.q13_id = q13_id; this.q13_answ1 = q13_answ1; this.q13_answ2 = q13_answ2; this.q13_answ3 = q13_answ3; this.q13_answ4 = q13_answ4;
        this.q14_id = q14_id; this.q14_answ1 = q14_answ1; this.q14_answ2 = q14_answ2; this.q14_answ3 = q14_answ3; this.q14_answ4 = q14_answ4;
        this.q15_id = q15_id; this.q15_answ1 = q15_answ1; this.q15_answ2 = q15_answ2; this.q15_answ3 = q15_answ3; this.q15_answ4 = q15_answ4;
        this.q16_id = q16_id; this.q16_answ1 = q16_answ1; this.q16_answ2 = q16_answ2; this.q16_answ3 = q16_answ3; this.q16_answ4 = q16_answ4;
        this.q17_id = q17_id; this.q17_answ1 = q17_answ1; this.q17_answ2 = q17_answ2; this.q17_answ3 = q17_answ3; this.q17_answ4 = q17_answ4;
        this.q18_id = q18_id; this.q18_answ1 = q18_answ1; this.q18_answ2 = q18_answ2; this.q18_answ3 = q18_answ3; this.q18_answ4 = q18_answ4;
        this.q19_id = q19_id; this.q19_answ1 = q19_answ1; this.q19_answ2 = q19_answ2; this.q19_answ3 = q19_answ3; this.q19_answ4 = q19_answ4;
        this.q20_id = q20_id; this.q20_answ1 = q20_answ1; this.q20_answ2 = q20_answ2; this.q20_answ3 = q20_answ3; this.q20_answ4 = q20_answ4;
    }

    @Override
    public String toString() {
        return "CompleteTest{" +
                "date=" + date +
                ", score=" + score +
                ", q1_id=" + q1_id +
                ", q1_answ1=" + q1_answ1 +
                ", q1_answ2=" + q1_answ2 +
                ", q1_answ3=" + q1_answ3 +
                ", q1_answ4=" + q1_answ4 +
                ", \nq2_id=" + q2_id +
                ", q2_answ1=" + q2_answ1 +
                ", q2_answ2=" + q2_answ2 +
                ", q2_answ3=" + q2_answ3 +
                ", q2_answ4=" + q2_answ4 +
                ", \nq3_id=" + q3_id +
                ", q3_answ1=" + q3_answ1 +
                ", q3_answ2=" + q3_answ2 +
                ", q3_answ3=" + q3_answ3 +
                ", q3_answ4=" + q3_answ4 +
                ", \nq4_id=" + q4_id +
                ", q4_answ1=" + q4_answ1 +
                ", q4_answ2=" + q4_answ2 +
                ", q4_answ3=" + q4_answ3 +
                ", q4_answ4=" + q4_answ4 +
                ", \nq5_id=" + q5_id +
                ", q5_answ1=" + q5_answ1 +
                ", q5_answ2=" + q5_answ2 +
                ", q5_answ3=" + q5_answ3 +
                ", q5_answ4=" + q5_answ4 +
                ", \nq6_id=" + q6_id +
                ", q6_answ1=" + q6_answ1 +
                ", q6_answ2=" + q6_answ2 +
                ", q6_answ3=" + q6_answ3 +
                ", q6_answ4=" + q6_answ4 +
                ", \nq7_id=" + q7_id +
                ", q7_answ1=" + q7_answ1 +
                ", q7_answ2=" + q7_answ2 +
                ", q7_answ3=" + q7_answ3 +
                ", q7_answ4=" + q7_answ4 +
                ", \nq8_id=" + q8_id +
                ", q8_answ1=" + q8_answ1 +
                ", q8_answ2=" + q8_answ2 +
                ", q8_answ3=" + q8_answ3 +
                ", q8_answ4=" + q8_answ4 +
                ", \nq9_id=" + q9_id +
                ", q9_answ1=" + q9_answ1 +
                ", q9_answ2=" + q9_answ2 +
                ", q9_answ3=" + q9_answ3 +
                ", q9_answ4=" + q9_answ4 +
                ", \nq10_id=" + q10_id +
                ", q10_answ1=" + q10_answ1 +
                ", q10_answ2=" + q10_answ2 +
                ", q10_answ3=" + q10_answ3 +
                ", q10_answ4=" + q10_answ4 +
                ", \nq11_id=" + q11_id +
                ", q11_answ1=" + q11_answ1 +
                ", q11_answ2=" + q11_answ2 +
                ", q11_answ3=" + q11_answ3 +
                ", q11_answ4=" + q11_answ4 +
                ", \nq12_id=" + q12_id +
                ", q12_answ1=" + q12_answ1 +
                ", q12_answ2=" + q12_answ2 +
                ", q12_answ3=" + q12_answ3 +
                ", q12_answ4=" + q12_answ4 +
                ", \nq13_id=" + q13_id +
                ", q13_answ1=" + q13_answ1 +
                ", q13_answ2=" + q13_answ2 +
                ", q13_answ3=" + q13_answ3 +
                ", q13_answ4=" + q13_answ4 +
                ", \nq14_id=" + q14_id +
                ", q14_answ1=" + q14_answ1 +
                ", q14_answ2=" + q14_answ2 +
                ", q14_answ3=" + q14_answ3 +
                ", q14_answ4=" + q14_answ4 +
                ", \nq15_id=" + q15_id +
                ", q15_answ1=" + q15_answ1 +
                ", q15_answ2=" + q15_answ2 +
                ", q15_answ3=" + q15_answ3 +
                ", q15_answ4=" + q15_answ4 +
                ", \nq16_id=" + q16_id +
                ", q16_answ1=" + q16_answ1 +
                ", q16_answ2=" + q16_answ2 +
                ", q16_answ3=" + q16_answ3 +
                ", q16_answ4=" + q16_answ4 +
                ", \nq17_id=" + q17_id +
                ", q17_answ1=" + q17_answ1 +
                ", q17_answ2=" + q17_answ2 +
                ", q17_answ3=" + q17_answ3 +
                ", q17_answ4=" + q17_answ4 +
                ", \nq18_id=" + q18_id +
                ", q18_answ1=" + q18_answ1 +
                ", q18_answ2=" + q18_answ2 +
                ", q18_answ3=" + q18_answ3 +
                ", q18_answ4=" + q18_answ4 +
                ", \nq19_id=" + q19_id +
                ", q19_answ1=" + q19_answ1 +
                ", q19_answ2=" + q19_answ2 +
                ", q19_answ3=" + q19_answ3 +
                ", q19_answ4=" + q19_answ4 +
                ", \nq20_id=" + q20_id +
                ", q20_answ1=" + q20_answ1 +
                ", q20_answ2=" + q20_answ2 +
                ", q20_answ3=" + q20_answ3 +
                ", q20_answ4=" + q20_answ4 +
                '}';
    }
}
