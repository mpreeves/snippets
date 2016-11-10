using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;
using NSubstitute;

[TestClass]
public class TestDoubleTests {

  [TestMethod]
  public void Should_Calculate_PoperValue() {

    IDataService ds = Substitute.For<IDataService>();

    ds.LookupMultiplier().Returns( 2 );

    Foo f = new Foo( ds );

    int actual = f.CalculateValueWithDataLookup( 5 );

    Assert.AreEqual( 10, actual );
  }

  [TestMethod]
  public void Should_Send_AnEmail() {

    IEmailService es = Substitute.For<IEmailService>();

    Bar b = new Bar( es );

    b.DoSomethingThatSendsAnEmail();

    es.Received().Send( "message sent via email" );
  }
}
