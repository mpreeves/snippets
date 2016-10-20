using System;
using Microsoft.VisualStudio.TestTools.UnitTesting;

[TestClass]
public class GreetingBuilderTests
{
  [TestMethod]
  public void should_build_a_default_message()
  {
    // Arrange
    GreetingBuilder gb = new GreetingBuilder();

    // Act
    string message = gb.Build();

    // Assert
    Assert.AreEqual("Hello, World", message);
  }
}
