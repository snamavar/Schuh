public class Schuh
{
    private String marke;
    private int geroesse;
    private boolean wasserdicht;
    
    
public void setMarke(String neuMarke)
{
    marke=neuMarke;
}

public void setGeroesse(int  neuGeroesse)
{
    geroesse= neuGeroesse;
}    
    
public void setWasserdicht(boolean neuWasserdicht)
{
    wasserdicht = neuWasserdicht;
}
public String getMarke()
{
    return marke;

}
public int getGeroesse()
{
    return geroesse;
}
public boolean getWasserdicht()
{
    return wasserdicht;
}
}