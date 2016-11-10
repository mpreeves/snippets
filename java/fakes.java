package example;

import java.util.*;
import java.io.*;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.*;

public class MockingExample {

  @Test
  public void should_build_a_greeting_based_on_age() {
    DataService ds = mock( DataService.class );
    when( ds.getMessageBasedOnAge( 45 ) ).thenReturn( "Whazzup" );
    Greeting g = new Greeting( ds );

    String message = g.build( "Joe", 45 );

    assertEquals( "Whazzup, Joe!", message );
  }

  @Test
  public void should_send_an_email_message() {
    EmailService es = mock( EmailService.class );
    Greeting g = new Greeting( es );

    g.sayHello( "Joe" );

    verify( es ).sendEmail( "Whazzup, Joe!" );
  }
}
