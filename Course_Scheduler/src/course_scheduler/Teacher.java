/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course_scheduler;

/**
 *
 * @author Myk
 */
public class Teacher {
    String name;
    Course[] courses = new Course[3];
    String[] teachableCourses = new String[3];
    String timePreference;
    
    public Teacher(String name, String course1, String course2, String course3, String timePreference) {
        this.name = name;
        this.teachableCourses[0] = course1;
        this.teachableCourses[1] = course2;
        this.teachableCourses[2] = course3;
        this.timePreference = timePreference.split(": ")[1];
    }
    
    public void test() {
        System.out.println("test");
    }
    
    @Override
    public String toString () {
        return "Name = " + name + "; Course 1 = " + teachableCourses[0] + "; Course 2 = " + teachableCourses[1] + "; Course 3 = " + teachableCourses[2] + "; Preferred Time = " + timePreference;
    }
}