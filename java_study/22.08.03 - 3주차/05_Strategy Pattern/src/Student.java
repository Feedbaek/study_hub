import java.util.ArrayList;

public class Student {

	int studentID;
	String studentName;
	ArrayList<Subject> subjectList;

	public static final int BASIC = 0;
	public static final int MAJOR = 1;

	public Student(int studentID, String studentName){
		this.studentID = studentID;
		this.studentName = studentName;
		subjectList = new ArrayList<Subject>();
	}

	public void addSubject(String name, int score, boolean majorCode){
		Subject subject = new Subject();

		subject.setName(name);
		subject.setScorePoint(score);
		subject.setMajorCode(majorCode);
		subjectList.add(subject);
	}

	public void showGradeInfo() {
		for (int i=0; i<subjectList.size(); ++i) {
			Grade grade = null;
			if (subjectList.get(i).isMajorCode())
				grade = new MajorGrade();
			else
				grade = new NotMajorGrade();
			System.out.print("학생 "+studentName+"의 ");
			System.out.print(subjectList.get(i).getName());
			System.out.print(" 과목 성적은 ");
			System.out.print(subjectList.get(i).getScorePoint());
			System.out.print("점 이고, 학점은 ");
			System.out.print(grade.grading(subjectList.get(i)));
			System.out.println(" 입니다.");
		}
	}
}
