import java.util.Random;

public class Dice {
static int sides;
String result;

public Dice(int sides){
	this.sides = sides;
}

public String getResult(){
	if(sides==2||sides==4||sides==6)
	return this.result;
	return "Dice with "+sides+" sides not possible";
}

public void roll(){
	
	
		Random random = new Random(); 
		int result = random.nextInt(sides)+1;
		this.result = getSide(result);
	
	
	
}

public static String getSide(int n){
	
	if(sides==2){
		switch(n){
		case 1: return "HEADS";
		case 2:return "TAILS";
		}
		
	}
	else{
		switch(n){
		case 1: return "ONE";
		case 2:return "TWO";
		case 3:return "THREE";
		case 4:return "FOUR";
		case 5: return "FIVE";
		case 6: return "SIX";
		}
	}
	
	return null;
	
}


}