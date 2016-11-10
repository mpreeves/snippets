using System;
using System.Diagnostics;
using Microsoft.VisualStudio.TestTools.UnitTesting;

[TestClass]
public class LifecycleTests {

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
