
public class Fish extends Pat {

	int currentDepth=0;
	
	public int dive(int howDeep){
		currentDepth=currentDepth + howDeep;
		if(currentDepth>100){
			System.out.println("� ��, �������� � ����� ��������?");
			currentDepth=currentDepth - howDeep;
		} else {
		System.out.println("��������� �� " + howDeep + " �����");
		System.out.println("����, � �� " + currentDepth + " ����� ���� ������ ����");}
		return currentDepth; 
	}
	public String say(String something){
		System.out.println("�� �� �� � ������? ���� �� ���������");
	return "�� �� �� � ������? ���� �� ���������";
	}
}