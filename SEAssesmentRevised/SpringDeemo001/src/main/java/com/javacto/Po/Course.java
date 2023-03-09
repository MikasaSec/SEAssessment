package com.javacto.Po;

public class Course {
    private int courseId;
    private String courseName;
    private String start_name;
    private String duration;
    private String requirements;
    private String details;
    private int teacherId;
    private String teacherName;
    private int courseDirectorId;
    private int courseDirectorName;
    private double budget;

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getStart_name() {
        return start_name;
    }

    public void setStart_name(String start_name) {
        this.start_name = start_name;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) {
        this.teacherName = teacherName;
    }

    public int getCourseDirectorId() {
        return courseDirectorId;
    }

    public void setCourseDirectorId(int courseDirectorId) {
        this.courseDirectorId = courseDirectorId;
    }

    public int getCourseDirectorName() {
        return courseDirectorName;
    }

    public void setCourseDirectorName(int courseDirectorName) {
        this.courseDirectorName = courseDirectorName;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }
}
