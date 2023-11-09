package coupling;

public class Person 
{
	public static void main(String args[])
	{
		Examination gift1=new Bike();
		Examination gift2=new Cycle();
		IChoiceOfGift newgift=new ChoiceOfGift(gift1);
		newgift.choiceOfGift();
	}

}
