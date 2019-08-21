import org.junit.*;

public class JunitBaseTest {
    
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before class Base");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Before
    public void beforeMethod() {
        System.out.println("Before test Base");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @After
    public void afterMethod() {
        System.out.println("After test Base");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("After class Base");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
