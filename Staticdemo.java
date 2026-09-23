class Staticdemo
{ 
    static int x=0;
    static
    {System.out.println("static is intialised");
    static void display()
    { x=x+10;
     System.out.println("display" +x);
    }
    void print()
    { System.out.println("print" +x);
    }
    }
    class staticex{
        public static void main(string args[])
        {
            staticdemo.display();
            display();
            static demo ob=new staticdemo();
            ob.print();
            
        }
    }