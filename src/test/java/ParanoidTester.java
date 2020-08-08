import org.junit.*;

public class ParanoidTester {

    SomeMethods someMethods;

    @Before
    public void init(){
        System.out.println("--init SomeMethods--");
        someMethods = new SomeMethods();
    }

    @Test
    public void method1_test1(){
        Assert.assertArrayEquals(new int[]{1, 2, 3}, someMethods.getArrayPastLast4(new int[]{4, 1, 2, 3}));
    }

    /*@Test(expected = RuntimeException.class)
    public void method1_test2(){
        someMethods.getArrayPastLast4(new int[]{0, 1, 2, 3});
    }*/

    @Test
    public void method1_test2() throws RuntimeException{
        try {
            someMethods.getArrayPastLast4(new int[]{0, 1, 2, 3});
            Assert.fail("Должно быть исключение!");
        } catch (RuntimeException e){
            Assert.assertEquals("В массиве нет значения \"4\"", e.getMessage());
        }

    }

    @Test
    public void method1_test3(){
        Assert.assertArrayEquals(new int[]{}, someMethods.getArrayPastLast4(new int[]{4, 1, 2, 3, 4}));
    }

    @Test
    public void method2_test1(){
        Assert.assertTrue(someMethods.is1and4exist(new int[]{4, 1, 2, 3, 4}));
    }

    @Test
    public void method2_test2(){
        Assert.assertFalse(someMethods.is1and4exist(new int[]{4, 7, 8, 3, 4}));
    }

    @Test
    public void method2_test3(){
        Assert.assertTrue(someMethods.is1and4exist(new int[]{1, 4, 2, 3, 4}));
    }

    @After
    public void shutdown(){
        System.out.println("--end test--");
    }

}
