package dzdzdz04;

public class Person
{
     String fullName;  int Age;
    Person( String name,int age)
    {
        fullName = name;
        Age = age;
    }
    Person()
    {
        fullName = null;
        Age = 0;
    }
    public void Talk()
    {
        System.out.println("Такой-то " + fullName + " говорит");
    }
    public void Move(){
        System.out.println(" ЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫЫ" );
    }
}
