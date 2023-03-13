package VremenaGoda;
public class MainSeason
{
    public static void main(String[] args)
    {
        Season season = Season.SPRING;
        System.out.println(season);
        print(Season.SPRING);
        SpecialnoDlyaTemperat();
    }
    public static  void SpecialnoDlyaTemperat()
    {
        for(Season seas: Season.values())
        {
            System.out.println(seas + " " + seas.avgTemperatura()+ "°C" + seas.getDescription());
        }
    }
    public static void print(Season season)
    {
        switch (season)
        {
            case WINTER:
                System.out.println(" Я люблю зиму");
                break;
            case SPRING:
                System.out.println(" Я люблю весну");
                break;
            case SUMMER:
                System.out.println(" Я люблю лето");
                break;
            case AUTUMN:
                System.out.println(" Я люблю осень");
                break;
        }
    }
}
