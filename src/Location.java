
public class Location {
	
	boolean _canNotRedirect;
	int _id;
	String _district;
	String _city;
	
	public Location (String district, String city, int id)
	{
		_canNotRedirect = false;
		_district = district;
		_city = city;
		_id = id;
	}
	
	
	public void Update()
	{
		_canNotRedirect = true;
	}
	public boolean CheckForRedirect()
	{
		return _canNotRedirect;
	}
}
