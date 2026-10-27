class Box<T>{

    private T value;

   void setValue(T value)
{
     this.value=value;
}

  T getValue()
{
    return value;
}

}

class GenericDemo{
       
    public static <T> void display(T value)
{
     System.out.println("Value:"+value);

}

public static void main(String[] args)
{
       
    Box<Integer> intBox=new Box<>();
    intBox.setValue(20);
    Box<String> stringBox=new Box<>();
    stringBox.setValue("Hello");
    Box<Double> doubleBox=new Box<>();
    doubleBox.setValue(20.67);

   display(34);
   display("HI");




}




}