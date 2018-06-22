public class Test {

	public static void main(String[] args) {
		
		Dice dice  = new Dice(6);
		dice.roll();
		System.out.println(dice.getResult());
	}
	
}