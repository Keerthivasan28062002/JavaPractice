package coupling;

public class ChoicOfGift implements IChoiceOfGift
{
	private Examination examination;
	ChoiceOfGift(Examination examination)
	{
		this.examination =Examination;
	}

	@Override
	public void choiceOfGift() 
	{
		examination.gift();
				
	}

}
