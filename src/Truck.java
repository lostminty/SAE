

import java.sql.Time;


public class Truck extends Transport {
	
	boolean _atCentre;
	public Truck(Time leave, Time arrive, float capacity, TransportType type, Location location)
	{
		super( capacity, type, location);
		_atCentre = true;
		
	}
	
	public void  IsAtCentre(boolean e, Time time)
	{
		_atCentre = e;
		if (e)
			_arrive = time;
		else
			_leave = time;
	}

	
	public boolean CheckAtCentre()
	{
		return _atCentre;
	}
}
