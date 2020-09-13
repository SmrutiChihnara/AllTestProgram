package LinkListPack;
class Spring
{
    private static Spring instance;

    private Spring(){}
    public static Spring getInstance()
    {
        if(instance==null)
        {
            return instance=new Spring ();
        }
        else return instance;
    }
}



public class SingleTone {
    public static void main(String[] args) throws Exception {
        Spring spring= Spring.getInstance ();
        Spring spring1= Spring.getInstance ();
        System.out.println (spring.equals (spring1));
        Spring spring2= (Spring)Class.forName ("LinkListPack.Spring").newInstance ();
        System.out.println (spring.equals (spring2));
    }
}
