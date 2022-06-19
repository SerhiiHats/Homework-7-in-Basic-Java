package employee;

public class Worker implements Comparable<Worker>{
   private String name;
   private String jobTitle;
   private int yearOFJob;

    public Worker(String name, String jobTitle, int yearOFJob) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.yearOFJob = yearOFJob;
    }

    public Worker() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public int getYearOFJob() {
        return yearOFJob;
    }

    public void setYearOFJob(int yearOFJob) {
        this.yearOFJob = yearOFJob;
    }

    @Override
    public String toString() {
        return "Фамилия и инициалы работника: " + name +
                ", должность: " + jobTitle +
                ", год принятия на работу: " + yearOFJob +
                " г.  ";
    }

    @Override
    public int compareTo(Worker obj) {
        return name.compareTo(obj.name);
    }
}
