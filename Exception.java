package ExceptionHandling;

public class Exception {

    void add()throws ArithmeticException{

        int a=5;
        int b=0;
        int d=a/b;
        System.out.println(d);
    }
    public static void main(String[] args) {
        Exception aa= new Exception();
        aa.add();

//        int a=5;
//        int b=0;
//        int d=a/b;    casues arithmaticException
//        try{
//            int d=a/b;
//            System.out.println(d);
//        }
//        catch (ArithmeticException e)
//        {
//            System.out.println("exception handled");
//        }

    }

}
class Akee{
    public static void main(String[] args) {

        Exception bb=new Exception();
//        bb.add();     casues exception
        try
        {
            bb.add();
        }
        catch(ArithmeticException e)
        {
            System.out.println("exception handled");
        }

    }

}