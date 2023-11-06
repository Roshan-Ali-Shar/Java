public class Students_Record {
   	 public static void main(String[] args) {
        String studentData = "ROSHAN_ALI_SHAR:97, iRFAN:92, YASIR:78, GULZAR:95, AAMIR:88, MAHA:79, UROOJ:90,  AMJAD_ALI_NAPER:65,  AFTAB:79";
        // Split the studentData into individual records
    	String[] records = studentData.split(", ");
        int numStudents = records.length;
        // Arrays to store student names and scores
    	String[] studentNames = new String[numStudents];
        int[] studentScores = new int[numStudents];
        // Populate the arrays with data from split records
  	for (int i = 0; i < numStudents; i++) {
            String[] parts = records[i].split(":");
            if (parts.length != 2) {
                System.out.println("Invalid data format: " + records[i]);
                return;
            }
            studentNames[i] = parts[0];
            try {
                studentScores[i] = Integer.parseInt(parts[1]);
            } catch (NumberFormatException e) {
                System.out.println("Invalid score for student " + studentNames[i]);
                return;
            }
        }
        // Calculate and display statistics
        int totalScore = 0;
        int highestScore = Integer.MIN_VALUE;
        int lowestScore = Integer.MAX_VALUE;
        String highestScorer = "";
        String lowestScorer = "";
        for (int i = 0; i < numStudents; i++) {
            totalScore += studentScores[i];
 
            if (studentScores[i] > highestScore) {
                highestScore = studentScores[i];
                highestScorer = studentNames[i];
            }
            if (studentScores[i] < lowestScore) {
                lowestScore = studentScores[i];
                lowestScorer = studentNames[i];
            }
        }
        System.out.println("Total number of students: " + numStudents);
        System.out.println("Average score of all students: " + (totalScore / (double) numStudents));
        System.out.println("Highest score: " + highestScore + " achieved by " + highestScorer);
        System.out.println("Lowest score: " + lowestScore + " achieved by " + lowestScorer);
   	 }
	}
