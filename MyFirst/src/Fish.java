
public class Fish extends Pat {

	int currentDepth=0;
	
	public int dive(int howDeep){
		currentDepth=currentDepth + howDeep;
		if(currentDepth>100){
			System.out.println("ті че, офанарел с такой глубиной?");
			currentDepth=currentDepth - howDeep;
		} else {
		System.out.println("Заныриваю на " + howDeep + " футов");
		System.out.println("Йопт, я на " + currentDepth + " футов ниже уровня моря");}
		return currentDepth; 
	}
	public String say(String something){
		System.out.println("Ты че не в курсах? рыбы не треплятся");
	return "Ты че не в курсах? рыбы не треплятся";
	}
}