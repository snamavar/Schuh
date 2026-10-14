public class Schuh
{
    private String marke;
    private int geroesse;
    private boolean wasserdicht;
    
public Schuh(String neuMarke, int neuGeroesse, boolean neuWasserdicht)
{
    setMarke(neuMarke);
    setGeroesse(neuGeroesse);
    setWasserdicht(neuWasserdicht);
}    
public Schuh(String neuMarke,int neuGeroesse)
{
    setMarke(neuMarke);
    setGeroesse(neuGeroesse);
    setWasserdicht(false);
}
    public Schuh(String neuMarke)
{
    setMarke(neuMarke);
    setGeroesse(42);
    setWasserdicht(false);
}
    public Schuh()
{
    setMarke("adidas");
    setGeroesse(41);
    setWasserdicht(false);
}
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