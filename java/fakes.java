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
    Greeting1 sut = new Greeting1( ds );

    String actual = sut.build( "Joe", 45 );

    assertEquals( "Whazzup, Joe!", actual );
  }

  @Test
  public void should_send_an_email_message() {
    EmailService es = mock( EmailService.class );
    Greeting2 sut = new Greeting2( es );

    sut.sayHello( "Joe" );

    verify( es ).sendEmail( "Whazzup, Joe!" );
  }
}

