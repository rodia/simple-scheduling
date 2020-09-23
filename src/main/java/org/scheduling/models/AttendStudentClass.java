package org.scheduling.models;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AttendStudentClass {
    private int studentId;
    private String code;
    private String semester;

    public AttendStudentClass() {
    }

    @JsonProperty
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    @JsonProperty
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty
    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
}
