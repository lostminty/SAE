import java.sql.Time;


public class Package {

	boolean _pickup;
	RegisteredAddress _pickupAddress;
	Time _recieveTime;
	Time _dropOffTime;
	RegisteredAddress _dropOffAddress;
	Location _location;
	Location _arrivalLocation;
	Corp _corp;
	Update _update;
	float _weight;
	
	public Package(boolean pickup,Time recieveTime,Location location, RegisteredAddress address, Corp corp,Update update, float weight)
	{
		_pickup = pickup;
		_recieveTime = recieveTime;
		 _pickupAddress=address;
		 _location = location;
		 _corp=corp;
		 _update = update;
		 _weight=weight;
	}
	
	public boolean RedirectPackage(RegisteredAddress address)
	{
		
		if (_dropOffAddress.RegistrationCheck() && _location.CheckForRedirect())
		{
			_dropOffAddress = address;
			return true;
		}
		else
			return false;
	}
}
