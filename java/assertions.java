public class AssertionTests {

  @Test
  public void return_based_assertion() {

    String message = GreetingBuilder.build();

    areEquals( "Hello, World", message );
  }

  @Test
  public void state_based_assertion() {

    GreetingBuilder sut = new GreetingBuilder();

    sut.build();

    Assert.AreEqual( "Hello, World", sut.getMessage() );
  }

  @Test
  public void interaction_based_assertion() {

    EmailService es = mock( EmailService.class );
    GreetingBuilder sut = new GreetingBuilder( es );

    sut.sayHello( "Joe" );

    verify( es ).sendEmail( "Whazzup, Joe!" );
  }

}
