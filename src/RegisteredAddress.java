
public class RegisteredAddress {
	
	boolean _isRegistered;
	String _name;
	String _address;
	Location _loc;
	

	public RegisteredAddress(boolean registered, String name, String address, Location loc)
	{
		 _isRegistered = registered;
		 _name = name;
		 _address = address;
		 _loc = loc;
	}
	
	public boolean RegistrationCheck()
	{
		return _isRegistered;
	}
}
