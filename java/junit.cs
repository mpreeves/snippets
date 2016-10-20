import org.junit.*;

public class GreetingBuilderTests {

  @Test
  public void should_build_a_default_message() {

    // Arrange
    GreetingBuilder gb = new GreetingBuilder();

    // Act
    String message = gb.build();

    // Assert
    assertEquals( "Hello, World", message );
  }

}
