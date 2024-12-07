package org.example.dto;

public class CollegeDTO {
    private long id;
    private String myCollegeName;
    private int noOfStudents;

    public CollegeDTO() {
    }

    public CollegeDTO(long id, String myCollegeName, int noOfStudents) {
        this.id = id;
        this.myCollegeName = myCollegeName;
        this.noOfStudents = noOfStudents;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMyCollegeName() {
        return myCollegeName;
    }

    public void setMyCollegeName(String myCollegeName) {
        this.myCollegeName = myCollegeName;
    }

    public int getNoOfStudents() {
        return noOfStudents;
    }

    public void setNoOfStudents(int noOfStudents) {
        this.noOfStudents = noOfStudents;
    }

    @Override
    public String toString() {
        return "CollegeDTO{" +
                "id=" + id +
                ", myCollegeName='" + myCollegeName + '\'' +
                ", noOfStudents=" + noOfStudents +
                '}';
    }
}
