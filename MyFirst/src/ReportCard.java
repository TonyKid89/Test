public class ReportCard {

			public char convertGrades (int testResult) {
			char grade;
			if (testResult>=90){
				grade = 'A';
			} else if (testResult<90 & testResult>=82){
				grade = 'B';
			} else if (testResult<82 & testResult>=75){
				grade = 'C';
			} else {
				grade = 'D';
			}
			return grade;
		}
		/*	public static void main(String[] args) {
				ReportCard rc = new ReportCard();
				char yourGrade = rc.convertGrades(80);
				System.out.println("��� ������� " + yourGrade);
				yourGrade = rc.convertGrades(6);
				System.out.println("� � ��������� " + yourGrade);
				}*/
			public static void main(String[] args) {
				ReportCard rc = new ReportCard();
				char yourGrade = rc.convertGrades(75);
				switch (yourGrade){
					case 'A':
					System.out.println("��� " + yourGrade + " �����");
					break;
					
					case'B':
					System.out.println("Man, " + yourGrade + " is awesome");
					break;
					
					case'C':
					System.out.println("Cool");
					break;
					
					case'D':
					System.out.println("Fuck off. Looser");
					break;
				}
				}

}
