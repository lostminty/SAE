import java.util.ArrayList;


public class Corp {

	String _id;
	String _name;
	ArrayList<RegisteredAddress> _addresses;
	Update _defaultUpdate;
	
	
	public Corp(String id, String name,Update update)
	{
		_id = id;
		_name = name;
		_addresses = new ArrayList<RegisteredAddress>();
		_defaultUpdate = update;
		
	}
}
