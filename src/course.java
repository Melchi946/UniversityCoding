public class course {
    String courseName;
    int StudentRegistered;
    static int TotalStudentRegistered = 0;
    public course(String courseName, int StudentRegistered) {
        this.courseName = courseName;
        this.StudentRegistered = StudentRegistered;

        TotalStudentRegistered += StudentRegistered;
    }
    public void displayStudentInfo(){
        System.out.println("courseName =" +courseName);
        System.out.println("StudentRegistered =" + StudentRegistered);
    }
    public void displayPassPercentageInfo(double numberOfStudentPassed){
        double StudentPassPercentage = (numberOfStudentPassed * 100)/ StudentRegistered;
        System.out.println("StudentPassPercentage =" + StudentPassPercentage +"%");
    }

    public static void main(String[] args){
        course cs1 = new course("Computer Science", 100);
        course cs2 = new course("Business and Management", 70);
        course cs3 = new course("Mathematics", 15);
        course cs4 = new course("Software Engineering", 70);

        double average = (double)TotalStudentRegistered / 4;

        System.out.println("===============================");
        cs1.displayStudentInfo();
        cs1.displayPassPercentageInfo(65);
        System.out.println("===============================");
        cs2.displayStudentInfo();
        cs2.displayPassPercentageInfo(17);
        System.out.println("===============================");
        cs3.displayStudentInfo();
        cs3.displayPassPercentageInfo(9);
        System.out.println("===============================");
        cs4.displayStudentInfo();
        cs4.displayPassPercentageInfo(35);
        System.out.println("===============================");
        System.out.println("TotalStudentRegistered =" +TotalStudentRegistered);
        System.out.println("===============================");
        System.out.println("Average students per course =" +average);
    }
}
