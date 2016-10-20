using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;

[TestClass]
public class SharedFixtureManagement {

  [TestInitialize]
  public void SetUp() {
    Debug.WriteLine( "setup" );
  }

  [TestCleanup]
  public void Cleanup() {
    Debug.WriteLine( "cleanup" );
  }

  [TestMethod]
  public void test1() {
    Debug.WriteLine( "test1" );
  }

  [TestMethod]
  public void test2() {
    Debug.WriteLine( "test2" );
  }
}
