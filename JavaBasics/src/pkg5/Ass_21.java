package pkg5;

public class Ass_21 {
	
	
	void ValidateScore(int Score)
	{
		if (Score==0 || Score<=100)
			
			{
			System.out.println("Valid Score");
			}
		else
		{
			System.out.println("Invalid Score");
		}
		
	}
	
void validateScore(int Score, int passingScore)
{
	if (Score>=50 || passingScore==35)
	{
		System.out.println("Student passed by Passing marks");
	}
	
	else
	{
		System.out.println("Student score good marks");
	}
}
void validateScore(int Score, int passingScore, boolean isBonus)
{
	if ((Score>=passingScore) && true )
	{
		System.out.println("Excellent student");
	}
	
	else
	{
		System.out.println("Average report");
	}
}
	public static void main(String[] args) {

		Ass_21 PS = new Ass_21();
		PS.ValidateScore(67);
		PS.validateScore(50, 36);
		PS.validateScore(50, 20, true);
		
	}

}
