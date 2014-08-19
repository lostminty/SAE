import java.util.ArrayList;


public class CorpManager {
	
	ArrayList<Corp> _corps;
	
public CorpManager()
{
	_corps = new ArrayList<Corp>();
	
}
public void AddCorp(Corp corp)
{
	_corps.add(corp);
	
	
}

public void RemoveCorp(Corp corp)
{
	_corps.remove(corp);
	
	
}
}
