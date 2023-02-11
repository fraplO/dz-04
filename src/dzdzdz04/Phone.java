package dzdzdz04;
public class Phone
{
String _number; String _models; double _weight;

//снизу объявление методов
void sendMessage(String message, String... numbers)
{

    for (int i = 0; i < numbers.length; i++)
    {
        System.out.println("На номер: " + numbers[i] + " отправлено сообщение: \"" + message + "\" отправитель: ОЛЕГ");
    }
}
    void receiveCall(String name)  //1ый метод
    {
       System.out.println("Пользователю звонит: " + name);
    }

    void  receiveCall0(String name,String number) //перегруженный метод
    {
        System.out.println("Пользователю звонит: " + name + "номер данного пользователя:"+ number);
    }
String getNumber() //2ой метод
{
    return _number;
}
    //Создание конструкторов
    Phone(String number,String models,double weight)
    {
        _number = number;  //с 3мя переменными
        _models = models;
        _weight = weight;
    }
    Phone(String number,String models)
    {
        _number = number;  //с 2мя
        _models = models;
    }
    Phone(){ //пустой
    }

}
