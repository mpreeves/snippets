using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using NSubstitute;

[TestClass]
public class TestDoubleTests {

  [TestMethod]
  public void should_build_a_greeting_base_on_age() {
    IDataService ds = Substitute.For<IDataService>();
    ds.GetMessageBaseOnAge( 45 ).Returns( "Whazzup" );
    Greeting1 sut = new Greeting1( ds );

    string actual = sut.Build( "Joe", 45 );

    Assert.AreEqual( "Whazzup, Joe!", actual );
  }

  [TestMethod]
  public void should_send_an_email_message() {
    IEmailService es = Substitute.For<IEmailService>();
    Greeting2 sut = new Greeting2( es );

    sut.SayHello( "Joe" );

    es.Received().SendEmail( "Whatup, Joe!" );
  }
}

