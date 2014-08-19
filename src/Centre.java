import java.sql.Time;
import java.util.ArrayList;
public class Centre {

	String _id;
	Location _loc;
	ArrayList<Bin> _bins;
	TruckManager _trucks;
	PlaneManager _planes;


	
	public Centre(String id, Location loc) {
		_id = id;
		_loc = loc;
		_bins = new ArrayList<Bin>();
		_trucks = new TruckManager();
		_planes = new PlaneManager();
	}

	public void LoadPackageToBin(Package p) {

		for (int i = 0; i < _bins.size(); i++) {
			if (_bins.get(i)._location._id == p._dropOffAddress._loc._id)
				if (_bins.get(i).AddPackageToBin(p))
					break;

		}

		_bins.add(new Bin(Bin._binSize, p._dropOffAddress._loc));
		_bins.get(_bins.size() - 1).AddPackageToBin(p);
	}

	public void LoadTransport() {

		for (int j = 0; j < _bins.size(); j++)
		{
			if (_bins.get(j)._location == _loc)
			{
				for (int i=0; i < _trucks._transporters.size(); i++)
				{
					
					if (_trucks._transporters.get(i).AddBin(_bins.get(i)))
							{
								break;
							}
				}
			}
			else
			{
				for (int i =0; i < _planes._transporters.size(); i++)
				{
					if (_planes._transporters.get(i)._destination == _bins.get(j)._location )
					{
						_planes._transporters.get(i).AddBin(_bins.get(j));
						break;
					}
				}
			}
		}
		
	

	}	
	public void ReleaseTheTrucks(Time time)
	{
		for (int i =0; i < _trucks._transporters.size(); i++)
		{
			_trucks._transporters.get(i).IsAtCentre(true,time );
		}
	}
}
