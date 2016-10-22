package behavioral.command;

public class Client
{

	public static void main(String[] args)
	{
		Light light1 = new Light();
		Light light2 = new Light();

		LightOffCommand offCommand = new LightOffCommand(light1);
		LightOnCommand onCommand = new LightOnCommand(light2);

		RemoteInvoker invoker = new RemoteInvoker();

		invoker.setCommand(1, onCommand, offCommand);

		invoker.offButtonWasPushed(1);
		invoker.onButtonWasPushed(1);
	}
}
