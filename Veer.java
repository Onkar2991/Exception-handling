package ExceptionHandling;

public class Veer  {
    int a =10; //causes exception

    public static void main(String[] args) {
//        try
//        {
//            Veer v=null;
//            System.out.println(v.a);
//        }
//        catch(NullPointerException o)
//        {
//
//            System.out.println("exception handled");
//        }
       // Abc h= new Abc();   exception occured

       try
       {
           Abc h= new Abc();
           h.show();
       }
       catch (NullPointerException o)
       {
           System.out.println("exception handled");
       }



    }

}
class Abc{
    void show() throws NullPointerException
    {
//        int a=10;
        Veer f= null;
        System.out.println(f.a);
    }
}


