package structural.adapter;

public class DuckTestDriver
{
	public static void main(String[] args)
	{
		MallardDuck duck = new MallardDuck();

		WildTurkey turkey = new WildTurkey();

		Duck turkeyDapater = new TurkeyAdapter(turkey);

		testDuck(duck);
		testDuck(turkeyDapater);

	}

	public static void testDuck(Duck duck)
	{
		duck.fly();
		duck.quack();
	}

}
