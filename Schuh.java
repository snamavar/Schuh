public class Schuh
{
    private String marke;
    private int geroesse;
    private boolean wasserdicht;
    
public Schuh(String marke, int geroesse, boolean wasserdicht)
{
    setMarke(marke);
    setGeroesse(geroesse);
    setWasserdicht(wasserdicht);
}    
public Schuh(String marke,int geroesse)
{
    setMarke(marke);
    setGeroesse(geroesse);
    setWasserdicht(false);
}
    public Schuh(String marke)
{
    setMarke(marke);
    setGeroesse(42);
    setWasserdicht(false);
}
    public Schuh()
{
    setMarke("adidas");
    setGeroesse(41);
    setWasserdicht(false);
}
public void setMarke(String marke)
{
    this.marke=marke;
}

public void setGeroesse(int  geroesse)
{

        if ((geroesse>=30) && (geroesse<=50))
        {
            this.geroesse = geroesse;
        }
        else
        {
            System.out.println("Fehler: ungültige Geroesse!");
            this.geroesse = 40;
        }
}    
    
public void setWasserdicht(boolean wasserdicht)
{
    this.wasserdicht = wasserdicht;
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