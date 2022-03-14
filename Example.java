import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class Example {

    public static void main(String []args) {
    int a=25; 
    int b=25;
    int c=high(a,b);
    System.out.println("the highest: "+c);
    }    

    public static int high(int a , int b) {
        if (a>b)
        return a;
        else 
        return b;
    }

    @Test
    public void testhigh()
    {
        assertEquals(25 , high(25, 25));
        assertEquals(5 , high(3,5));
    }
}
