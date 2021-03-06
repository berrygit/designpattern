package creational.builder;

public class MazeDirector
{
	public void createMaze(MazeBuilder builder)
	{
		builder.buildMaze();

		builder.buildRoom(1);
		builder.buildRoom(2);
		builder.buildDoor(1, 2);
	}
}
