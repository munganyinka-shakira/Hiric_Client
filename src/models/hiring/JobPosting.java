package models.hiring;

import java.util.Date;

public class JobPosting {
    private Integer id;
    private Integer jobId;
    private Integer userId;
    private String jobTitle;
    private String jobDescription;
    private String jobRequirements;
    private String location;
    private Date startDate;
    private String duration;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getJobId() {
        return jobId;
    }

    public void setJobId(Integer jobId) {
        this.jobId = jobId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }

    public String getJobRequirements() {
        return jobRequirements;
    }

    public void setJobRequirements(String jobRequirements) {
        this.jobRequirements = jobRequirements;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Long getSalary() {
        return salary;
    }

    public void setSalary(Long salary) {
        this.salary = salary;
    }

    private Long salary;

    public JobPosting(Integer id,Integer jobId, Integer userId, String jobTitle, String jobDescription, String jobRequirements, String location, Date startDate, String duration, Long salary) {
        this.id = id;
        this.jobId = jobId;
        this.userId = userId;
        this.jobTitle = jobTitle;
        this.jobDescription = jobDescription;
        this.jobRequirements = jobRequirements;
        this.location = location;
        this.startDate = startDate;
        this.duration = duration;
        this.salary = salary;
    }
    @Override
    public String toString() {
        return "JobPosting{" +
                "jobId=" + jobId +
                "userId=" + userId +
                ", jobTitle=" + jobTitle +
                ", jobDescription='" + jobDescription + '\'' +
                ", jobRequirements=" + jobRequirements +
                ", location=" + location +
                ", startDate=" + startDate +
                ", duration=" + duration +
                ", salary=" + salary +
                '}';
    }
}