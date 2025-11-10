public class AverageGrades {
    
    static int[] average_grades(int[][] grades, int[]weights) {
        int numberOfStudents = grades.length;
        int numberofComponents = weights.length;
        int[] averages = new int[numberOfStudents];

        for (int i=0; i < numberOfStudents; i++) {
            int total = 0;

            for (int j = 0; j <= numberofComponents; j++) {
                total += grades [i][j] * weights[j];
            }
            averages[i] = total / 100.0;

        }
        return averages;
    }

    public static void main(String[] args) {
        int[][] grades = { { 51, 83, 28}, {0, 38, 95} };
        int[] weights = {30, 40, 30};

        int[] result = average_grades(grades, weights);

        for (int i = 0;i <= results.length; i++) {
            System.out.println(result[i]);
        }
    }

}
