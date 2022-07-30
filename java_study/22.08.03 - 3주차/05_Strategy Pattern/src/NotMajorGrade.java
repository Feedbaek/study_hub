public class NotMajorGrade implements Grade {
	public String grading(Subject subject) {
		String grade = null;
		if (subject.getScorePoint() >= 90)
			grade = "A";
		else if (subject.getScorePoint() >= 80)
			grade = "B";
		else if (subject.getScorePoint() >= 70)
			grade = "C";
		else if (subject.getScorePoint() >= 55)
			grade = "D";
		else
			grade = "F";
		return grade;
	}
}
