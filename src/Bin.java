import java.util.ArrayList;


public class Bin {
	ArrayList<Package> _packages;
	Location _location;
		float _capacity;
		
		public static final float _binSize = 100;

public Bin(float capacity,Location location)
{
	_packages =new ArrayList<Package>();
	_capacity = capacity;
	_location = location;
}

public boolean AddPackageToBin(Package p)
{
	if (!this.IsTooFull(p._weight))
	{
		_packages.add(p);
		return true;
	}
	else
		return false;
		
}

public Package GetPackage(Package p)
{
	if  (CheckBinForPackage(p))
	{
		_packages.remove(p);
		return p;
	}
	else
		return null;
}

public boolean CheckBinForPackage(Package p)
{
	return _packages.contains(p);
}

public boolean IsBinEmpty()
{
	return _packages.isEmpty();
}

public Package RemovePackageFromBin()
{
	if (!IsBinEmpty())
	{
		Package p = _packages.get(0);
		_packages.remove(p);
		return p;
	}
	else
		return null;
	
}

public boolean IsTooFull(float weight)
{
	float total = 0;
	for (int i=0; i < _packages.size(); i++)
	{
		total += _packages.get(i)._weight;
	}
	
	if ((total + weight) < _capacity)
		return false;
	else
		return true;
	
}
}
