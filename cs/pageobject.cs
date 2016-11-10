[TestClass]
public class LoginTests : SeleniumTests {

  [TestMethod]
  public void valid_users_are_navigated_to_welcome_page() {
    LoginPage login = new LoginPage(this.driver);
    login.Creditials = new Credentials() {
      Name = "joe", Password = "valid" };
    
    Page page = login.InitiateLogin();

    Assert.AreEqual( "Welcome Page", page.Title );
  }

  [TestMethod]
  public void invalid_users_are_navigated_to_an_error_page() {
    LoginPage login = new LoginPage(this.driver);
    login.Creditials = new Credentials() {
      Name = "joe", Password = "invalid" };
    
    Page page = login.InitiateLogin();

    Assert.AreEqual( "Error Page", page.Title );
  }
}
