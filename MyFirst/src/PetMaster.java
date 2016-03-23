
public class PetMaster {

	public static void main(String[] args) {
	
		String petReaction;
		Pat myPet = new Pat();
		 myPet.eat();
		 petReaction = myPet.say("Чик!! Чирик!!");
		 System.out.println(petReaction);
		 myPet.sleep(); 

	}

}
