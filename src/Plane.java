



import java.sql.Time;
import java.util.ArrayList;


public class Plane extends Transport {

	
	public Plane(Time leave, Time arrive, float capacity, TransportType type,Location destination)
	{
		super(capacity, type, destination);
				
	}

	@Override
	public void IsAtCentre(boolean b, Time time) {
		// TODO Auto-generated method stub
		
	}
	
	
}
