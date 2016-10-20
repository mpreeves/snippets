var assert = chai.assert

describe( "Greeting Builder", function() {

  it( "should have a default message", function() {

    // Arrange
    var gb = new GreetingBuilder();

    // Act
    var message = gb.build();

    // Assert
    assert.equals( message , "Hello, World" );
  } );

} );
