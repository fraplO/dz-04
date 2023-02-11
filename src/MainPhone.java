package dzdzdz04;
public class MainPhone {
    public static void main(String[] args)
    {
     Phone _phone = new Phone("+79046663843","Apple",7);
     Phone _phone1 = new Phone("79046663843","Uwu");
     Phone _phone2 = new Phone();
        //Phone _phonePoPrikoly = new Phone();

        System.out.println(String.format("%s, %s, #%s",_phone._number, _phone._models,_phone._weight = 7) );//1
        System.out.println();

        System.out.println(String.format("%s, %s, #%s",_phone1._number, _phone1._models,_phone1._weight = 6) );//2
        System.out.println();

        System.out.println(String.format("%s, %s, #%s",_phone2._number, _phone2._models, _phone2._weight = 5) );
        System.out.println();
     //вызываем метод
        _phone.receiveCall("Григорий " + "+3804534535667");
        _phone1.receiveCall("ЫЫ " + "+3804534535667");
        _phone2.receiveCall0("ЫМИР, ", " +79004222222");

        _phone.sendMessage("Ценная информация ЫЫЫОАООАОАО","+79046432312");
        _phone1.sendMessage("Хочу убиться КЛАСС","+790455533322");

        Person _person1 = new Person();
        Person _person2 = new Person( "Анатолий",13);

        _person1.Move();
        _person1.Move();
        _person2.Talk();
        _person2.Talk();
    }
}