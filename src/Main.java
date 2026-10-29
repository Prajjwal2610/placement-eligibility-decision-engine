import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.next();
        double percentage = scanner.nextDouble();
        int backlogs = scanner.nextInt();
        int graduationYear = scanner.nextInt();

        Candidate candidate = new Candidate(name, percentage, backlogs, graduationYear);

        Job job = new Job("Infosys", "Java Developer", 65.0, 0, 2026);

        boolean percentagePass = candidate.getPercentage() >= job.getMinPercentage();

        boolean backlogsPass = candidate.getBacklogs() <= job.getMaxBacklogs();

        boolean yearPass = candidate.getGraduationYear() == job.getGraduationYear();

        boolean eligible = percentagePass && backlogsPass && yearPass;

        System.out.println("=====================================");
        System.out.println("PLACEMENT ELIGIBILITY RESULT");
        System.out.println("=====================================");
        System.out.println();

        System.out.println("Candidate: " + candidate.getName());
        System.out.println("Company: " + job.getCompany());
        System.out.println("Role: " + job.getRole());

        if (percentagePass) {
            System.out.println("Percentage : PASS");
        } else {
            System.out.println("Percentage : FAIL");
        }

        if (backlogsPass) {
            System.out.println("Backlogs : PASS");
        } else {
            System.out.println("Backlogs : FAIL");
        }

        if (yearPass) {
            System.out.println("Gradution Year : PASS");
        } else {
            System.out.println("Gradution Year : FAIL");
        }

        System.out.println();

        if (eligible) {
            System.out.println("Final Result : PASS");
        } else {
            System.out.println("Final Result : FAIL");
        }

        System.out.println("=====================================");

        scanner.close();
    }
}