package models;

import java.sql.Timestamp;

public class Project {

    private int id;
    private String projectName;
    private Timestamp creationDate;

    public Project() {}

    public Project(int id, String projectName, Timestamp creationDate) {
        this.id = id;
        this.projectName = projectName;
        this.creationDate = creationDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public Timestamp getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Timestamp creationDate) {
        this.creationDate = creationDate;
    }
}
