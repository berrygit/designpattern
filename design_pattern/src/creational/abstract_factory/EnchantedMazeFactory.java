package creational.abstract_factory;

public class EnchantedMazeFactory extends MazeFactory
{

	/*
	 * (non-Javadoc)
	 * 
	 * @see creational.abstract_factory.MazeFactory#makeRoom()
	 */
	@Override
	public Room makeRoom(int n)
	{
		return new EnchantedRoom(n);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see creational.abstract_factory.MazeFactory#makeDoor()
	 */
	@Override
	public Door makeDoor()
	{
		// TODO Auto-generated method stub
		return null;
	}

}
