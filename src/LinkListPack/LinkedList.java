package LinkListPack;
class MAin
{
    public void print()
    {
        System.out.println ("\"hello\" = " + "main");
    }

}
class Test extends MAin
{
    public void print()
    {
        System.out.println ("\"hello\" = " + "hello");
    }


    public static void main(String[]args){
        MAin test
                = new Test ();
        test.print ();
        }

}