describe( "life cycle tests", function() {

  var shared_data = null

  beforeEach( function() {
    console.log( "before each" );
  } )

  afterEach( function() {
    console.log( "after each" );
  } )

  it( "test1", function() {
    console.log( "test 1" );
  } )

  it( "test2", function() {
    console.log( "test 2" );
  } )

} )
