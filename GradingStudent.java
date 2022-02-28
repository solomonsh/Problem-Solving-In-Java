import java.util.Arrays;

public class GradingStudent {
    public static int[] gradingStudents(int[] grades) {
        int[] result = new int[grades.length];

        for (int i = 0; i < grades.length; i++) {
            int gr = (int) grades[i];
            if ((((gr / 5 + 1) * 5) - gr < 3) && (gr / 5 + 1) * 5 >= 38) {
                result[i] = (gr / 5 + 1) * 5;

            } else {
                result[i] = grades[i];
            }

        }

        return result;

    }

    public static void main(String[] args) {
        GradingStudent gs = new GradingStudent();
        // int[] x = {73,67,38,33};
        int[] x = { 84, 29, 57 };
        System.out.println(Arrays.toString(GradingStudent.gradingStudents(x)));
    }

}
