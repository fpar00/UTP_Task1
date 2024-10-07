public class Adder {
        int add(int a,int b)
        {
            return (a+b);
        }
        int add(int a,int b,int c)
        {
            return (a+b+c);
        }
        public static void main(String args[ ])
        {
            Adder ad=new Adder( );
            ad.add(40,60);
            System.out.println("Sum="+ad.add());
            ad.add(40,60,20);
            System.out.println("Sum= "+ad.add());
        }
    }