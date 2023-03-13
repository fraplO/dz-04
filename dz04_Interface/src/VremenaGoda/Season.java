package VremenaGoda;
public enum Season
{
WINTER(-8),SPRING( +12){ // для определения теплого времени года
    public String getDescription()
    {
      return " Теплое время года";
    }
}
    ,SUMMER( +165)
        {public String getDescription()
        {
            return " Теплое время года"; // для определения теплого времени года
        }}
    , AUTUMN(2);
    public String getDescription()
    {
        return " Холодное время года";
    }
private int avgTemperatura;
Season(int avgTemperatura)
{
    this.avgTemperatura = avgTemperatura;
}
public int avgTemperatura()
{
    return avgTemperatura;
}
}
