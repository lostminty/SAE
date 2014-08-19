

import java.sql.Time;
import java.util.ArrayList;


public abstract class Transport {

	
	TransportType _transportType;
	Time  _leave;
	Time _arrive;
	ArrayList<Bin> _bins;
	float _capacity;
	Location _destination;
	
	public Transport(float capacity, TransportType type, Location destination)
	{
		_bins = new ArrayList<Bin>();
		_capacity = capacity;
		_transportType = type;
		_destination = destination;
	}
	public boolean AddBin(Bin bin)
	{
		if (!this.IsTooFull(bin._capacity))
		{
			_bins.add(bin);
			return true;
		}
		else
			return false;
	}

public boolean IsTooFull(float weight)
{
	float total = 0;
	for (int i=0; i < _bins.size(); i++)
	{
		total += _bins.get(i)._capacity;
	}
	
	if ((total + weight) < _capacity)
		return false;
	else
		return true;
	
}
public void Update(Time leave, Time arrive)
{
	_leave = leave;
	_arrive = arrive;
}


public abstract void IsAtCentre(boolean b, Time time);
	
}
