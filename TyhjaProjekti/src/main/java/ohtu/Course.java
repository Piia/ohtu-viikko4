/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Piia Hartikka
 */

package ohtu;

public class Course {
    
    private String id;
    private String name;
    private String term;
    private String week1;
    private String week2;
    private String week3;
    private String week4;
    private String week5;
    private String week6;
    private String created_at;
    private String updated_at;
    
    public String getName() {
        return name;
    }
    
    public String getTerm() {
        return term;
    }
    
    public String getWeek(int i) {
        switch(i) {
            case 1:
                return week1;
            case 2:
                return week2;
            case 3:
                return week3;
            case 4:
                return week4;
            case 5:
                return week5;
            case 6:
                return week6;
        }
        return "";
    }

    @Override
    public String toString() {
        return "Kurssi: " + name + ", " + term;
    }
    
    
    
    

}
