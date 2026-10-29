public class Job {
    private String company;
    private String role;
    private double minPercentage;
    private int maxBacklogs;
    private int graduationYear;

    Job(String company, String role, double minPercentage, int maxBacklogs, int graduationYear) {
        this.company = company;
        this.role = role;
        this.minPercentage = minPercentage;
        this.maxBacklogs = maxBacklogs;
        this.graduationYear = graduationYear;
    }

    public String getCompany() {
        return company;
    }

    public String getRole() {
        return role;
    }

    public double getMinPercentage() {
        return minPercentage;
    }

    public int getMaxBacklogs() {
        return maxBacklogs;
    }

    public int getGraduationYear() {
        return graduationYear;
    }
}
