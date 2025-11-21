public class ArrayAverage {
    public static void main(String[] args) {

        int[][] scores = {
            {63, 90, 75, 45, 81},
            {85, 100, 95, 80, 90},
            {100}
        };

        for (int i = 0; i < scores.length; i++) {
            int sum = 0;

            for (int j = 0; j < scores[i].length; j++) {
                System.out.print(scores[i][j] + " ");
                sum += scores[i][j]; 
            }

            // average = sum / count
            double avg = (double)sum / scores[i].length;

            System.out.printf("| %.1f\n", avg); 
        }
    }
}

