import org.junit.*;

public class LifeCycleTests {

  @Before
  public void beforEach() {
    System.out.println( "before" ); 
  }

  @After
  public void afterEach() {
    System.out.println( "after" ); 
  }

  @Test
  public void test1() {
    System.out.println( "test1" ); 
  }

  @Test
  public void test2() {
    System.out.println( "test2" ); 
  }

}
