var assert = chai.assert;

describe( "test doubles", function() {

  it( "should build a greeting based on age", function() {
    var ds = new DataService();

    sinon.stub( ds, "getMessageBasedOnAge" )
      .withArgs( 20 )
      .returns( "Yo" );

    var g = new Greeting( ds );

    var message = g.build( "Joe", 20 );

    assert.equal( message, "Yo, Joe!" );
  } );

  it( "should send an email message", function() {
    var es = new EmailService();

    var expectation = sinon
      .mock( es )
      .expects( "sendEmail" )
      .withArgs( "Whazzup, Joe!" );

    var g = new Greeting( es );

    g.sayHello( "Joe" );

    expectation.verify();
  } );

} );
