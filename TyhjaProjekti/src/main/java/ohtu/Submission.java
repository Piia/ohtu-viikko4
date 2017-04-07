package ohtu;

import java.util.ArrayList;

public class Submission {
    
    private String id;
    private String student_number;
    private String last_name;
    private String first_name;
    private String week;
    private String points;
    private String identifier;
    private String hours;
    private String comments;
    private String email;
    private String a1;
    private String a2;
    private String a3;
    private String a4;
    private String a5;
    private String a6;
    private String a7;
    private String a8;
    private String a9;
    private String a10;
    private String a11;
    private String a12;
    private String a13;
    private String a14;
    private String a15;
    private String a16;
    private String a17;
    private String a18;
    private String a19;
    private String a20;
    private String a21;
    private String created_at;
    private String updated_at;
    private String course_id;
    private String github;
    private String student_id;
    private String challenging;
    
    private int count;
    private String exercises;
    
    public int getCount() {
        return count;
    }
    
    public String exercises() {
        return exercises;
    }

    public String getWeek() {
        return week;
    }
    public String getStudent_number() {
        return student_number;
    }

    public void setStudent_number(String student_number) {
        this.student_number = student_number;
    }
    
    public void generatePointsAndExercises() {
        StringBuilder sb = new StringBuilder();
        count = 0;
        if(a1 != null && a1.equals("true")) {
            sb.append("1 ");
            count++;
        }
        if(a2 != null && a1.equals("true")) {
            sb.append("2 ");
            count++;
        }
        if(a3 != null && a1.equals("true")) {
            sb.append("3 ");
            count++;
        }
        if(a4 != null && a1.equals("true")) {
            sb.append("4 ");
            count++;
        }
        if(a5 != null && a1.equals("true")) {
            sb.append("5 ");
            count++;
        }
        if(a6 != null && a1.equals("true")) {
            sb.append("6 ");
            count++;
        }
        if(a7 != null && a1.equals("true")) {
            sb.append("7 ");
            count++;
        }
        if(a8 != null && a1.equals("true")) {
            sb.append("8 ");
            count++;
        }
        if(a9 != null && a1.equals("true")) {
            sb.append("9 ");
            count++;
        }
        if(a10 != null && a1.equals("true")) {
            sb.append("10 ");
            count++;
        }
        if(a11 != null && a1.equals("true")) {
            sb.append("11 ");
            count++;
        }
        if(a12 != null && a1.equals("true")) {
            sb.append("12 ");
            count++;
        }
        if(a13 != null && a1.equals("true")) {
            sb.append("13 ");
            count++;
        }
        if(a14 != null && a1.equals("true")) {
            sb.append("14 ");
            count++;
        }
        if(a15 != null && a1.equals("true")) {
            sb.append("15 ");
            count++;
        }
        if(a16 != null && a1.equals("true")) {
            sb.append("16 ");
            count++;
        }
        if(a17 != null && a1.equals("true")) {
            sb.append("17 ");
            count++;
        }
        if(a18 != null && a1.equals("true")) {
            sb.append("18 ");
            count++;
        }
        if(a19 != null && a1.equals("true")) {
            sb.append("19 ");
            count++;
        }
        if(a20 != null && a1.equals("true")) {
            sb.append("20 ");
            count++;
        }
        if(a21 != null && a1.equals("true")) {
            sb.append("21 ");
            count++;
        }
        
       exercises = sb.toString();
    }
    
    public String getHours() {
        return this.hours;
    }

    @Override
    public String toString() {
        generatePointsAndExercises();
        return "viikko " + week + ": tehtyjä tehtäviä yhteensä: " + count + " (maksimi 12), aikaa kului " + hours + " tuntia, tehdyt tehtävät: " + exercises;
    }
    
}